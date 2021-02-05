package day2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        double x = new Scanner(System.in).nextDouble();
        if(x >= 5) {
            double y = (x*x - 10)/(x + 7);
            System.out.print(y);
        }
        else if(x > -3 && x < 5) {
            double y = (x + 30)*(x*x - 2);
            System.out.print(y);
        }
        else {
            double y = 420;
        }
    }
}
