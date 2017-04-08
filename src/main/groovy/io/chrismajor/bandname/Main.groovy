package io.chrismajor.bandname

//import io.chrismajor.bandname.wiki.TitleGenerator
//
//def generator = new TitleGenerator()
//println generator.getTitle()

def config = new ConfigSlurper().parse(new URL("config/NamingPatterns.groovyo"))
config.namingPatterns.each {
    println it
}