package Supplier;

import java.util.List;
import java.util.function.Supplier;

public class Supplier_ {

    public static void main(String[] args) {
        System.out.println("Getting the List of customers...");
        System.out.println(getAllCustomers.get());
    }

    static Supplier<List<Customer>> getAllCustomers = () ->
            List.of(new Customer("Bk","3434"),
                    new Customer("SK","6576564"));
}
