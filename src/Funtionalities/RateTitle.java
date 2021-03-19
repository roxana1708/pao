package Funtionalities;

import Classes.BookTitle;

public class RateTitle {
    public static void main(BookTitle book, int newRateByReader) {
        if (book.getRatingByReaders() == 0) {
            book.setRatingByReaders(newRateByReader);
            book.increaseNoOfReadersRatings();
        } else {
            double sumOfRatings = book.getNoOfReadersRatings() * book.getRatingByReaders() + newRateByReader;
            book.increaseNoOfReadersRatings();
            book.setRatingByReaders(sumOfRatings / book.getNoOfReadersRatings());
        }
    }
}
