package day9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("Иванов И.И.", "ER-55");
        Teacher teacher = new Teacher("Борисов Б.Б.", "Physic");
        System.out.println(student.getGroupName());
        System.out.println(teacher.getSubjectName());

        student.printInfo();
        teacher.printInfo();

    }
}
