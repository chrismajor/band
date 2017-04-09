package io.chrismajor.bandname.tokens.factory

import io.chrismajor.bandname.tokens.TokenFactory

/**
 * Contains methods for returning a random adverb
 *
 * TODO: implement random adverb stuff...
 */
class AdverbToken implements TokenFactory {

    @Override
    String getTokenValue() {
        return "quickly"
    }
}
