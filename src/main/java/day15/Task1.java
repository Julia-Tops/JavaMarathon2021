package day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File rf = new File("src/main/resources/shoes.csv");
        File wf= new File("src/main/resources/missing_shoes");
        List<Shoes> shoes = GetShoesZeroCount(rf);
        WriteShoesZeroCount(wf, shoes);

    }

    private static void WriteShoesZeroCount(File wf, List<Shoes> shoes) {
        try {
            PrintWriter pw = new PrintWriter(wf);
            for (Shoes s: shoes
                 ) {
                pw.println(s.toString());
            }
            pw.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }

    }

    public static List<Shoes> GetShoesZeroCount(File readFile){
        List<Shoes> shoes = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(readFile);
            while (scanner.hasNextLine()){
                String[] stringDataShoes = scanner.nextLine().split(";");
                if(Integer.parseInt(stringDataShoes[2]) == 0){
                    shoes.add(new Shoes(stringDataShoes[0],
                            Integer.parseInt(stringDataShoes[1]),
                            Integer.parseInt(stringDataShoes[2])));
                }
            }
            scanner.close();
            return shoes;
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
        return null;
    }
}
class Shoes{
    private String name;
    private  int size;
    private int count;

    public Shoes(String name, int size, int count) {
        this.name = name;
        this.size = size;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return  name +
                ", " + size +
                ", " + count;
    }
}
