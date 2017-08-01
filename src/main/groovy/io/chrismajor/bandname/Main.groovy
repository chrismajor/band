package io.chrismajor.bandname

import io.chrismajor.bandname.tokens.TokenTypes

//import io.chrismajor.bandname.wiki.TitleGenerator
//
//def generator = new TitleGenerator()
//println generator.getTitle()

// TODO: use non-deprecated stuff here :/
def config = new ConfigSlurper().parse(new File("config/NamingPatterns.groovy").toURL())
println ""

// get a random pattern from the config file
int patternCount = config.namingPatterns.size()
println "patternCount :: $patternCount"

int randomElement = new Random().nextInt(patternCount)
println "randomElement :: $randomElement"

String pattern = config.namingPatterns.get(randomElement)
println "pattern :: $pattern"

// for each of the token types, replace the token as necessary with a token value
TokenTypes.getEnumConstants().each { token ->
    def propertyToken = "[$token.name]"

    println ""
    println "propertyToken          :: $propertyToken"
    println "pattern contains token :: ${pattern.contains(propertyToken)}"

    if (pattern.contains(propertyToken)) {
        println "token replacement value :: ${token.tokenFactory.getTokenValue().capitalize()}"
        pattern = pattern.replace(propertyToken, token.tokenFactory.getTokenValue().capitalize())
    }
}

println ""
println "processed pattern :: $pattern"