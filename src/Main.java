import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Classes.*;
import Funtionalities.*;
import com.opencsv.exceptions.CsvException;

public class Main {
    public static void main(String[] args) throws IOException, CsvException {
        List<Rent> rentals = new ArrayList<Rent>();
        List<User> users = new ArrayList<User>();
        List<AffiliateCompany> companies = new ArrayList<AffiliateCompany>();
        List<BookTitle> books = AddBooksSingleton.getInstance().books;

        AddCompanies.main(companies);
        //AddBooks.main(books);

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
                String street = keyboard.nextLine();
                int streetNo = keyboard.nextInt();
                String building = keyboard.next();
                int apartmentNo = keyboard.nextInt();

                Address address = new Address(city, street, streetNo, building, apartmentNo);

                if (ChangeAddress.validAddress(address)) {
                    companies.add(new AffiliateCompany(companyName, address, subscriptionType));
                } else {
                    System.out.println("Invalid address");
                }

                /*
                for (AffiliateCompany company : companies) {
                    System.out.println(company.getCompanyName());
                }
                 */
                break;

            case 3:
                // CHANGE SUBSCRIPTION
                Services.chooseUserOrCompany();
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
/*
                    for (AffiliateCompany company : companies) {
                        System.out.println(company.getCompanySubscription().getSubscriptionType());
                    }

 */
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

                int ok1 = 0, ok2 = 0;
                for (User regUser: users) {
                    if (regUser.getFirstName().equals(firstName) && regUser.getSecondName().equals(secondName)) {
                        ok1 = 1;
                        for (BookTitle book : books) {
                            if (book.getTitle().equals(bookTitle)) {
                                ok2 = 1;
                                RentBook.main(regUser, book, rentals);
                                break;
                            }
                        }
                        break;
                    }
                }

                if (ok1 == 0) {
                    System.out.println("There's no user with this name.");
                }

                if (ok2 == 0) {
                    System.out.println("We don't have this book");
                }
                break;

            case 6:
                // RETURN BOOK
                Services.returnBookMessage();
                String firstName_ = keyboard.next();
                String secondName_ = keyboard.next();
                String bookTitle_ = keyboard.next();

                int ok1_ = 0, ok2_ = 0;

                for (User regUser: users) {
                    if (regUser.getFirstName().equals(firstName_) && regUser.getSecondName().equals(secondName_)) {
                        ok1_ = 1;
                        for (BookTitle book : books) {
                            if (book.getTitle().equals(bookTitle_)) {
                                ok2_ = 1;
                                ReturnBook.main(regUser, book, rentals);
                                break;
                            }
                        }
                        break;
                    }
                }

                if (ok1_ == 0) {
                    System.out.println("There's no user with this name.");
                }

                if (ok2_ == 0) {
                    System.out.println("We don't have this book");
                }

                break;

            case 7:
                // CHECK RETURN DATE
                Services.checkReturnDateMessage();
                String firstName__ = keyboard.next();
                String secondName__ = keyboard.next();
                String bookTitle__ = keyboard.next();

                int ok1__ = 0, ok2__ = 0;

                for (Rent rental : rentals) {
                    if (rental.getUser().getFirstName().equals(firstName__) && rental.getUser().getSecondName().equals(secondName__)) {
                        ok1__ = 1;
                        if (rental.getBook().getTitle().equals(bookTitle__)) {
                            ok2__ = 1;
                            CheckReturnDate.main(rental);
                        }
                    }
                }

                if (ok1__ == 0) {
                    System.out.println("There's no user with this name.");
                }

                if (ok2__ == 0) {
                    System.out.println("We don't have this book");
                }
                break;

            case 8:
                // EXTEND RETURN DATE
                Services.extendReturnDateMessage();
                String firstName___ = keyboard.next();
                String secondName___ = keyboard.next();
                String bookTitle___ = keyboard.next();
                int noOfExtensionDays = keyboard.nextInt();

                int ok1___ = 0, ok2___ = 0;
                for (Rent rental : rentals) {
                    if (rental.getUser().getFirstName().equals(firstName___) && rental.getUser().getSecondName().equals(secondName___)) {
                        ok1___ = 1;
                        if (rental.getBook().getTitle().equals(bookTitle___)) {
                            ok2___ = 1;
                            ExtendReturnDate.main(rental, noOfExtensionDays);
                        }
                    }
                }

                if (ok1___ == 0) {
                    System.out.println("There's no user with this name.");
                }

                if (ok2___ == 0) {
                    System.out.println("We don't have this book");
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

                int ok = 0;

                if (rating < 1 || rating > 5) {
                    System.out.println("Invalid rating");
                } else {
                    for (BookTitle book : books) {
                        if (book.getTitle().equals(bookT)) {
                            ok = 1;
                            RateTitle.main(book, rating);
                        }
                    }
                }

                if (ok == 0) {
                    System.out.println("We don't have this book");
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

                int ok_ = 0;
                for (User regUser: users) {
                    if (regUser.getFirstName().equals(firstName____) && regUser.getSecondName().equals(secondName____)) {
                        ok = 1;
                        CancelSubscription.main(users, regUser);
                        break;
                    }
                }

                if (ok_ == 0) {
                    System.out.println("There's no user with this name in our system");
                }
                break;


            default:
                System.out.println("Not a valid option number.");
        }
    }
}
