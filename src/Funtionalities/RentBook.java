package Funtionalities;

import Classes.*;

import java.util.List;

public class RentBook {
    public static void main(User user, BookTitle book, List<Rent> rentals) {
        //trb verificat, in functie de abonament, daca userul mai poate imprumuta o carte -- maximumNoOfBooksPerPerson
        //user.getSubscription().getMaximumNoOfBooksPerPerson()
        if (book.getNoOfCopiesAvailable() > 0) {
            rentals.add(new Rent(user, book));
        } else {
            System.out.println("The chosen title is unavailable.");
        }

    }
}
