package day12.task5;

import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<MusicArtist> members;


    public MusicBand(String name, int year, List<MusicArtist> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }

    public int getYear() {
        return year;
    }

    public List<MusicArtist> getMembers() {
        return members;
    }

    public void setMembers(List<MusicArtist> members) {
        this.members = members;
    }

    public static void transferMembers(MusicBand A, MusicBand B) {
        for (MusicArtist member : A.getMembers()
             ) {
            B.getMembers().add(member);
        }
        A.getMembers().clear();
    }
    public void printMembers(){
       System.out.println(this.members.toString());
    }




}
