package Funtionalities;

import Classes.*;

import java.util.List;

public class RentBook {
    public static void main(User user, BookTitle book, List<Rent> rentals) {
        int noRentedBooks = 0;
        for (Rent rental : rentals) {
            if (rental.getUser() == user) {
                noRentedBooks++;
            }
        }

        if (noRentedBooks >= user.getSubscription().getMaximumNoOfBooksPerPerson()) {
            System.out.println("You've reached your maximum number of rented books");
        } else {
            if (book.getNoOfCopiesAvailable() > 0) {
                rentals.add(new Rent(user, book));
            } else {
                System.out.println("The chosen title is unavailable.");
            }
        }

    }
}
