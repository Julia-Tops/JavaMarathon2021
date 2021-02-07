package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        File file = new File("people");
        System.out.println(parseFileToObjList(file));

    }

    public static List<Person> parseFileToObjList(File file) {
        List<Person> people = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String string = scanner.nextLine();
                String[] stringPerson = string.split(" ");
                if (Integer.parseInt(stringPerson[1]) < 0) throw new IllegalArgumentException();

                people.add(new Person(stringPerson[0], Integer.parseInt(stringPerson[1])));
            }

                scanner.close();
                return people;

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException e) {
            System.out.println("Некорректный входной файл");
        }
        return null;
    }

}

 class Person {
    private String name;
    private int year;

     public Person(String name, int year) {
         this.name = name;
         this.year = year;
     }

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public int getYear() {
         return year;
     }

     public void setYear(int year) {
         this.year = year;
     }

     @Override
     public String toString() {
         return "{" +
                 "name='" + name + '\'' +
                 ", year=" + year +
                 '}';
     }
 }
