package io.chrismajor.bandname.tokens.factory

import io.chrismajor.bandname.tokens.TokenFactory

/**
 * Contains methods for returning a random pronoun
 *
 * TODO: implement random pronoun stuff...
 */
class PronounToken implements TokenFactory{

    @Override
    String getTokenValue() {
        return "she"
    }
}
