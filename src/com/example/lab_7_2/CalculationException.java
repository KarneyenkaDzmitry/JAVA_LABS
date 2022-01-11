package com.example.lab_7_2;

public abstract class CalculationException extends Exception implements CalculationExceptionInterface{

    public void printMessage() {
        System.out.println("The " + this.getClass() + " Exception is thrown!");
        System.out.println(this.getStackTrace());
    }
}
