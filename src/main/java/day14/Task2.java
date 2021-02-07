package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args)  {
        File file = new File("people");
        System.out.println(parseFileToStringList(file));


    }
    public static List<String> parseFileToStringList(File file)  {
        Scanner scanner = null;
        List<String> people = new ArrayList<>();
        try {
            scanner = new Scanner(file);

            while (scanner.hasNextLine()){
                String string = scanner.nextLine();
                String[] man = string.split(" ");
                if(Integer.parseInt(man[1]) < 0)
                    throw new IllegalArgumentException();
                    people.add(string);
                }
            scanner.close();
            return  people;

            } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");}
        catch (IllegalArgumentException e) {
            System.out.println("Некорректный входной файл");
        }

        return  null;



    }
}
