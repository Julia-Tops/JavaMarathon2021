package day11.task1;

public class Task1 {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        Courier courier = new Courier(warehouse);
        Picker picker = new Picker(warehouse);



        for (int i = 0; i <= 1500; i++) {
            courier.doWork();
            picker.doWork();
        }


        courier.bonus();
        picker.bonus();

        System.out.println(warehouse + " " + picker + " " + courier);


        Warehouse warehouse1 = new Warehouse();
        Courier courier1 = new Courier(warehouse1);
        Picker picker1 = new Picker(warehouse1);

        System.out.println(warehouse + " " + picker + " " + courier);





    }
}
