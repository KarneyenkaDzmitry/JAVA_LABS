package com.example.lab_5_3;

import java.util.HashMap;
import java.util.Set;

public class PetRepresentation{
    HashMap<String, Pet> pets = new HashMap<String, Pet>();

    public PetRepresentation(HashMap<String, Pet> pets) {
        this.pets = pets;
    }

    public void printKeys(){
        Set<String> keys = pets.keySet();
        keys.forEach(key-> System.out.println(key));
    }

    public HashMap<String, Pet> getPets() {
        return pets;
    }

    public void setPets(HashMap<String, Pet> pets) {
        this.pets = pets;
    }

}
