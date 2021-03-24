package Funtionalities;

import Classes.BookTitle;
import Classes.Rent;
import Classes.User;

import java.util.List;

public class ReturnBook {
    public static void main(User user, BookTitle book, List<Rent> rentals) {
        book.increaseNoOfCopies();
        rentals.removeIf(rental -> rental.getBook() == book && rental.getUser() == user);
    }
}
