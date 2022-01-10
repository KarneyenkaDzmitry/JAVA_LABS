package com.example.lab_4_1;

public class PetTest {
    public static void main(String[] args) {
        Pet snake = new Snake();
        snake.setName("Honey");
        System.out.println("My " + snake.getName() + " bites me everytime.");
        snake.play();
    }
}
