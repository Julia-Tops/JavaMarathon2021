package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Airbus", 2020, 150, 50);
        airplane.setLength(150031);
        airplane.setYear(2021);
        airplane.fillUp(15000);
        airplane.info();

    }
}
