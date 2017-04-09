package io.chrismajor.bandname.tokens.factory

import io.chrismajor.bandname.tokens.TokenFactory

/**
 * Contains methods for returning a random colour
 *
 * TODO: implement random colour stuff...
 */
class ColourToken implements TokenFactory {

    @Override
    String getTokenValue() {
        return "blue"
    }
}
