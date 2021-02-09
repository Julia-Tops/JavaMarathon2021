package day18;

public class Task2 {
    public static void main(String[] args) {
        int count = 717771277;

        System.out.println(count7(count));

    }
    public  static int count7(int count){
        if (count > 10) {
            if (count%10 == 7)
            {
                return 1 + count7(count/10);
            }
            else {
                return count7(count/10);
            }
        }
        else {
            if (count%10 == 7)
            {
                return 1 ;
            }
            else {
                return 0;
            }
        }
    }
}
