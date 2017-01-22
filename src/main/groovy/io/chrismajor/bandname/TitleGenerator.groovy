package io.chrismajor.bandname

class TitleGenerator {
	XmlParser parser
	
	TitleGenerator() {
		parser = new XmlParser()
		parser.setFeature("http://apache.org/xml/features/disallow-doctype-decl", false)
		parser.setFeature("http://apache.org/xml/features/nonvalidating/load-external-dtd", false)
	}
	
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
	
	private String grabTitleFromWeb() {
		def wikiTxt = new URL("https://en.wikipedia.org/wiki/Special:Random").getText()
		def wikiXml = parser.parseText(wikiTxt)
		
		return wikiXml.depthFirst().find {
			it.@id == "firstHeading"
		}.text()
	}
	
	private String filterTitle(String title) {
		String filteredTitle = title.split("\\(")[0]
		return filteredTitle
	}
	
	private boolean isValid(String title) {
		def words = title.split(" ").size()
		def length = title.length()
		
		return words < 5 && length < 35
	}
}