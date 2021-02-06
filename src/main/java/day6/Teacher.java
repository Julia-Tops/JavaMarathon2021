package day6;

import java.util.Random;

public class Teacher {
    private String name;
    private String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public void evaluate(String name){
        Random random = new Random();
        int bal = random.nextInt(4) + 2;
        String score = null;
        switch (bal){
            case 5 : score = "отлично"; break;
            case 4 : score = "хорошо"; break;
            case 3 : score = "довлетворительно"; break;
            case 2 : score = "неудовлетворительно"; break;
        }

        System.out.println("Преподаватель " + this.name +
                " оценил студента с именем " + name +
                " по предмету " + subject +
                " на оценку " + score + "." );
    }

}
