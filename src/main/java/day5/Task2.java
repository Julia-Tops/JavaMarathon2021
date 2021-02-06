package day5;


 class Motorbike {
    private int year;
    private String color;
    private String model;

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public Motorbike(int year, String color, String model) {
        this.year = year;
        this.color = color;
        this.model = model;
    }
}
public class Task2 {
    public static void main(String[] args) {
        Motorbike motorbike = new Motorbike(2019, "red", "Ural");

        System.out.println(motorbike.getYear());
        System.out.println(motorbike.getColor());
        System.out.println(motorbike.getModel());


    }
}
