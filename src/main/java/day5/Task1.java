package day5;

class Car{
    int year;
    String color;
    String model;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}

public class Task1 {

    public static void main(String[] args) {
        Car car = new Car();
        car.setYear(2020);
        car.setColor("black");
        car.setModel("Audi");

        System.out.println(car.getYear());
        System.out.println(car.getColor());
        System.out.println(car.getModel());

    }
}
