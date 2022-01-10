package com.example.lab_3_2;

public class MainTest {
    public static void main(String[] args) {
        Dog poodle = new Dog("Sharik", "poodle", "black");
        System.out.println("My dog's nickname is " + poodle.getNickname());
        System.out.println("My dog's breed is " + poodle.getBreed());
        System.out.println("My dog's coloring is " + poodle.getColoring());
        poodle.bark();
        poodle.run();
        poodle.bite();
    }
}
