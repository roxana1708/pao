package Funtionalities;

import Classes.BookTitle;
import Classes.Rent;
import Classes.User;

import java.util.List;

public class ReturnBook {
    public static void main(User user, BookTitle book, List<Rent> rentals) {
        book.increaseNoOfCopies();
        //delete rent instance for this book rental
    }
}
