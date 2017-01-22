package io.chrismajor.bandname

class TitleGenerator {
	// TODO: logging https://dzone.com/articles/log4j-groovy-way

	/** XML parser */
	XmlParser parser
	
	/** Constructor. Set up xml parser */
	TitleGenerator() {
		parser = new XmlParser()
		parser.setFeature("http://apache.org/xml/features/disallow-doctype-decl", false)
		parser.setFeature("http://apache.org/xml/features/nonvalidating/load-external-dtd", false)
	}
	
	/** return a valid, nicely formatted title */
	String getTitle() {
		String title
		boolean valid = false
		
		while (!valid) {
			title = grabTitleFromWeb()
			title = filterTitle(title)
			valid = isValid(title)
		}
		
		return title
	}
	
	/** call off to Wikipedia to grab a new title! */
	private String grabTitleFromWeb() {
		// get the raw HTML from a random article
		def wikiTxt = new URL("https://en.wikipedia.org/wiki/Special:Random").getText()
		
		// parse the HTML
		def wikiXml = parser.parseText(wikiTxt)
		
		// grab the title from the relevant HTML element
		return wikiXml.depthFirst().find {
			it.@id == "firstHeading"
		}.text()
	}
	
	/** filter a title */
	private String filterTitle(String title) {
		// remove the bracket suffix (if exists)
		String filteredTitle = title.split("\\(")[0]
		return filteredTitle
	}
	
	/** validate a title */
	private boolean isValid(String title) {
		def words = title.split(" ").size()
		def length = title.length()
		
		return words < 5 && length < 35
	}
}