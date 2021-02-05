package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        int floorCount = Integer.parseInt(string);

        if (floorCount > 0 && floorCount < 5){
            System.out.println("Малоэтажный дом");
        }
        else if (floorCount >= 5 && floorCount <=8) {
            System.out.println("Среднеэтажный дом");
        }
        else if (floorCount >= 9) {
            System.out.println("Многоэтажный дом");
        }
        else {
            System.out.println("Ошибка ввода");
        }


    }
}
