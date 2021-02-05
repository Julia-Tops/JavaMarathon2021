package day4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[100];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10000);
        }


        int max = 0;
        for (int num : array
        ) {
           if(num > max){
               max = num;
           }
        }
        System.out.println(max);

        int min = 10000;
        for (int num : array
             ) {
            if ( num < min) {
                min = num;
            }
        }
        System.out.println(min);

        int sumElementsEndZero = 0;
        int countElementsEndZero = 0;
        for (int num : array
             ) {
            if(num%10 == 0) {
                countElementsEndZero++;
                sumElementsEndZero += num;
            }
        }
        System.out.println(countElementsEndZero);
        System.out.println(sumElementsEndZero);

    }
}
