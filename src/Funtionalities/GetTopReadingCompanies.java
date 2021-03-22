package Funtionalities;

import Classes.AffiliateCompany;
import Classes.BookTitle;

import java.util.Collections;
import java.util.List;

public class GetTopReadingCompanies {
    public static void main(List<AffiliateCompany> companies) {
        Collections.sort(companies);
        Collections.reverse(companies);
        for (AffiliateCompany company: companies) {
            System.out.println(company.getCompanyName());
        }
    }
}
