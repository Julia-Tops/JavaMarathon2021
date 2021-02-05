package day3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        String string = new Scanner(System.in).nextLine();
        while (!string.equals("Stop")){
            switch (string){
                case "Москва":
                case "Владивосток":
                case "Ростов":
                    System.out.println("Россия");
                    string = new Scanner(System.in).nextLine();
                    continue;
                case "Рим":
                case "Милан":
                case "Турин":
                    System.out.println("Италия");
                    string = new Scanner(System.in).nextLine();
                    continue;
                case "Ливерпуль":
                case "Манчестер":
                case "Лондон":
                    System.out.println("Англия");
                    string = new Scanner(System.in).nextLine();
                    continue;
                case "Берлин":
                case "Мюнхен":
                case "Кёльн":
                    System.out.println("Германия");
                    string = new Scanner(System.in).nextLine();
                    continue;
                default: System.out.println("Неизвестная страна");
                    string = new Scanner(System.in).nextLine();
                    continue;
            }
        }

    }
}
