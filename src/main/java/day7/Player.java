package day7;

import java.util.Random;

public class Player {
    private int stamina;
    private static final int MAX_STAMINA = 100;
    private static final int MIN_STAMINA = 0;
    static int countPlayers;

    public Player(int stamina) {
        this.stamina = stamina;

        if (countPlayers < 6) countPlayers++;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    public int getStamina() {
        return stamina;
    }

    public void run(){
        if (stamina == 0)
        {
            return;
        }
        stamina--;
        if (stamina == 0)
        {
            countPlayers--;
        }
    }

    public static void info() {
        if (countPlayers < 6) {
            int freePlace = 6 - countPlayers;
           System.out.println("Команды неполные. На поле еще есть " + freePlace + " свободных мест");
        }
        else if (countPlayers == 6) {
            System.out.println("На поле нет свободных мест");
        }

    }
}
