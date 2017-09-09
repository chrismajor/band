package io.chrismajor.bandname.tokens.factory

import io.chrismajor.bandname.api.ApiWordnikDAOImpl
import io.chrismajor.bandname.tokens.TokenFactory;

/**
 * Contains methods for returning a random present tense verb
 *
 * TODO: autowire api client
 */
public class VerbsToken implements TokenFactory {

    @Override
    String getTokenValue() {
        ApiWordnikDAOImpl api = new ApiWordnikDAOImpl()
        def verb = api.getRandomVerb()
        return verb.endsWith("s") ? verb : "${verb}s"
    }
}
