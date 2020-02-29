package io.zipcoder;

import java.util.Comparator;

public class PetSorter implements Comparator<Pet>
{
    public int compare(Pet first, Pet second)
    {
        if(first.getClass().getName().equalsIgnoreCase(second.getClass().getName()))
        {
            return first.getName().compareTo(second.getName());
        }
        else
        {
            return first.getClass().getName().compareTo(second.getClass().getName());
        }
    }
}