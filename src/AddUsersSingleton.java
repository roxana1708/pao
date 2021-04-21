import Classes.*;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.exceptions.CsvException;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AddUsersSingleton {
    private static AddUsersSingleton INSTANCE = null;
    List<User> users;

    private AddUsersSingleton(List<AffiliateCompany> companies) throws IOException, CsvException {
        this.users = new ArrayList<User>();
        FileReader fileName = new FileReader("/Users/roxana/IdeaProjects/Proiect/src/users.csv");

        CSVReader csvReader = new CSVReaderBuilder(fileName).build();

        List<String[]> allData = csvReader.readAll();

        for (String[] row : allData) {
            //TODO: check if they are emp/reg and add them
            // 0 for regular and 1 for employee at first position in csv file
            if(Integer.parseInt(row[0]) == 0) {
                String firstName = row[1];
                String secondName = row[2];
                String email = row[3];
                String subscription = row[4];

                String city = row[5];
                String street = row[6];
                int streetNo = Integer.parseInt(row[7]);
                String building = row[8];
                int apartmentNo = Integer.parseInt(row[9]);

                Address address = new Address(city, street, streetNo, building, apartmentNo);

                users.add(new Regular(firstName, secondName, email, address, subscription));
            } else {
                String firstName = row[1];
                String secondName = row[2];
                String email = row[3];
                String companyName = row[4];
                String jobDescription = row[5];

                for (AffiliateCompany company : companies) {
                    if (company.getCompanyName().equals(companyName)) {
                        Employees e = new Employees(firstName, secondName, email, company, jobDescription);
                        users.add(e);
                        company.getEmployees().add(e);
                        break;
                    }
                }
            }
        }
    }

    public static AddUsersSingleton getInstance(List<AffiliateCompany> companies) throws IOException, CsvException {
        if (INSTANCE == null) {
            INSTANCE = new AddUsersSingleton(companies);
        }

        return INSTANCE;
    }
}
