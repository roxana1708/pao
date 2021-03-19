package Classes;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Subscription {
    String subscriptionType;
    Date subscriptionExpirationDate;
    int maximumNoOfBooksPerPerson;

    public Subscription(String subscriptionType) {
        setSubscriptionType(subscriptionType);
    }

    public String getSubscriptionType() {
        return subscriptionType;
    }

    public void setSubscriptionType(String subscriptionType) {
        Date currentDate = new Date();
        Calendar calendar = Calendar.getInstance();
        switch (subscriptionType.toUpperCase()) {
            case "BRONZ":
                this.subscriptionType = subscriptionType;
                this.maximumNoOfBooksPerPerson = 1;
                calendar.setTime(currentDate);
                calendar.add(Calendar.YEAR, 1);
                this.subscriptionExpirationDate = calendar.getTime();
                break;

            case "SILVER":
                this.subscriptionType = subscriptionType;
                this.maximumNoOfBooksPerPerson = 2;
                calendar.setTime(currentDate);
                calendar.add(Calendar.YEAR, 1);
                this.subscriptionExpirationDate = calendar.getTime();
                break;

            case "GOLD":
                this.subscriptionType = subscriptionType;
                this.maximumNoOfBooksPerPerson = 3;
                calendar.setTime(currentDate);
                calendar.add(Calendar.YEAR, 1);
                this.subscriptionExpirationDate = calendar.getTime();
                break;

            case "PLATINUM":
                this.subscriptionType = subscriptionType;
                this.maximumNoOfBooksPerPerson = 4;
                calendar.setTime(currentDate);
                calendar.add(Calendar.YEAR, 2);
                this.subscriptionExpirationDate = calendar.getTime();
                break;

        }
    }

    public Date getSubscriptionExpirationDate() {
        return subscriptionExpirationDate;
    }

    public int getMaximumNoOfBooksPerPerson() {
        return maximumNoOfBooksPerPerson;
    }
}
