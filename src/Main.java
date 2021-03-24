import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Classes.*;
import Funtionalities.*;

public class Main {
    public static void main(String[] args) {
        List<Rent> rentals = new ArrayList<Rent>();
        List<User> users = new ArrayList<User>();
        List<AffiliateCompany> companies = new ArrayList<AffiliateCompany>();
        List<BookTitle> books = new ArrayList<BookTitle>();

        Services.main();

        Scanner keyboard = new Scanner(System.in);
        System.out.println("enter an integer");
        int optionChoice = keyboard.nextInt();

        switch (optionChoice) {
            case 1:
                String typeOfUser = keyboard.next();
                if (typeOfUser == "Regular") {
                    Services.listRegular();
                    String firstName = keyboard.next();
                    String secondName = keyboard.next();
                    String email = keyboard.next();
                    String subscription = keyboard.next();

                    //homeAddress
                    String city = keyboard.next();
                    String street = keyboard.next();
                    int streetNo = keyboard.nextInt();
                    String building = keyboard.next();
                    int apartmentNo = keyboard.nextInt();

                    //create new account
                    users.add(new Regular(firstName, secondName, email, new Address(city, street, streetNo, building, apartmentNo), subscription));

                } else if (typeOfUser == "Employee") {
                    Services.listEmployee();
                    String firstName = keyboard.next();
                    String secondName = keyboard.next();
                    String email = keyboard.next();
                    String companyName = keyboard.next();
                    String jobDescription = keyboard.next();

                    //create new employee account

                    //AffiliateCompany affComp;
                    int ok = 0;
                    for (AffiliateCompany company : companies) {
                        if (company.getCompanyName() == companyName) {
                            //affComp = company;
                            ok = 1;
                            Employees e = new Employees(firstName, secondName, email, company, jobDescription);
                            users.add(e);
                            company.getEmployees().add(e);
                            break;
                        }
                    }

                    if (ok == 0) {
                        System.out.println("You've chosed a company we are not currently working with");
                    }

                } else {
                    System.out.println("Not a valid type of user");
                }
                break;

            case 2:
                Services.listAffComp();
                String companyName = keyboard.next();
                String subscriptionType = keyboard.next();

                String city = keyboard.next();
                String street = keyboard.next();
                int streetNo = keyboard.nextInt();
                String building = keyboard.next();
                int apartmentNo = keyboard.nextInt();

                companies.add(new AffiliateCompany(companyName, new Address(city, street, streetNo, building, apartmentNo), subscriptionType));
                break;

            case 3:
                System.out.println("Regular User (1) of Affiliate Company(2)?");
                int userType = keyboard.nextInt();

                if (userType == 1) {
                    System.out.println("Type First Name, Second Name and Name of the New Subscription Type");
                    String firstName = keyboard.next();
                    String secondName = keyboard.next();
                    String newSubscription = keyboard.next();

                    //validation of new subscription is made in the Subscription Class
                    for (User regUser: users) {
                        if (regUser.getFirstName() == firstName && regUser.getSecondName() == secondName) {
                            ChangeSubscription.main((Regular) regUser, newSubscription);
                            break;
                        }
                    }

                } else if (userType == 2) {
                    System.out.println("Type Company Name and Name of the New Subscription Type");
                    String compName = keyboard.next();
                    String newSubscription = keyboard.next();

                    for (AffiliateCompany company : companies) {
                        if (company.getCompanyName() == compName) {
                            ChangeSubscriptionForCompany.main(company, newSubscription);
                        }
                    }
                } else {
                    System.out.println("Invalid choice");
                }
                break;

            case 4:
                System.out.println("Regular User (1) of Affiliate Company(2)?");
                int user = keyboard.nextInt();

                if (user == 1) {
                    System.out.println("Type First Name, Second Name and Name of the New Subscription Type");
                    String firstName = keyboard.next();
                    String secondName = keyboard.next();


                    String city_ = keyboard.next();
                    String street_ = keyboard.next();
                    int streetNo_ = keyboard.nextInt();
                    String building_ = keyboard.next();
                    int apartmentNo_ = keyboard.nextInt();

                    Address address = new Address(city_, street_, streetNo_, building_, apartmentNo_);

                    for (User regUser: users) {
                        if (regUser.getFirstName() == firstName && regUser.getSecondName() == secondName) {
                            ChangeAddress.changeForUser((Regular) regUser, address);
                            break;
                        }
                    }

                } else if (user == 2) {
                    System.out.println("Type Company Name and Name of the New Subscription Type");
                    String compName = keyboard.next();

                    String city_ = keyboard.next();
                    String street_ = keyboard.next();
                    int streetNo_ = keyboard.nextInt();
                    String building_ = keyboard.next();
                    int apartmentNo_ = keyboard.nextInt();

                    Address address = new Address(city_, street_, streetNo_, building_, apartmentNo_);

                    for (AffiliateCompany company : companies) {
                        if (company.getCompanyName() == compName) {
                            ChangeAddress.changeForCompany(company, address);
                        }
                    }

                } else {
                    System.out.println("Invalid choice");
                }

                break;

            case 5:
                System.out.println("Type First Name, Second Name and Name of the New Subscription Type");
                String firstName = keyboard.next();
                String secondName = keyboard.next();
                String bookTitle = keyboard.next();

                for (User regUser: users) {
                    if (regUser.getFirstName() == firstName && regUser.getSecondName() == secondName) {
                        for (BookTitle book : books) {
                            if (book.getTitle() == bookTitle) {
                                RentBook.main(regUser, book, rentals);
                                break;
                            }
                        }
                        break;
                    }
                }
                break;

            case 6:
                System.out.println("Type First Name, Second Name and Name of the New Subscription Type");
                String firstName_ = keyboard.next();
                String secondName_ = keyboard.next();
                String bookTitle_ = keyboard.next();

                for (User regUser: users) {
                    if (regUser.getFirstName() == firstName_ && regUser.getSecondName() == secondName_) {
                        for (BookTitle book : books) {
                            if (book.getTitle() == bookTitle_) {
                                ReturnBook.main(regUser, book, rentals);
                                break;
                            }
                        }
                        break;
                    }
                }
                break;

            case 7:
                System.out.println("Type First Name, Second Name and Name of the New Subscription Type");
                String firstName__ = keyboard.next();
                String secondName__ = keyboard.next();
                String bookTitle__ = keyboard.next();

                for (Rent rental : rentals) {
                    if (rental.getUser().getFirstName() == firstName__ && rental.getUser().getSecondName() == secondName__) {
                        if (rental.getBook().getTitle() == bookTitle__) {
                            CheckReturnDate.main(rental);
                        }
                    }
                }
                break;

            case 8:
                System.out.println("Type First Name, Second Name and Name of the New Subscription Type");
                String firstName___ = keyboard.next();
                String secondName___ = keyboard.next();
                String bookTitle___ = keyboard.next();
                int noOfExtensionDays = keyboard.nextInt();

                for (Rent rental : rentals) {
                    if (rental.getUser().getFirstName() == firstName___ && rental.getUser().getSecondName() == secondName___) {
                        if (rental.getBook().getTitle() == bookTitle___) {
                            ExtendReturnDate.main(rental, noOfExtensionDays);
                        }
                    }
                }
                break;

            case 9:
                String genre = keyboard.next();
                SearchBookByGenre.main(books, genre);
                break;

            case 10:
                SearchTopBooks.main(books);
                break;

            case 11:
                String bookT = keyboard.next();
                int rating = keyboard.nextInt();

                for (BookTitle book: books) {
                    if (book.getTitle() == bookT) {
                        RateTitle.main(book, rating);
                    }
                }
                break;

            case 12:
                GetTopReadingCompanies.main(companies);
                break;

            case 13:
                String company = keyboard.next();
                for (AffiliateCompany comp : companies) {
                    if (comp.getCompanyName() == company) {
                        ListEmployeesReadings.main(comp, rentals);
                    }
                }
                break;

            case 14:
                System.out.println("Type First Name, Second Name and Name of the New Subscription Type");
                String firstName____ = keyboard.next();
                String secondName____ = keyboard.next();

                for (User regUser: users) {
                    if (regUser.getFirstName() == firstName____ && regUser.getSecondName() == secondName____) {
                        CancelSubscription.main(users, regUser);
                    }
                }
                break;


            default:
                System.out.println("Not a valid option number.");
        }
    }
}
