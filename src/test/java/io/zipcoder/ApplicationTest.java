package io.zipcoder;


import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ApplicationTest
{
    @Test
    public void sortByNameTest()
    {
        // GIVEN

        Dog testDog = new Dog("Joe");
        Dog testDog2 = new Dog("Ben");
        Cat testCat = new Cat("Joe");
        Cat testCat2 = new Cat("Cindy");
        Gorilla testGorilla = new Gorilla("Grodd");
        Gorilla testGorilla2 = new Gorilla("Zeke");
        ArrayList<Pet> expected = new ArrayList<Pet>();
        expected.add(testDog2);
        expected.add(testCat2);
        expected.add(testGorilla);
        expected.add(testCat);
        expected.add(testDog);
        expected.add(testGorilla2);
        ArrayList<Pet> petList = new ArrayList<Pet>();
        petList.add(testDog);
        petList.add(testCat);
        petList.add(testDog2);
        petList.add(testCat2);
        petList.add(testGorilla);
        petList.add(testGorilla2);

        // WHEN

        Collections.sort(petList);

        // THEN

        assertEquals(expected, petList);
    }

    @Test
    public void sortByNameTest2()
    {
        // GIVEN

        Dog testDog = new Dog("Joe");
        Dog testDog2 = new Dog("Ben");
        Cat testCat = new Cat("Joe");
        Cat testCat2 = new Cat("Cindy");
        Gorilla testGorilla = new Gorilla("Grodd");
        Gorilla testGorilla2 = new Gorilla("Zeke");
        ArrayList<Pet> expected = new ArrayList<Pet>();
        expected.add(testCat2);
        expected.add(testCat);
        expected.add(testDog2);
        expected.add(testDog);
        expected.add(testGorilla);
        expected.add(testGorilla2);
        ArrayList<Pet> petList = new ArrayList<Pet>();
        petList.add(testDog);
        petList.add(testCat);
        petList.add(testDog2);
        petList.add(testCat2);
        petList.add(testGorilla);
        petList.add(testGorilla2);

        // WHEN

        Collections.sort(petList, new PetSorter());

        // THEN

        assertEquals(expected, petList);
    }
}
