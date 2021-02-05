package day4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int[] array = new int[100];
        Random random = new Random();

        for (int i = 0; i < array.length ; i++) {
            array[i] = random.nextInt(10000);
        }

        int maxSumOfThreeElements = 0;
        int indexOfMaxSum = 0;
        for (int i = 0; i < array.length-2; i++) {
         int sumOfThreeElements = array[i] + array[i + 1] + array[i + 2];
         if (sumOfThreeElements > maxSumOfThreeElements) {
             maxSumOfThreeElements = sumOfThreeElements;
             indexOfMaxSum = i;
         }
        }
        System.out.println(maxSumOfThreeElements);
        System.out.println(indexOfMaxSum);
    }
}
