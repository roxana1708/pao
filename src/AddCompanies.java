import Classes.Address;
import Classes.AffiliateCompany;

import java.util.List;

public class AddCompanies {
    public static void main(List<AffiliateCompany> companies) {
        companies.add(new AffiliateCompany("Digi", new Address("Bucuresti", "Staicovici", 1, "", 1), "platinum"));
        companies.add(new AffiliateCompany("Vodafone", new Address("Bucuresti", "", 12, "", 1), "silver"));
        companies.add(new AffiliateCompany("Telekom", new Address("Bucuresti", "", 112, "", 1), "gold"));
        companies.add(new AffiliateCompany("eMag", new Address("Bucuresti", "", 178, "", 1), "silver"));
        companies.add(new AffiliateCompany("Flanco", new Address("Bucuresti", "", 45, "", 1), "bronz"));
    }
}
