package Classes;

import java.util.Date;

public class BookTitle {
    String title;
    String author;
    Date dateOfPublishing;
    double ratingByReaders;
    int noOfReadersRatings;
    String genre;
    int noOfCopies;
    int noOfCopiesAvailable;

    public BookTitle(String title, String author, Date dateOfPublishing, String genre, int noOfCopies) {
        this.title = title;
        this.author = author;
        this.dateOfPublishing = dateOfPublishing;
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

    public Date getDateOfPublishing() {
        return dateOfPublishing;
    }

    public void setDateOfPublishing(Date dateOfPublishing) {
        this.dateOfPublishing = dateOfPublishing;
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
        return genre;
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
}
