package io.chrismajor.bandname.tokens.factory

import io.chrismajor.bandname.api.ApiWordnikDAOImpl
import io.chrismajor.bandname.tokens.TokenFactory

/**
 * Contains methods for returning a random noun
 *
 * TODO: autowire api impl
 */
class NounToken implements TokenFactory{

    @Override
    String getTokenValue() {
        ApiWordnikDAOImpl api = new ApiWordnikDAOImpl()
        return api.getRandomNoun()
    }
}
