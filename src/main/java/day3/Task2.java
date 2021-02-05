package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        double a = new Scanner(System.in).nextDouble();
        double b = new Scanner(System.in).nextDouble();
        while (b != 0){
            System.out.println(a/b);
           a = new Scanner(System.in).nextDouble();
           b = new Scanner(System.in).nextDouble();
        }
    }
}
