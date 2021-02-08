package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("test1");
        printResult(file);
    }

    public static void printResult(File file){
        try {
            Scanner scanner = new Scanner(file);
            String[] strings = scanner.nextLine().split(" ");
            int[] numbers = new int[strings.length];
            for (int i = 0; i < strings.length; i++) {
                numbers[i] = Integer.parseInt(strings[i]);
            }
            int sum = 0;
            for (int numb : numbers
                 ) {
                sum += numb;
            }
            double average =  sum/(double) numbers.length;

            System.out.printf(average + " --> %.3f", average);
            scanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }


    }
}

