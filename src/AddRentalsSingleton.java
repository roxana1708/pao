import Classes.*;
import Funtionalities.RentBook;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvException;

import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class AddRentalsSingleton {
    private static AddRentalsSingleton INSTANCE = null;
    List<Rent> rentals;

    private AddRentalsSingleton(List<User> users, List<BookTitle> books) throws IOException, CsvException, ParseException {
        this.rentals = new ArrayList<Rent>();
        FileReader fileName = new FileReader("/Users/roxana/IdeaProjects/Proiect/src/rentals.csv");

        CSVReader csvReader = new CSVReaderBuilder(fileName).build();

        List<String[]> allData = csvReader.readAll();

        for (String[] row : allData) {
            //TODO: search and ad
            for (User regUser: users) {
                if (regUser.getFirstName().equals(row[0]) && regUser.getSecondName().equals(row[1])) {
                    for (BookTitle book : books) {
                        if (book.getTitle().equals(row[2])) {
                            rentals.add(new Rent(regUser, book, new SimpleDateFormat("dd/MM/yyyy").parse(row[3])));
                            break;
                        }
                    }
                    break;
                }
            }
        }
    }

    public static AddRentalsSingleton getInstance(List<User> users, List<BookTitle> books) throws IOException, CsvException, ParseException {
        if (INSTANCE == null) {
            INSTANCE = new AddRentalsSingleton(users, books);
        }

        return INSTANCE;
    }
}
