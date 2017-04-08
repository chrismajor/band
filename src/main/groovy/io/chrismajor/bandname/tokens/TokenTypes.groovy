package io.chrismajor.bandname.tokens

/**
 * Enum for central management of the various types of "token" you can have in a band name pattern
 *
 * TODO: implement the various factory classes for generating the token values for each type
 */
enum TokenTypes {
    NOUN("noun", TokenFactory),
    VERB("verb", TokenFactory),
    ADJECTIVE("adjective", TokenFactory),
    NAME("name", TokenFactory),
    PRONOUN("pronoun", TokenFactory),
    COLOUR("colour", TokenFactory)

    TokenTypes(String name, TokenFactory factory) {
        this.name = name
        this.factory = factory
    }

    private final String name
    int getName() {
        name
    }

    private final TokenFactory factory
    TokenFactory getTokenFactory() {
        factory
    }
}


/*
	PENNY(1), NICKEL(5), DIME(10), QUARTER(25)
	MyCoin(int value) {
		this.centValue = value
	}
	private final int centValue
	int getCentValue() {
		centValue
	}
	public String toString() {
		return name() + " = " + centValue
	}
*/