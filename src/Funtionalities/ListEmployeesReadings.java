package Funtionalities;

import Classes.AffiliateCompany;
import Classes.Employees;
import Classes.Rent;

import java.util.Collections;
import java.util.List;

public class ListEmployeesReadings {
    public static void main(AffiliateCompany company, List<Rent> rentals) {
        Collections.reverse(rentals);
        for (Employees employee : company.getEmployees()) {
            //if (rentals.contains(employee)) {
                for (Rent rental : rentals) {
                    if (rental.getUser().getFirstName() == employee.getFirstName()) {
                        System.out.println(rental.getBook().getTitle());
                    }
                }
            //}
        }
    }
}
