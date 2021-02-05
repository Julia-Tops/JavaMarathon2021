package day4;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int[][] matrix = new int[8][12];
        Random random= new Random();

        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(50);
            }
        }
        for (int[] row : matrix)
            System.out.println(Arrays.toString(row));
        int maxSumStr = 0;
        int indexMaxStr = 0;
        for (int i = 0; i < matrix.length; i++) {
            int sumStr = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                sumStr += matrix[i][j];
            }
            if(sumStr >= maxSumStr){
                maxSumStr = sumStr;
                indexMaxStr = i;
            }
        }
        System.out.println(indexMaxStr);

    }
}
