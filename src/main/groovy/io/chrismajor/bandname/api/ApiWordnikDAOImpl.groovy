package io.chrismajor.bandname.api

import com.wordnik.client.common.ApiException
import com.wordnik.client.common.ApiInvoker
import com.wordnik.client.model.WordObject

/**
 * DAO for accessing Wordnik's APIs
 */
class ApiWordnikDAOImpl implements WordnikDAO {

    // TODO: pull this from properties file
    private String basePath = "http://api.wordnik.com/v4"
    private ApiInvoker apiInvoker = ApiInvoker.getInstance()

    // TODO: tidy up repetition of 'getRandomWord' args

    /**
     * Get a random noun from wordnik
     * @return
     */
    @Override
    String getRandomNoun() {
        String partOfSpeech = "noun"
        WordObject word = getRandomWord(partOfSpeech, "null", "false", 0, -1, 1, -1, 5, -1)
        return word.getWord()
    }

    @Override
    String getRandomVerb() {
        String partOfSpeech = "verb"
        WordObject word = getRandomWord(partOfSpeech, "null", "false", 0, -1, 1, -1, 5, -1)
        return word.getWord()
    }

    @Override
    String getRandomAdjective() {
        String partOfSpeech = "adjective"
        WordObject word = getRandomWord(partOfSpeech, "null", "false", 0, -1, 1, -1, 5, -1)
        return word.getWord()
    }

    @Override
    String getRandomAdverb() {
        String partOfSpeech = "adverb"
        WordObject word = getRandomWord(partOfSpeech, "null", "false", 0, -1, 1, -1, 5, -1)
        return word.getWord()
    }

    @Override
    String getRandomPronoun() {
        String partOfSpeech = "pronoun"
        WordObject word = getRandomWord(partOfSpeech, "null", "false", 0, -1, 1, -1, 5, -1)
        return word.getWord()
    }
/**
     * Call Wordnik's "random word" API
     *
     * Docs here: http://developer.wordnik.com/docs.html#!/words/getRandomWords_get_3
     *
     * @param includePartOfSpeech the word type we're after (e.g. noun / verb etc)
     * @param excludePartOfSpeech types of word we want to exclude. This will generally be null.
     * @param hasDictionaryDef whether Wordnik has a dictionary definition for the word in question.
     * @param minCorpusCount TBC
     * @param maxCorpusCount TBC
     * @param minDictionaryCount TBC
     * @param maxDictionaryCount TBC
     * @param minLength minumum length of the word
     * @param maxLength maximum length of the word
     * @return
     * @throws ApiException
     */
    private WordObject getRandomWord (String includePartOfSpeech, String excludePartOfSpeech,
                                      String hasDictionaryDef,
                                      Integer minCorpusCount, Integer maxCorpusCount,
                                      Integer minDictionaryCount, Integer maxDictionaryCount,
                                      Integer minLength, Integer maxLength) throws ApiException {

        // TODO: pull this from properties file
        String path = "/words.json/randomWord"

        // query params
        Map<String, String> queryParams = new HashMap<String, String>()

        this.mapQueryParam(queryParams, "hasDictionaryDef", hasDictionaryDef)
        this.mapQueryParam(queryParams, "includePartOfSpeech", includePartOfSpeech)
        this.mapQueryParam(queryParams, "excludePartOfSpeech", excludePartOfSpeech)
        this.mapQueryParam(queryParams, "minCorpusCount", String.valueOf(minCorpusCount))
        this.mapQueryParam(queryParams, "maxCorpusCount", String.valueOf(maxCorpusCount))
        this.mapQueryParam(queryParams, "minDictionaryCount", String.valueOf(minDictionaryCount))
        this.mapQueryParam(queryParams, "maxDictionaryCount", String.valueOf(maxDictionaryCount))
        this.mapQueryParam(queryParams, "minLength", String.valueOf(minLength))
        this.mapQueryParam(queryParams, "maxLength", String.valueOf(maxLength))

        // TODO: pull this from properties file
        queryParams.put("api_key", "a2a73e7b926c924fad7001ca3111acd55af2ffabf50eb4ae5")

        try {
            String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, null, new HashMap<String, String>())
            return response == null ? null : (WordObject) ApiInvoker.deserialize(response, "", WordObject.class)
        }
        // TODO: tidy up this error handling
        catch (ApiException ex) {
            if(ex.getCode() == 404) {
                return null
            }
            else {
                throw ex
            }
        }
    }

    /**
     * Map query parameters, as long as the value isn't invalid
     * @param map the map to apply the value to
     * @param paramName name of the param
     * @param paramValue value of the param
     */
    private void mapQueryParam(Map<String, String> map, String paramName, String paramValue) {
        if(paramValue != null && paramValue != "null") {
            map.put(paramName, paramValue)
        }
    }
}
