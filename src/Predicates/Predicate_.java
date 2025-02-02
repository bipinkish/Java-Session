package Predicates;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class Predicate_ {
    public static void main(String[] args) {
        Customer c1=new Customer("Bk","9172725721");
        System.out.println(validatePhneNumbStarting.and(validatePhneNumbLength).test(c1));
    }

    static Predicate<Customer> validatePhneNumbStarting = customer -> customer.phnNo().startsWith("91");
    static Predicate<Customer> validatePhneNumbLength = customer -> customer.phnNo().length() == 10;
}
