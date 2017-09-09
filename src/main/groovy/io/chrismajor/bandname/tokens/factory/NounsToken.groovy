package io.chrismajor.bandname.tokens.factory;

import io.chrismajor.bandname.api.ApiWordnikDAOImpl;
import io.chrismajor.bandname.tokens.TokenFactory;

/**
 * Contains methods for returning a pluralised random noun
 *
 * TODO: autowire api impl
 */
public class NounsToken implements TokenFactory {
    @Override
    public String getTokenValue() {
        ApiWordnikDAOImpl api = new ApiWordnikDAOImpl()
        def noun = api.getRandomNoun()
        return noun.endsWith("s") ? noun : "${noun}s"
    }
}
