/*
Groovy script to act as configuration for band name patterns
To be used in conjunction with groovy.util.ConfigSlurper
 */
namingPatterns = [
    "The [adjective] [nouns]",
//    "[name] and the [nouns]",
//    "[name]'s [noun]",
//    "[verb]ing [name]",
    "[noun]",
    "The [nouns]",
//    "[3-7] [noun]s",
    "[adjective] [adjective]",
    "[pronoun] [verb]s",
//    "[adverb] [colour]",
//    "The [full-name] experience",
//    "The [name] [verb] experience"
]