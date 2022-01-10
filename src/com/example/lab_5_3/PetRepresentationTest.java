package com.example.lab_5_3;

import java.util.HashMap;

public class PetRepresentationTest {
    public static void main(String[] args) {
        PetRepresentation petRepresentation = new PetRepresentation(new HashMap<String, Pet>(){{put("Sharik", new Dog()); put("Murzik", new Cat()); put("Honey", new Parrot());}});
        petRepresentation.printKeys();
    }
}
