package io.chrismajor.bandname

/**
 * Created by Christo on 08/04/2017.
 */
class TestingTests extends GroovyTestCase{
    void testAssertions() {
        assertTrue(1 == 1)
        assertEquals("test", "test")

        def x = "42"
        assertNotNull "x must not be null", x
        assertNull null

        assertSame x, x
    }

    void testMain() {
        try {
            new Main().main()
        }
        catch (Exception e) {
            assert e == null
        }
    }
}
