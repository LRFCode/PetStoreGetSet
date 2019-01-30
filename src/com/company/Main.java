package com.company;

public class Main
{
    public static void main(String[] args)
    {
        PetStore petStore = new PetStore();
        petStore.setCats(5);
        petStore.setCats(-7);

        System.out.println("The store has " + petStore.getCats() + " cats");

        petStore.addDogs(4);
        System.out.println("The store has " + petStore.getDogs() + " dogs");

        petStore.addDogs(3);
        System.out.println("The store has " + petStore.getDogs() + " dogs");

        petStore.sellDogs(2);
        System.out.println("The store has " + petStore.getDogs() + " dogs");
    }
}
