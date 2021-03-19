package Funtionalities;

import Classes.*;

public class RentBook {
    public static void main(User user, BookTitle book) {
        //trb verificat, in functie de abonament, daca userul mai poate imprumuta o carte -- maximumNoOfBooksPerPerson
        //user.getSubscription().getMaximumNoOfBooksPerPerson()
        if (book.getNoOfCopiesAvailable() > 0) {
            Rent newBookRental = new Rent(user, book);
        } else {
            System.out.println("The chosen title is unavailable.");
        }

    }
}
