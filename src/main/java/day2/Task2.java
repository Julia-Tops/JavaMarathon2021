package day2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);

        int a = Integer.parseInt(scanner1.nextLine());
        int b = Integer.parseInt(scanner2.nextLine());
        if (a >= b){
            System.out.println("Некорректный ввод");
        }
        else {
            for (int i = a + 1; i < b; i++) {
                if(i%5 == 0 && i%10 != 0){
                    System.out.print(i + " ");
                }
            }
        }
    }
}
