package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("test1");

        printSumDigits(file);
    }
    public static void printSumDigits(File file) throws FileNotFoundException {

        Scanner scanner = new Scanner(file);
        String line = scanner.nextLine();
        String[] numbersString = line.split(" ");
        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++) {
            numbers[i] = Integer.parseInt(numbersString[i]);
        }

        int sum = 0;
        for (int number : numbers
             ) {
            sum += number;
        }
        System.out.println(sum);
        scanner.close();



    }
}
