package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;

        while (count < 5) {
            Double a = scanner.nextDouble();
            Double b = scanner.nextDouble();
            if(b == 0)
            {
                System.out.println("Деление на 0");
                continue;
            }
            count++;
            System.out.println(a/b);
        }
    }
}
