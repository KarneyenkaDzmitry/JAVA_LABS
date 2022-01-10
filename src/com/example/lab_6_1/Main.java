package com.example.lab_6_1;

import jdk.nashorn.internal.runtime.regexp.RegExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String text = "1. Object-oriented programming (2. Object-oriented programming, aka 3. Object-oriented programming) is a " +
                "4. Object-oriented programming (5. Object-oriented programming, aka 6. Object-oriented programming) is a " +
                 "(7. Object-oriented programming) programming paradigm based on the concept of \"objects\"\n";
        System.out.println(textOopSubstitute(text));
    }

    public static String textOopSubstitute(String text){
        Pattern oopPattern = Pattern.compile("object-oriented programming", Pattern.CASE_INSENSITIVE);
        Matcher matcher = oopPattern.matcher(text);
        StringBuffer bufferString = new StringBuffer(text);
        int counter = 1;
        int deviationRate = 0;
        while (matcher.find()) {
            if (counter++ % 2 == 0) {
                int start = matcher.start() - deviationRate;
                int end = matcher.end() - deviationRate;
                bufferString.replace(start, end, "OOP");
                deviationRate += 24;
            }
        }
        return bufferString.toString();
    }
}
