package io.chrismajor.bandname.tokens.factory

import io.chrismajor.bandname.tokens.TokenFactory

/**
 * Contains methods for returning a random verb
 *
 * TODO: implement random verb stuff...
 */
class VerbToken implements TokenFactory {

    @Override
    String getTokenValue() {
        return "fly"
    }
}
