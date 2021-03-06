package io.chrismajor.bandname.tokens

import io.chrismajor.bandname.tokens.factory.*

/**
 * Enum for central management of the various types of "token" you can have in a band name pattern
 */
enum TokenTypes {
    NOUN("noun", new NounToken()),
    NOUNS("nouns", new NounsToken()),
    VERB("verb", new VerbToken()),
    VERBS("verbs", new VerbsToken()),
    ADJECTIVE("adjective", new AdjectiveToken()),
    ADVERB("adverb", new AdverbToken()),
    NAME("name", new NameToken()),
    PRONOUN("pronoun", new PronounToken()),
    COLOUR("colour", new ColourToken())

    TokenTypes(String name, TokenFactory factory) {
        this.name = name
        this.factory = factory
    }

    private final String name
    String getName() {
        name
    }

    private final TokenFactory factory
    TokenFactory getTokenFactory() {
        factory
    }
}