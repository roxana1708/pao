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

    public static void listRegular() {
        System.out.println("Please enter the following information:");
        System.out.println("First Name");
        System.out.println("Second Name");
        System.out.println("Email");
        System.out.println("Subscription");
        System.out.println("Home Address in this format: city, street, streetNo, building, apartmentNo");
    }

    public static void listEmployee() {
        System.out.println("Please enter the following information:");
        System.out.println("First Name");
        System.out.println("Second Name");
        System.out.println("Email");
        System.out.println("Company");
        System.out.println("Job Description");
    }

    public static void listAffComp() {
        System.out.println("Please enter the following information:");
        System.out.println("Company Name");
        System.out.println("Subscription");
        System.out.println("Home Address in this format: city, street, streetNo, building, apartmentNo");
    }
}
