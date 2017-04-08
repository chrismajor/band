package io.chrismajor.bandname

//import io.chrismajor.bandname.wiki.TitleGenerator
//
//def generator = new TitleGenerator()
//println generator.getTitle()

// TODO: use non-deprecated stuff here :/
def config = new ConfigSlurper().parse(new File("config/NamingPatterns.groovy").toURL())

config.namingPatterns.each { String pattern ->
    pattern.toLowerCase().split("noun").each {
        println "'$it'"
    }
}