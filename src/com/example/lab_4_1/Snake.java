package com.example.lab_4_1;

public class Snake extends Animal implements Pet {
    private String name;

    /** Constructor
     *
//     * @param name
    public Snake(String name){
        this.name = name;
    }
    */

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println("The snake is just playing.");
    }
}
