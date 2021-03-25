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
                // NEW USER
                Services.chooseUserTypeMessage();
                int typeOfUser = keyboard.nextInt();
                if (typeOfUser == 1) {
                    Services.listRegularMessage();
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
                    Address address = new Address(city, street, streetNo, building, apartmentNo);

                    //System.out.print(address.getCity());
                    //System.out.print("aa");
                    if (ChangeAddress.validAddress(address)) {
                        users.add(new Regular(firstName, secondName, email, address, subscription));
                    } else {
                        System.out.println("Invalid Address");
                    }

                    /*
                    for (User user: users) {
                        System.out.println(user.getFirstName());
                        System.out.println(user.getSecondName());
                        System.out.println(user.getAddress().getStreet());
                    }
                    */

                } else if (typeOfUser == 2) {
                    Services.listEmployeeMessage();
                    String firstName = keyboard.next();
                    String secondName = keyboard.next();
                    String email = keyboard.next();
                    String companyName = keyboard.next();
                    String jobDescription = keyboard.next();

                    //create new employee account

                    //AffiliateCompany affComp;
                    int ok = 0;
                    for (AffiliateCompany company : companies) {
                        if (company.getCompanyName().equals(companyName)) {
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
                // NEW AFFILIATE COMPANY
                Services.listAffCompMessage();
                String companyName = keyboard.next();
                String subscriptionType = keyboard.next();

                String city = keyboard.next();
                String street = keyboard.next();
                int streetNo = keyboard.nextInt();
                String building = keyboard.next();
                int apartmentNo = keyboard.nextInt();

                Address address = new Address(city, street, streetNo, building, apartmentNo);

                if (ChangeAddress.validAddress(address)) {
                    companies.add(new AffiliateCompany(companyName, address, subscriptionType));
                } else {
                    System.out.println("Invalid address");
                }
                break;

            case 3:
                // CHANGE SUBSCRIPTION
                Services.chooseUserTypeMessage();
                int userType = keyboard.nextInt();

                if (userType == 1) {
                    Services.changeSubscriptionForUserMessage();
                    String firstName = keyboard.next();
                    String secondName = keyboard.next();
                    String newSubscription = keyboard.next();

                    //validation of new subscription is made in the Subscription Class
                    for (User regUser: users) {
                        if (regUser.getFirstName().equals(firstName) && regUser.getSecondName().equals(secondName)) {
                            ChangeSubscription.main((Regular) regUser, newSubscription);
                            break;
                        }
                    }

                } else if (userType == 2) {
                    Services.changeSubscriptionForCompanyMessage();
                    String compName = keyboard.next();
                    String newSubscription = keyboard.next();

                    for (AffiliateCompany company : companies) {
                        if (company.getCompanyName().equals(compName)) {
                            ChangeSubscriptionForCompany.main(company, newSubscription);
                        }
                    }
                } else {
                    System.out.println("Invalid choice");
                }
                break;

            case 4:
                //CHANGE ADDRESS
                Services.chooseUserTypeMessage();
                int user = keyboard.nextInt();

                if (user == 1) {
                    Services.changeAddressForUserMessage();
                    String firstName = keyboard.next();
                    String secondName = keyboard.next();


                    String city_ = keyboard.next();
                    String street_ = keyboard.next();
                    int streetNo_ = keyboard.nextInt();
                    String building_ = keyboard.next();
                    int apartmentNo_ = keyboard.nextInt();

                    Address address_ = new Address(city_, street_, streetNo_, building_, apartmentNo_);

                    for (User regUser: users) {
                        if (regUser.getFirstName().equals(firstName) && regUser.getSecondName().equals(secondName)) {
                            ChangeAddress.changeForUser((Regular) regUser, address_);
                            break;
                        }
                    }

                } else if (user == 2) {
                    Services.changeAddressForCompanyMessage();
                    String compName = keyboard.next();

                    String city_ = keyboard.next();
                    String street_ = keyboard.next();
                    int streetNo_ = keyboard.nextInt();
                    String building_ = keyboard.next();
                    int apartmentNo_ = keyboard.nextInt();

                    Address address_ = new Address(city_, street_, streetNo_, building_, apartmentNo_);

                    for (AffiliateCompany company : companies) {
                        if (company.getCompanyName().equals(compName)) {
                            ChangeAddress.changeForCompany(company, address_);
                        }
                    }

                } else {
                    System.out.println("Invalid choice");
                }

                break;

            case 5:
                // RENT BOOK
                Services.rentBookMessage();
                String firstName = keyboard.next();
                String secondName = keyboard.next();
                String bookTitle = keyboard.next();

                for (User regUser: users) {
                    if (regUser.getFirstName().equals(firstName) && regUser.getSecondName().equals(secondName)) {
                        for (BookTitle book : books) {
                            if (book.getTitle().equals(bookTitle)) {
                                RentBook.main(regUser, book, rentals);
                                break;
                            }
                        }
                        break;
                    }
                }
                break;

            case 6:
                // RETURN BOOK
                Services.returnBookMessage();
                String firstName_ = keyboard.next();
                String secondName_ = keyboard.next();
                String bookTitle_ = keyboard.next();

                for (User regUser: users) {
                    if (regUser.getFirstName().equals(firstName_) && regUser.getSecondName().equals(secondName_)) {
                        for (BookTitle book : books) {
                            if (book.getTitle().equals(bookTitle_)) {
                                ReturnBook.main(regUser, book, rentals);
                                break;
                            }
                        }
                        break;
                    }
                }
                break;

            case 7:
                // CHECK RETURN DATE
                Services.checkReturnDateMessage();
                String firstName__ = keyboard.next();
                String secondName__ = keyboard.next();
                String bookTitle__ = keyboard.next();

                for (Rent rental : rentals) {
                    if (rental.getUser().getFirstName().equals(firstName__) && rental.getUser().getSecondName().equals(secondName__)) {
                        if (rental.getBook().getTitle().equals(bookTitle__)) {
                            CheckReturnDate.main(rental);
                        }
                    }
                }
                break;

            case 8:
                // EXTEND RETURN DATE
                Services.extendReturnDateMessage();
                String firstName___ = keyboard.next();
                String secondName___ = keyboard.next();
                String bookTitle___ = keyboard.next();
                int noOfExtensionDays = keyboard.nextInt();

                for (Rent rental : rentals) {
                    if (rental.getUser().getFirstName().equals(firstName___) && rental.getUser().getSecondName().equals(secondName___)) {
                        if (rental.getBook().getTitle().equals(bookTitle___)) {
                            ExtendReturnDate.main(rental, noOfExtensionDays);
                        }
                    }
                }
                break;

            case 9:
                // SEARCH BOOK BY GENRE
                Services.searchBookByGenreMessage();
                String genre = keyboard.next();
                SearchBookByGenre.main(books, genre);
                break;

            case 10:
                // SEARCH TOP BOOKS
                SearchTopBooks.main(books);
                break;

            case 11:
                // RATE TITLE
                Services.rateTitleMessage();
                String bookT = keyboard.next();
                int rating = keyboard.nextInt();

                if (rating < 1 || rating > 5) {
                    System.out.println("Invalid rating");
                } else {
                    for (BookTitle book : books) {
                        if (book.getTitle().equals(bookT)) {
                            RateTitle.main(book, rating);
                        }
                    }
                }
                break;

            case 12:
                // GET TOP READING COMPANIES
                GetTopReadingCompanies.main(companies);
                break;

            case 13:
                // LIST EMPLOYEES READINGS
                Services.listEmployeesReadingsMessage();
                String company = keyboard.next();
                for (AffiliateCompany comp : companies) {
                    if (comp.getCompanyName().equals(company)) {
                        ListEmployeesReadings.main(comp, rentals);
                    }
                }
                break;

            case 14:
                // CANCEL SUBSCRIPTIONS
                Services.cancelSubscriptionMessage();
                String firstName____ = keyboard.next();
                String secondName____ = keyboard.next();

                for (User regUser: users) {
                    if (regUser.getFirstName().equals(firstName____) && regUser.getSecondName().equals(secondName____)) {
                        CancelSubscription.main(users, regUser);
                    }
                }
                break;


            default:
                System.out.println("Not a valid option number.");
        }
    }
}
