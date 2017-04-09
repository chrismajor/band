package io.chrismajor.bandname.tokens

import io.chrismajor.bandname.tokens.factory.AdjectiveToken
import io.chrismajor.bandname.tokens.factory.ColourToken
import io.chrismajor.bandname.tokens.factory.NameToken
import io.chrismajor.bandname.tokens.factory.NounToken
import io.chrismajor.bandname.tokens.factory.PronounToken
import io.chrismajor.bandname.tokens.factory.VerbToken

/**
 * Enum for central management of the various types of "token" you can have in a band name pattern
 */
enum TokenTypes {
    NOUN("noun", new NounToken()),
    VERB("verb", new VerbToken()),
    ADJECTIVE("adjective", new AdjectiveToken()),
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