import Classes.Address;
import Classes.AffiliateCompany;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvException;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AddCompaniesSingleton {
    private static AddCompaniesSingleton INSTANCE = null;
    List<AffiliateCompany> companies;

    private AddCompaniesSingleton() throws IOException, CsvException {
        this.companies = new ArrayList<AffiliateCompany>();
        FileReader fileName = new FileReader("/Users/roxana/IdeaProjects/Proiect/src/companies.csv");

        CSVReader csvReader = new CSVReaderBuilder(fileName).build();

        List<String[]> allData = csvReader.readAll();

        for (String[] row : allData) {
            companies.add(new AffiliateCompany(row[0], new Address(row[1], row[2], Integer.parseInt(row[3]), row[4], Integer.parseInt(row[5])), row[6]));
        }
    }

    public static AddCompaniesSingleton getInstance() throws IOException, CsvException {
        if (INSTANCE == null) {
            INSTANCE = new AddCompaniesSingleton();
        }

        return INSTANCE;
    }
}
