package Funtionalities;

import Classes.Rent;

import java.util.Date;

public class CheckReturnDate {
    public static boolean main(Rent bookRent) {
        Date currentDate = new Date();
        System.out.println(bookRent.getDateOfReturn().equals(currentDate));
        return bookRent.getDateOfReturn().equals(currentDate);
    }
}
