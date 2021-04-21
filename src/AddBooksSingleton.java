
import Classes.BookTitle;
import com.opencsv.*;
import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.exceptions.CsvException;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AddBooksSingleton {

    private static AddBooksSingleton INSTANCE = null;
    List<BookTitle> books;
    private AddBooksSingleton() throws IOException, CsvException {
        this.books = new ArrayList<BookTitle>();
        FileReader fileName = new FileReader("/Users/roxana/IdeaProjects/Proiect/src/books.csv");

        CSVReader csvReader = new CSVReaderBuilder(fileName).build();

        List<String[]> allData = csvReader.readAll();

        for (String[] row : allData) {
            books.add(new BookTitle(row[0], row[1], row[2], Integer.parseInt(row[3])));
        }
    }

    public static AddBooksSingleton getInstance() throws IOException, CsvException {
        if (INSTANCE == null) {
            INSTANCE = new AddBooksSingleton();
        }

        return INSTANCE;
    }
}