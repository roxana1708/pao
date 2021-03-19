package Funtionalities;

import Classes.*;

import java.util.Date;
import java.util.Locale;

public class Tests {
    public static void main(String[] args) {
        Regular regularUser = new Regular("Ana", "Maria", "anamaria@yahoo.com", new Address("Brasov", "Sas", 100, "B54", 334), "bronz");

        /// test ChangeAddress
        /*
        Address newAddress = new Address("Bucuresti", "Staicovici", 10, "B4", 3);

        System.out.println(regularUser.getAddress().getStreet());

        ChangeAddress.main(regularUser, newAddress);

        System.out.println(regularUser.getAddress().getStreet());
        */

        /// test ChangeSubscription
        /*
        System.out.println(regularUser.getSubscription().getSubscriptionType());
        System.out.println(regularUser.getSubscription().getMaximumNoOfBooksPerPerson());
        ChangeSubscription.main(regularUser, "gold");
        System.out.println(regularUser.getSubscription().getSubscriptionType());
        System.out.println(regularUser.getSubscription().getMaximumNoOfBooksPerPerson());
        */

        /// test ChangeSubscriptionForCompany
        /*
        AffiliateCompany comp1 = new AffiliateCompany("Digi", new Address("Bucuresti", "Staicovici", 10, "B4", 3), "gold");
        Employees emp1 = new Employees("Chris", "E", "mail@", new Address("Brasov", "Sas", 100, "B54", 334), comp1, "Assistent Manager");
        Employees emp2 = new Employees("Rares", "G", "mail@", new Address("Brasov", "Sas", 100, "B54", 334), comp1, "Lawyer");
            //Employees[] digiEmpl = {emp1, emp2};

            //vector in cls aff comp cu toti angajatii?

        System.out.println(comp1.getCompanySubscription().getSubscriptionType());
        System.out.println(comp1.getCompanySubscription().getMaximumNoOfBooksPerPerson());
        ChangeSubscriptionForCompany.main(comp1, "platinum");
        System.out.println(comp1.getCompanySubscription().getSubscriptionType());
        System.out.println(comp1.getCompanySubscription().getMaximumNoOfBooksPerPerson());
        */

        /// test CheckReturnDate
        /*
        BookTitle book1 = new BookTitle("a", "b", new Date(), 4, "comedy", 10);
        Rent bookRental1 = new Rent(regularUser, book1, 0);
         */

        //System.out.println(CheckReturnDate.main(bookRental1));

        /// test ExtendReturnDate
        /*
        ExtendReturnDate.main(bookRental1, 23);
        System.out.println(bookRental1.getDateOfReturn());
         */

        BookTitle book1 = new BookTitle("a", "b", new Date(), "comedy", 10);
        RateTitle.main(book1, 3);
        System.out.println(book1.getRatingByReaders());
        RateTitle.main(book1, 4);
        System.out.println(book1.getRatingByReaders());
    }
}
