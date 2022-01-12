package com.example.lab_8_1;

import java.io.*;

public class Main {
    private static void prn(String message) {
        System.out.println(message);
    }

    private static void printFileProperties(File file){
        prn("File Properties: ");
        prn("Is Exist " + (file.exists() ? "exists" : " not exist"));
        prn("Name: " + file.getName());
        prn("Size: " + file.getTotalSpace());
        prn("Free space: " + file.getFreeSpace());
        prn("Last Modified: " + file.getName());
        prn("Parent: " + file.getParent());
        prn("Absolute Path: " + file.getAbsolutePath());
        prn("Relative Path: " + file.getPath());
        prn("Can be read" + (file.canRead() ? "can read" : "can’t read"));
        prn("Can be write" + (file.canWrite() ? "can write" : "can’t write"));
        prn("This is " + (file.isDirectory() ? " " : "not") + " directory");
        prn("This is "+ (file.isAbsolute() ? "absolute" : " not absolute"));
        prn("This is " + (file.isFile() ? " normal file" : " a named pipe"));
    }

    public static void main(String[] args) throws IOException {
        File file = new File(
                "src/com/example/lab_8_1/example_1.txt");
        printFileProperties(file);
        BufferedReader br
                = new BufferedReader(new FileReader(file));

        String line;
        while ((line = br.readLine()) != null)
            System.out.println(line);
    }
}
