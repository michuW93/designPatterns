package Combinator.oldStyle;

import Combinator.Customer;

import java.time.LocalDate;
import java.time.Period;

public class CustomerValidatorService {

    private boolean isEmailValid(String email){
        return email.contains("@");
    }

    private boolean isPhoneNumberPolishValid(String phoneNumber){
        return phoneNumber.startsWith("+48");
    }

    private boolean isAdultValid(LocalDate dateOfBirth){
        return Period.between(dateOfBirth, LocalDate.now()).getYears() > 18;
    }

    public boolean isValidCustomer(Customer customer){
        return isEmailValid(customer.getEmail()) && isPhoneNumberPolishValid(customer.getPhoneNumber()) && isAdultValid(customer.getDateOfBirth());
    }
}
