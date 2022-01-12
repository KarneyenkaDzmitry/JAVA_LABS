package com.example.lab_8_1;

import java.io.*;
import java.nio.charset.StandardCharsets;

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

    public static void printTextFileContent(BufferedReader reader) throws IOException {
        prn("------------------------------------------------------------");
        prn(readText(reader));
        prn("------------------------------------------------------------");
    }

    private static String readText(BufferedReader reader) throws IOException {
        StringBuffer stringBuffer = new StringBuffer("");
        String line;
        while ((line = reader.readLine()) != null)
            stringBuffer.append(line + "\n");
        return stringBuffer.deleteCharAt(stringBuffer.length()-1).toString();
    }

    public static int readInt(BufferedReader reader) throws IOException {
        String line = reader.readLine();
        return Integer.parseInt(line.trim());
    }

    public static void main(String[] args) throws IOException {
        /** Task 1 */
        File file = new File(
                "src/com/example/lab_8_1/example_1.txt");
        printFileProperties(file);
        printTextFileContent(new BufferedReader(new FileReader(file)));

        /** Tsk 2 */
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        OutputStream outputStream  = new FileOutputStream("src/com/example/lab_8_1/example_2.txt");
        for (int i = 0; i < 10 ; i++) {
            Integer number = readInt(reader);
            outputStream.write(number.toString().getBytes(StandardCharsets.UTF_8));
            outputStream.write("\r\n".getBytes(StandardCharsets.UTF_8));
        }
        reader.close();
        outputStream.close();

        BufferedReader fio1 = new BufferedReader(new FileReader("src/com/example/lab_8_1/example_2.txt"));
        prn("I am here");
        String line;
        Double average = 0.0;
        Integer summ = 0;
        while (fio1.ready()) {
            Integer number = readInt(fio1);
            summ += number;
            prn(number.toString());
        }
        average = summ.doubleValue()/10;
        prn("An Averaged value is: " + average);
        fio1.close();

        /** Task 3 */
    }
}
