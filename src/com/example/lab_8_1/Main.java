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

    private static double readDouble(BufferedReader reader) throws IOException {
        String line = reader.readLine();
        return Double.parseDouble(line.trim());
    }

    private static int getRandomIntNumber(int from, int till){
        return (int) (from + Math.random() * (till - from));
    };

    private static double getRandomDoubleNumber(Integer from, Integer till) {
        return (from.doubleValue() + Math.random() * (till.doubleValue() - from.doubleValue()));
    }

    private static void writeToFile(FileOutputStream fileOutputStream, String string) throws IOException {
        fileOutputStream.write(string.getBytes(StandardCharsets.UTF_8));
    }

    /** Task 1:
     * Создать файл с информацией о себе. Вывести данные об этом
     * файле. Вывести информацию из файла.
     */
    private static void task1Solution() throws IOException {
        File file = new File(
                "src/com/example/lab_8_1/sources/self_presentation.txt");
        printFileProperties(file);
        printTextFileContent(readText(new BufferedReader(new FileReader(file))));
    }

    /** Tsk 2:
     * Ввести с клавиатуры в файл f 10 целых чисел. Затем открыть файл
     * для чтения, считать числа, вывести их на экран и определить среднее
     * значение
     */
    private static void task2Solution() throws IOException {
        BufferedReader inputReader = new BufferedReader(new InputStreamReader(System.in));
        FileOutputStream fileOutputStream = new FileOutputStream("src/com/example/lab_8_1/results/task_2.txt");
        for (int i = 0; i < 10; i++) {
            Integer number = readInt(inputReader);
            writeToFile(fileOutputStream, (number.toString() + "\r\n"));

        }
        inputReader.close();
        fileOutputStream.close();

        BufferedReader reader = new BufferedReader(new FileReader("src/com/example/lab_8_1/results/task_2.txt"));
        Double average = 0.0;
        Integer summ = 0;
        while (reader.ready()) {
            Integer number = readInt(reader);
            summ += number;
            prn(number.toString());
        }
        average = summ.doubleValue() / 10;
        prn("An Averaged value is: " + average);
        reader.close();
    }

    /** Task 3:
     *  Создать типизированный файл f, компонентами которого являются
     * целые случайные числа. Записать в файл g все четные числа файла из f, а в
     * файл h – все нечетные. Порядок следования чисел сохраняется.
     */
    private static void task3Solution() throws IOException {
        FileOutputStream fileOutputStream_f = new FileOutputStream("src/com/example/lab_8_1/results/task_3_f.txt");
        for (int i = 0; i < getRandomIntNumber(15, 90); i++) {
            Integer number = getRandomIntNumber(1, 9000);
            writeToFile(fileOutputStream_f, (number.toString() + "\r\n"));
        }
        fileOutputStream_f.close();

        BufferedReader bufferedReader = new BufferedReader(new FileReader("src/com/example/lab_8_1/results/task_3_f.txt"));
        FileOutputStream fileOutputStream_g = new FileOutputStream("src/com/example/lab_8_1/results/task_3_g.txt");
        FileOutputStream fileOutputStream_h = new FileOutputStream("src/com/example/lab_8_1/results/task_3_h.txt");

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

    /** Task 4:
     * Используя Блокнот, создать текстовый файл temp.dat и записать в
     * него 15 вещественных значений температуры воздуха. Затем создать
     * программу, считывающую из файла значения и выводящую на экран
     * среднюю температуру
     */
    private static void task4Solution() throws IOException {
        FileOutputStream fileOutputStream_t4 = new FileOutputStream("src/com/example/lab_8_1/results/temp.dat");
        for (int i = 0; i < getRandomIntNumber(15, 90); i++) {
            Double number = getRandomDoubleNumber(1, 9000);
            writeToFile(fileOutputStream_t4, (number.toString() + "\r\n"));
        }
        fileOutputStream_t4.close();

        BufferedReader bufferedReader_t4 = new BufferedReader(new FileReader("src/com/example/lab_8_1/results/temp.dat"));
        Double average_t4 = 0.0;
        Double summ_t4 = 0.0;
        Integer counter = 0;
        while (bufferedReader_t4.ready()) {
            Double number = readDouble(bufferedReader_t4);
            summ_t4 += number;
            counter++;
        }
        average_t4 = summ_t4/counter;
        prn("An Averaged temperature is: " + average_t4);
        bufferedReader_t4.close();
    }

    /** Task 5:
     * Создать типизированные файлы f и g, компонентами которых
     * являются случайные целые числа. Записать в файл h сначала компоненты
     * файла f, а затем компоненты файла g с сохранением порядка следования
     */
    private static void task5Solution() throws IOException {
        FileOutputStream fileOutputStream_f = new FileOutputStream("src/com/example/lab_8_1/results/task_5_f.txt");
        for (int i = 0; i < getRandomIntNumber(15, 90); i++) {
            Integer number = getRandomIntNumber(1, 9000);
            writeToFile(fileOutputStream_f, (number.toString() + "\r\n"));
        }
        fileOutputStream_f.close();

        FileOutputStream fileOutputStream_g = new FileOutputStream("src/com/example/lab_8_1/results/task_5_g.txt");
        for (int i = 0; i < getRandomIntNumber(15, 90); i++) {
            Integer number = getRandomIntNumber(1, 9000);
            writeToFile(fileOutputStream_g, (number.toString() + "\r\n"));
        }
        fileOutputStream_g.close();

        BufferedReader bufferedReader_f = new BufferedReader(new FileReader("src/com/example/lab_8_1/results/task_5_f.txt"));
        BufferedReader bufferedReader_g = new BufferedReader(new FileReader("src/com/example/lab_8_1/results/task_5_g.txt"));
        FileOutputStream fileOutputStream_h = new FileOutputStream("src/com/example/lab_8_1/results/task_5_h.txt");

        while (bufferedReader_f.ready()) {
            Integer number = readInt(bufferedReader_f);
            writeToFile(fileOutputStream_h, (number.toString() + "\r\n"));
        }
        bufferedReader_f.close();
        fileOutputStream_f.close();

        while (bufferedReader_g.ready()) {
            Integer number = readInt(bufferedReader_g);
            writeToFile(fileOutputStream_h, (number.toString() + "\r\n"));
        }
        bufferedReader_g.close();
        fileOutputStream_g.close();
        fileOutputStream_h.close();
    }

    /** Tsk 6:
     *  Создать типизированный файл f и записать в него 10 целых чисел.
     *  Затем считать из файла числа и вывести на экран количество положительных
     *  значений.
     */
    private static void task6Solution() throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("src/com/example/lab_8_1/results/task_6.txt");
        for (int i = 0; i < 10; i++) {
            Integer number = getRandomIntNumber(-9, 9);
            writeToFile(fileOutputStream, (number.toString() + "\r\n"));
        }
        fileOutputStream.close();

        BufferedReader reader = new BufferedReader(new FileReader("src/com/example/lab_8_1/results/task_6.txt"));
        Integer counter = 0;
        while (reader.ready()) {
            Integer number = readInt(reader);
            if (number >= 0) {
                counter++;
            }
        }
        prn("The number of positive integer numbers (nought included) is " + counter);
        reader.close();
    }

    public static void main(String[] args) throws IOException {
        task1Solution();
        task2Solution();
        task3Solution();
        task4Solution();
        task5Solution();
        task6Solution();
    }
}
