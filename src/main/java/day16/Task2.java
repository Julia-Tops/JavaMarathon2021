package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

public class Task2 {
    public static void main(String[] args) throws FileNotFoundException {
        Random random = new Random();

        File file1 = new File("file1.txt");
        PrintWriter printWriter1 = new PrintWriter(file1);

        for (int i = 0; i < 1000; i++) {
            printWriter1.print((random.nextInt(100)) + " ");
        }
        printWriter1.close();

        Scanner scanner = new Scanner(file1);
        File file2 = new File("file2.txt");
        PrintWriter printWriter2 = new PrintWriter(file2);
        int sum = 0;
        int count = 0;
        String[] strings = scanner.nextLine().split(" ");

        for (int i = 0; i < 1000; i++) {
            sum += Integer.parseInt(strings[i]);
            count++;
            if (count == 20) {
                printWriter2.print((sum / 20.0) + " ");
                count = 0;
                sum = 0;
            }
        }


            printWriter2.close();

            printResult(file2);

    }

    public static void printResult(File file2) throws FileNotFoundException {
        Scanner scanner1= new Scanner(file2);
        double sum = 0;
        String[] strings = scanner1.nextLine().split(" ");
        for (String s: strings
             ) {
            sum += Double.parseDouble(s);
        }
        scanner1.close();
        System.out.println((int)sum);
    }

}
