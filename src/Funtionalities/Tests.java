package Funtionalities;

import Classes.*;

import java.util.*;

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

        BookTitle book1 = new BookTitle("a", "b", new Date(), "comedy", 0);
        BookTitle book2 = new BookTitle("b", "b", new Date(), "comedy", 0);

        /// test RateTitle
        /*
        RateTitle.main(book1, 3);
        System.out.println(book1.getRatingByReaders());
        RateTitle.main(book1, 4);
        System.out.println(book1.getRatingByReaders());
         */

        /// test RentBook

        //RentBook.main(regularUser, book1);
        //System.out.println(book1.getNoOfCopiesAvailable());

        /// Search Book by ...

        /*
        BookTitle[] books = new BookTitle[4];
        books[0] = new BookTitle("4321", "Paul Auster", new Date(), "fiction", 4);
        books[1] = new BookTitle("Despre Destin", "Liiceanu & Plesu", new Date(), "philosophy", 2);
        books[2] = new BookTitle("Cartea Iluziilor", "Paul Auster", new Date(), "fiction", 3);
        books[3] = new BookTitle("The Castle", "Franz Kafka", new Date(), "classic", 8);

        BookTitle[] byGenre = new BookTitle[books.length];

        byGenre = SearchBookByGenre.main(books, "fiction");

        System.out.println();
        for (BookTitle book : byGenre) {
            System.out.println(book.getTitle());
        }

        System.out.println();
        System.out.println();
        System.out.println();

        RateTitle.main(books[0], 5);
        RateTitle.main(books[1], 4);
        RateTitle.main(books[2], 5);
        RateTitle.main(books[3], 4);

        SearchTopBooks.main(Arrays.asList(books));

         */

        /*
        Regular regularUser2 = new Regular("Ana2", "Maria", "anamaria@yahoo.com", new Address("Brasov", "Sas", 100, "B54", 334), "bronz");
        Regular regularUser3 = new Regular("Ana3", "Maria", "anamaria@yahoo.com", new Address("Brasov", "Sas", 100, "B54", 334), "bronz");

        List<User> users = new ArrayList<User>();

        users.add(regularUser);
        users.add(regularUser2);
        users.add(regularUser3);

        CancelSubscription.main(users, regularUser2);

        for (User user: users) {
            System.out.println(user.getFirstName());
        }
        */

        Regular regularUser2 = new Regular("Ana2", "Maria", "anamaria@yahoo.com", new Address("Brasov", "Sas", 100, "B54", 334), "bronz");
        Regular regularUser3 = new Regular("Ana3", "Maria", "anamaria@yahoo.com", new Address("Brasov", "Sas", 100, "B54", 334), "bronz");

/*
        List<AffiliateCompany> companies = new ArrayList<AffiliateCompany>();
        AffiliateCompany comp1 = new AffiliateCompany("digi", new Address("Bucuresti", "Staicovici", 75, "Forum2000", 1), "platinum");
        AffiliateCompany comp2 = new AffiliateCompany("gts", new Address("Bucuresti", "Staicovici", 105, "B2", 1), "gold");
        //Employees empl1 = new Employees("ro", "ghe", "roki@trp.com", new Address("Bucuresti", "Staicovici", 45-49, "Forum2000", 1), comp1, "ceo");
        //Employees empl2 = new Employees("ca", "ghe", "ca@trp.com", new Address("Bucuresti", "Staicovici", 45-49, "Forum2000", 1), comp1, "cfo");
        //Employees empl3 = new Employees("c", "h", "ch@trp.com", new Address("Bucuresti", "Staicovici", 45-49, "Forum2000", 1), comp2, "ceo");

        comp1.addEmployee(empl1);
        comp1.addEmployee(empl2);
        comp2.addEmployee(empl3);

        companies.add(comp1);
        companies.add(comp2);

        //GetTopReadingCompanies.main(companies);

        List<Rent> rentals = new ArrayList<Rent>();

        Rent rent1 = new Rent(empl1, book1);
        Rent rent2 = new Rent(empl2, book2);
        Rent rent3 = new Rent(empl3, book1);
        //Rent rent4 = new Rent(empl1, book1);

        rentals.add(rent1);
        rentals.add(rent2);
        rentals.add(rent3);

        ListEmployeesReadings.main(comp1, rentals);

 */
    }
}
