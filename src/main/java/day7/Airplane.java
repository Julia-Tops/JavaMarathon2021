package day7;

public class Airplane {
    private String producer;
    private int year;
    private int length;
    private int weight;
    private int fuel;

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getFuel() {
        return fuel;
    }

    public Airplane(String producer, int year, int length, int weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }

    public void info(){
        System.out.println("Изготовитель: " + this.producer +
                ", год выпуска: " + this.year +
                ", длина: " + this.length +
                ", вес: " + this.weight +
                ", количество топлива в баке: " + this.getFuel());
    }

    public int fillUp(int fuel){
        return this.fuel += fuel;
    }

    public static void compareAirplanes(Airplane airplane1, Airplane airplane2){
        if(airplane1.length > airplane2.length)
        {
            System.out.println("Первый самолет длиннее");
        }
        else if (airplane1.length < airplane2.length) {
            System.out.println("Второй самолет длиннее");
        }
        else {
            System.out.println("Длины самолетов равны");
        }

    }
}
