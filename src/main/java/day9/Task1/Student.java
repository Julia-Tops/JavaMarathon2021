package day9.Task1;

import day6.Srudent;

public class Student extends Human{
    private String nameGroup;



    public String getGroupName() {
        return nameGroup;
    }

    public void setNameGroup(String nameGroup) {
        this.nameGroup = nameGroup;
    }

    public Student(String name, String nameGroup) {
        super(name);
        this.nameGroup = nameGroup;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Этот студент с именем " + name);
    }
}
