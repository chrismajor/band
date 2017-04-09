package io.chrismajor.bandname.tokens.factory;

import io.chrismajor.bandname.tokens.TokenFactory;

/**
 * Contains methods for returning a random name
 *
 * TODO: implement random name stuff...
 */
class NameToken implements TokenFactory {

    @Override
    String getTokenValue() {
        return "Arnold"
    }
}
