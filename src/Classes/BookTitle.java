package Classes;

import com.opencsv.*;
import com.opencsv.bean.CsvBindByPosition;

public class BookTitle implements Comparable<BookTitle>{

    //@CsvBindByPosition(position = 0)
    String title;

    //@CsvBindByPosition(position = 1)
    String author;

    //@CsvBindByPosition(position = 2)
    String genre;

    //@CsvBindByPosition(position = 3)
    int noOfCopies;

    //@CsvBindByPosition(position = 4)
    int noOfCopiesAvailable;

    double ratingByReaders;
    int noOfReadersRatings;


    public BookTitle(String title, String author, String genre, int noOfCopies) {
        this.title = title;
        this.author = author;
        this.ratingByReaders = 0;
        this.genre = genre;
        this.noOfCopies = noOfCopies;
        this.noOfCopiesAvailable = noOfCopies;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getRatingByReaders() {
        return ratingByReaders;
    }

    public void setRatingByReaders(double ratingByReaders) {
        this.ratingByReaders = ratingByReaders;
    }

    public int getNoOfReadersRatings() {
        return noOfReadersRatings;
    }

    public void increaseNoOfReadersRatings() {
        this.noOfReadersRatings++;
    }

    public String getGenre() {
        return this.genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getNoOfCopies() {
        return noOfCopies;
    }

    public int getNoOfCopiesAvailable() {
        return noOfCopiesAvailable;
    }

    public void increaseNoOfCopies() {
        this.noOfCopiesAvailable++;
    }

    @Override
    public int compareTo(BookTitle bt) {
        return Double.compare(getRatingByReaders(), bt.getRatingByReaders());
    }

}
