package io.chrismajor.bandname.tokens.factory

import io.chrismajor.bandname.tokens.TokenFactory

/**
 * Contains methods for returning a random adjective
 *
 * TODO: implement random adjective stuff...
 */
class AdjectiveToken implements TokenFactory {

    @Override
    String getTokenValue() {
        return "smooth"
    }
}
