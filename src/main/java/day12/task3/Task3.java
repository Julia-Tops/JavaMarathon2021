package day12.task3;

import java.util.ArrayList;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<MusicBand> bands = new ArrayList<MusicBand>();

        bands.add(new MusicBand("A", 2000));
        bands.add(new MusicBand("B", 1988));
        bands.add(new MusicBand("C", 2020));
        bands.add(new MusicBand("D", 2005));
        bands.add(new MusicBand("E", 1988));
        bands.add(new MusicBand("F", 2012));
        bands.add(new MusicBand("G", 1988));
        bands.add(new MusicBand("H", 2003));
        bands.add(new MusicBand("I", 1988));
        bands.add(new MusicBand("J", 2006));

        List<MusicBand> bandsAfter2000 = groupsAfter2000(bands);
        printList(bands);
        printList(bandsAfter2000);


    }
    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands){
        List<MusicBand> bandsAfter2000 = new ArrayList<MusicBand>();
        for (MusicBand band : bands
             ) {
            if (band.getYear() > 2000)
            {
                bandsAfter2000.add(band);
            }
        }
        return bandsAfter2000;
    }
    public static void printList(List<MusicBand> list){
        for (MusicBand band : list
             ) {
            System.out.println(band);
        }
    }
}
