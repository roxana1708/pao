import java.util.logging.SocketHandler;

public class Services {
    public static void main() {
        System.out.println("Type the number of the operation you want to execute:");
        //System.out.println("0 - Login In");
        System.out.println("1 - New User");
        System.out.println("2 - New Affiliate Company");
        System.out.println("3 - Change Subscription");
        System.out.println("4 - Change Address");
        System.out.println("5 - Rent Book");
        System.out.println("6 - Return Book");
        System.out.println("7 - Check Return Date");
        System.out.println("8 - Extend Return Date");
        System.out.println("9 - Search Book By Genre");
        System.out.println("10 - Search Top Books");
        System.out.println("11 - Rate Title");
        System.out.println("12 - Get Top Reading Companies");
        System.out.println("13 - List Employees Readings");
        System.out.println("14 - Cancel Subscription");
    }

    public static void listRegularMessage() {
        System.out.println("Please enter the following information:");
        System.out.println("First Name");
        System.out.println("Second Name");
        System.out.println("Email");
        System.out.println("Subscription");
        System.out.println("Home Address in this format: city, street, streetNo, building, apartmentNo");
    }

    public static void listEmployeeMessage() {
        System.out.println("Please enter the following information:");
        System.out.println("First Name");
        System.out.println("Second Name");
        System.out.println("Email");
        System.out.println("Company");
        System.out.println("Job Description");
    }

    public static void listAffCompMessage() {
        System.out.println("Please enter the following information:");
        System.out.println("Company Name");
        System.out.println("Subscription");
        System.out.println("Office Address in this format: city, street, streetNo, building, apartmentNo");
    }

    public static void chooseUserTypeMessage() {
        System.out.println("Regular User (1) or Employee(2)?");
    }

    public static void changeSubscriptionForUserMessage() {
        System.out.println("Type your first name, second name and the name of the new subscription type you've chosen");
    }

    public static void changeSubscriptionForCompanyMessage() {
        System.out.println("Type the company name and the name of the new subscription type they've chosen");
    }

    public static void changeAddressForUserMessage() {
        System.out.println("Type your first name, second name and your new address in format: city, street, streetNo, building, apartmentNo");
    }

    public static void changeAddressForCompanyMessage() {
        System.out.println("Type the company name and the new office address in the format: city, street, streetNo, building, apartmentNo");
    }

    public static void rentBookMessage() {
        System.out.println("Type your first name, second name and the title of the book you want to rent");
    }

    public static void returnBookMessage() {
        System.out.println("Type your first name, second name and the title of the book you want to return");
    }

    public static void checkReturnDateMessage() {
        System.out.println("Type your first name, second name and the title of the book you want to check the return date for");
    }

    public static void extendReturnDateMessage() {
        System.out.println("Type your first name, second name and the title of the book you want to extend the reading period for");
    }

    public static void searchBookByGenreMessage() {
        System.out.println("Type the genre you are searching for");
    }

    public static void rateTitleMessage() {
        System.out.println("Type the title of the book you want to rate and the rating (from 1 to 5 starts)");
    }

    public static void listEmployeesReadingsMessage() {
        System.out.println("Type the name of the company");
    }

    public static void cancelSubscriptionMessage() {
        System.out.println("Type your first name and second name, sorry you're leaving");
    }

}
