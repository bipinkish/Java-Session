package Optionals;

import java.util.Optional;

public class Optional_ {
    public static void main(String[] args) {
//        Customer customer = getCustomerByNameWithoutOptional("Ak");
//        if(customer!=null){
//            System.out.println(customer.phnNo());
//        } else {
//            System.out.println(0);
//        }

        Optional<Customer> optionalCustomer = getCustomerByName("Ak");
        optionalCustomer.orElseThrow(()->new RuntimeException("Customer not found"));
        Customer customer = optionalCustomer.orElse(new Customer("UNKNOWN","NIL"));
        System.out.println(customer.phnNo());


        //Other method
        //orElseGet


    }

    static Customer getCustomerByNameWithoutOptional(String name){
        Customer customer = new Customer(name,"3434343");
        return customer;
    }

    static Optional<Customer> getCustomerByName(String name){
        Customer customer = new Customer(name,"3434343");
        return Optional.ofNullable(customer);
    }

}
