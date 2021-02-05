package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
       /*Создание массива*/
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(10);
        } // Заполнение массива

        System.out.println(Arrays.toString(array)); // Вывод массива
        System.out.println("Длинна массива: " + array.length); // Вывод длины массива

        int countNumOver8 = 0;
        for (int value : array) {
            if (value > 8) {
                countNumOver8++;
            }
        }
        System.out.println("Количество чисел больше 8: " + countNumOver8); // Вывод Количества чисел больше 8

        int countNum1= 0;
        for (int k : array) {
            if (k == 1) {
                countNum1++;
            }
        }
        System.out.println("Количество чисел равных 1: " + countNum1); // Вывод Количества чисел равных 1

        int countEven = 0;
        int countOdd = 0;
        for (int j : array) {
            if (j % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
        }
        System.out.println("Количество четных чисел: " + countEven); // Вывод Количества четных чисел
        System.out.println("Количество нечетных чисел: " + countOdd); // Вывод Количества нечетных чисел


        int sumAllElementsArray = 0;
        for (int j : array) {
            sumAllElementsArray += j;
        }
        System.out.println("Сумма всех элементов массива: " + sumAllElementsArray); // Вывод Суммы всех элементов массива
    }
}
