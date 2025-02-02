package Lamda;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class LamdaExample{
    static int price = 20;
    public static void main(String[] args) throws FileNotFoundException {
        // Method 1 (Using separate class)
//        ChefService chefService = new ChefService();
//        chefService.cook("Dosa");
//        System.out.println("Chef ID : "+chefService.getChefIdByName("Bk"));

        // Method 2 (Anonymous class)
//        Chef chef = new Chef() {
//            @Override
//            public void cook(String dish) {
//                System.out.println("Chef Cooking..."+dish);
//            }
//        };
//
//        chef.cook("Idly");
//        System.out.println("Chef ID : "+chefService.getChefIdByName("Bk"));

        // Method 3 (Using Lambda)
        Chef chef2 = (dish) -> System.out.println("Chef Cooking..." + dish);
        PrintService printService = () -> System.out.println("You have to pay : " + price);
        chef2.cook("Vada");
        printService.print();
        price = 40;
        printService.print();

//        chef2.printBill(price, new FileOutputStream("bill.txt"));

    }


}
