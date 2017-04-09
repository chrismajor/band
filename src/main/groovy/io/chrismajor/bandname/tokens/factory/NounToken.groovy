package io.chrismajor.bandname.tokens.factory

import io.chrismajor.bandname.tokens.TokenFactory

/**
 * Contains methods for returning a random noun
 *
 * TODO: implement random noun stuff...
 */
class NounToken implements TokenFactory{

    @Override
    String getTokenValue() {
        return "hat"
    }
}
