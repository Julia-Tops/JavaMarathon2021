package day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Васильев И.И.", "матемитика");
        Srudent srudent = new Srudent("Ивнов И.И.");

        teacher.evaluate(srudent.getName());
    }
}
