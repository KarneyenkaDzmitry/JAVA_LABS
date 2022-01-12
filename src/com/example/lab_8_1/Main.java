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

    public static void printTextFileContent(String content) {
        prn("------------------------------------------------------------");
        prn(content);
        prn("------------------------------------------------------------");
    }

    private static String readText(BufferedReader reader) throws IOException {
        StringBuffer stringBuffer = new StringBuffer("");
        String line;
        while ((line = reader.readLine()) != null)
            stringBuffer.append(line + "\n");
        return stringBuffer.deleteCharAt(stringBuffer.length()-1).toString();
    }

    private static int readInt(BufferedReader reader) throws IOException {
        String line = reader.readLine();
        return Integer.parseInt(line.trim());
    }

    private static int getRandomIntNumber(int from, int till){
        return (int) (from + Math.random()*till);
    };

    private static void writeToFile(FileOutputStream fileOutputStream, String string) throws IOException {
        fileOutputStream.write(string.getBytes(StandardCharsets.UTF_8));
    }
    public static void main(String[] args) throws IOException {
        /** Task 1:
         * Создать файл с информацией о себе. Вывести данные об этом
         * файле. Вывести информацию из файла.
         */
        File file = new File(
                "src/com/example/lab_8_1/self_presentation.txt");
        printFileProperties(file);
        printTextFileContent(readText(new BufferedReader(new FileReader(file))));

        /** Tsk 2:
         * Ввести с клавиатуры в файл f 10 целых чисел. Затем открыть файл
         * для чтения, считать числа, вывести их на экран и определить среднее
         * значение
         */
        BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));
        FileOutputStream fileOutputStream  = new FileOutputStream("src/com/example/lab_8_1/task_2.txt");
        for (int i = 0; i < 10 ; i++) {
            Integer number = readInt(inputReader);
            writeToFile(fileOutputStream, (number.toString() + "\r\n"));

        }
        inputReader.close();
        fileOutputStream.close();

        BufferedReader reader = new BufferedReader(new FileReader("src/com/example/lab_8_1/task_2.txt"));
        Double average = 0.0;
        Integer summ = 0;
        while (reader.ready()) {
            Integer number = readInt(reader);
            summ += number;
            prn(number.toString());
        }
        average = summ.doubleValue()/10;
        prn("An Averaged value is: " + average);
        reader.close();

        /** Task 3:
         *  Создать типизированный файл f, компонентами которого являются
         * целые случайные числа. Записать в файл g все четные числа файла из f, а в
         * файл h – все нечетные. Порядок следования чисел сохраняется.
         */
        FileOutputStream fileOutputStream_f = new FileOutputStream("src/com/example/lab_8_1/task_3_f.txt");
        for (int i = 0; i < getRandomIntNumber(15, 90); i++) {
            Integer number = getRandomIntNumber(1, 9000);
            writeToFile(fileOutputStream_f, (number.toString() + "\r\n"));
        }
        fileOutputStream_f.close();

        BufferedReader bufferedReader = new BufferedReader(new FileReader("src/com/example/lab_8_1/task_3_f.txt"));
        FileOutputStream fileOutputStream_g = new FileOutputStream("src/com/example/lab_8_1/task_3_g.txt");
        FileOutputStream fileOutputStream_h = new FileOutputStream("src/com/example/lab_8_1/task_3_h.txt");

        while (bufferedReader.ready()) {
            Integer number = readInt(bufferedReader);
            if (number % 2 == 0) {
                writeToFile(fileOutputStream_g, (number.toString() + "\r\n"));
            } else {
                writeToFile(fileOutputStream_h, (number.toString() + "\r\n"));
            }
        }
        bufferedReader.close();
        fileOutputStream_h.close();
        fileOutputStream_g.close();
    }
}
