package io.zipcoder;

abstract public class Pet implements Comparable<Pet>
{
    private String name;

    public Pet(String name)
    {
        this.name = name;
    }

    abstract public String speak();

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return this.name;
    }

    public int compareTo(Pet otherPet)
    {
        if(this.name.equals(otherPet.getName()))
        {
            return this.getClass().getName().compareTo(otherPet.getClass().getName());
        }
        else
        {
            return this.name.compareTo(otherPet.getName());
        }
    }
}