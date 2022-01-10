package com.example.lab_3_1;

import java.util.Arrays;

public class Randomizer {
    private int values[];
    private int weights[];

    public Randomizer(int values[], int weights[]){
        this.values = values;
        this.weights = weights;
    }

    /** Rewrite once it is found the appropriate Math solution */
    public int getRandomValueBasedOnWeight(){
        int data[] = new int[getFullDataArrayLength()];
        int counter = 0;
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < this.weights[i]; j++) {
                data[counter++] = this.values[i];
            }
        }
        int index = (int) Math.round(Math.random()*(data.length-1));
        return data[index];
    }
    private int getFullDataArrayLength(){
        int length = 0;
        for (int i = 0; i < values.length; i++) {
            length += weights[i];

        }
        return length;
    }

    public int[] getValues() {
        return values;
    }

    public int[] getWeights() {
        return weights;
    }
}
