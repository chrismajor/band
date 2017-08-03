package io.chrismajor.bandname.api

/**
 * DAO for accessing Wordnik
 */
interface WordnikDAO {
    String getRandomNoun()
    String getRandomVerb()
    String getRandomAdjective()
    String getRandomAdverb()
    String getRandomPronoun()
}