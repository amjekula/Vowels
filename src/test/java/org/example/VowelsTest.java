package org.example;

import junit.framework.TestCase;

public class VowelsTest extends TestCase {

    public void setUp() throws Exception {
        super.setUp();
    }

    public void testGetCount() {
        assertEquals("Nope!", 5, Vowels.getCount("abracadabra"));
    }
}