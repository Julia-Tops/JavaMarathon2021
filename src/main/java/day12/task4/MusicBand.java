package day12.task4;

import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<String> members;


    public MusicBand(String name, int year, List<String> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }

    public int getYear() {
        return year;
    }

    public List<String> getMembers() {
        return members;
    }

    public void setMembers(List<String> members) {
        this.members = members;
    }

    public static void transferMembers(MusicBand A, MusicBand B) {
        for (String member : A.getMembers()
             ) {
            B.getMembers().add(member);
        }
        A.getMembers().clear();
    }
    public void printMembers(){
       System.out.println(this.members);
    }




}
