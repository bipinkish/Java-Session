package Lamda;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

@FunctionalInterface
public interface Chef {
    void cook(String dish);

    default int getChefIdByName(String name) {
        return (int) (Math.random()*10);
    }

    default void printBill(int price, OutputStream outputStream){
        String details = "You have to pay $"+price;
        try {
            outputStream.write(details.getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    static void getRestaurantDetails(){
        System.out.println("ABC Restaurant");
        System.out.println("Pure Veg");
        System.out.println("Chennai - 28");
    }
}
