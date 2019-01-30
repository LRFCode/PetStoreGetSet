package com.company;

public class PetStore
{
    private int dogs;
    private int cats;

    public int getCats()
    {
        return cats;
    }

    public void setCats(int cats)
    {
        if (cats >= 0)
        {
            this.cats = cats;
        }
    }

    public void addDogs(int dogs)
    {
        if (dogs > 0)
        {
            this.dogs += dogs;
        }
    }

    public void sellDogs(int dogs)
    {
        if (dogs > 0)
        {
            this.dogs -= dogs;
        }
    }

    public int getDogs()
    {
        return dogs;
    }
}

