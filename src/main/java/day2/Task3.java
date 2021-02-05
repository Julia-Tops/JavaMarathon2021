package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);

        int a = Integer.parseInt(scanner1.nextLine());
        int b = Integer.parseInt(scanner2.nextLine());
        if (a >= b){
            System.out.println("Некорректный ввод");
        }
        else {

           while (a < b) {
               a++;
               if(a%5 == 0 && a%10 != 0) {
                   System.out.print(a + " ");
               }
           }
        }
    }
}
