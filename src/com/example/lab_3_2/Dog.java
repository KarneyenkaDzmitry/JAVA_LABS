package com.example.lab_3_2;

public class Dog {
    private String nickname;
    private String breed;
    private String coloring;

    public Dog(String nickname, String breed, String coloring) {
        this.nickname = nickname;
        this.breed = breed;
        this.coloring = coloring;
    }

    public void bark(){
        System.out.println("Woof! Woof! Woof!");
    }

    public void run(){
        System.out.println("It is running!");
    }

    public void bite(){
        System.out.println("It is biting!");
    }

    public String getColoring() {
        return coloring;
    }

    public String getBreed() {
        return breed;
    }

    public String getNickname() {
        return nickname;
    }
}
