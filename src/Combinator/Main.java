package Combinator;

import Combinator.oldStyle.CustomerValidatorService;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Customer validCustomer = new Customer("Michu", "michal@gmail.com", "+4810232", LocalDate.of(1993, 8, 18));
        Customer notValidCustomer = new Customer("Tymon", "tymon@gmail.com", "+4810232", LocalDate.of(2010, 12, 10));

        CustomerValidatorService customerValidatorService = new CustomerValidatorService();
        System.out.println(customerValidatorService.isValidCustomer(validCustomer));
        System.out.println(customerValidatorService.isValidCustomer(notValidCustomer));
    }
}