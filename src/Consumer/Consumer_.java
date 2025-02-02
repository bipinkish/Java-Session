package Consumer;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Consumer_ {
    public static void main(String[] args) {
        Customer c1 = new Customer("Ak", "84758475");
        registerUserWithConsumer.accept(c1);
        registerUserV2.accept(c1, false);
    }

    static void registerUser(Customer customer){
        System.out.println("Hi "+customer.name()+", Thanks for registering with number : "+customer.phnNo());
    }

    // Take 1 argument and return nothing
    static Consumer<Customer> registerUserWithConsumer = customer ->
            System.out.println("Hi "+customer.name()+", Thanks for registering with number : "+customer.phnNo());

    static BiConsumer<Customer, Boolean> registerUserV2 = (customer, canShowPhnNo) ->
            System.out.println("Hi "+customer.name()+", Thanks for registering with number : "+
                    (canShowPhnNo ? customer.phnNo() : "*******"));
}
