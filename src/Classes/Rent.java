package Classes;

import java.util.Calendar;
import java.util.Date;

public class Rent {
    User user;
    BookTitle book;
    Date dateOfReturn;
    int noDaysOfExtension;

    public Rent(User user, BookTitle book) {
        this.user = user;
        this.book = book;

        //this.dateOfReturn = dateOfReturn;
        Calendar calendar = Calendar.getInstance();
        Date currentDate = new Date();
        calendar.setTime(currentDate);

        calendar.add(Calendar.DAY_OF_MONTH, this.noDaysOfExtension);
        this.dateOfReturn = calendar.getTime();
        //

        this.noDaysOfExtension = 0;
        book.noOfCopiesAvailable--;
    }

    public User getUser() {
        return user;
    }

    public BookTitle getBook() {
        return book;
    }

    //public Date getDateOfReturn() {
        //return dateOfReturn;
    //}

    public int getNoDaysOfExtension() {
        return noDaysOfExtension;
    }

    public void setNoDaysOfExtension(int noDaysOfExtension) {
        this.noDaysOfExtension = noDaysOfExtension;
    }

    public Date getDateOfReturn() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(this.dateOfReturn);

        calendar.add(Calendar.DAY_OF_MONTH, this.noDaysOfExtension);

        return calendar.getTime();
    }

    public void extendReturnDate(int noOfDays) {
        if (noOfDays > 21) {
            System.out.println("The requested number of days exceeds our policy of extension. Please type a number below 21");
        } else {
            setNoDaysOfExtension(noOfDays);
            System.out.println("Your request has been approved");
            System.out.println("New date of return is " + getDateOfReturn());
        }
    }
}
