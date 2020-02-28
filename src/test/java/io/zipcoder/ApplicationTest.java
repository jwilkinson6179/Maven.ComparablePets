package io.zipcoder;


import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class ApplicationTest {

    Dog testDog;
    Dog testDog2;
    Cat testCat;
    Cat testCat2;
    Gorilla testGorilla;
    Gorilla testGorilla2;
    Pet[] testArray;

    @BeforeEach
    public void init(){
        testDog = new Dog("Joe");
        testDog2 = new Dog("Ben");
        testCat = new Cat("Joe");
        testCat2 = new Cat("Cindy");
        testGorilla = new Gorilla("Grodd");
        testGorilla2 = new Gorilla("Zeke");
        testArray = new Pet[]{testDog, testDog2, testCat, testCat2, testGorilla, testGorilla2};
    }

    @Test
    public void sortByNameTest(){
        Pet[] expected = {testDog2, testCat2, testGorilla, testCat, testDog, testGorilla2};

        Pet[] actual = expected;
        Arrays.sort(actual);

        assertEquals(expected, actual);
    }

    @Test
    public void sortByNameTest2(){
        Pet[] expected = {testCat2, testCat, testDog2, testDog, testGorilla, testGorilla2};

        Pet[] actual = expected;
        Arrays.sort(actual);

        assertEquals(expected, actual);
    }
}
