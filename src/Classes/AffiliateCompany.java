package Classes;

public class AffiliateCompany {
    String companyName;
    String companyAddress;
    Subscription companySubscription;

    public AffiliateCompany(String companyName, String companyAddress, Subscription companySubscription) {
        this.companyName = companyName;
        this.companyAddress = companyAddress;
        this.companySubscription = companySubscription;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    private void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    public Subscription getCompanySubscription() {
        return companySubscription;
    }

    private void setCompanySubscription(Subscription companySubscription) {
        this.companySubscription = companySubscription;
    }

    public void changeCompanyAddress(String newAddress) {
        setCompanyAddress(newAddress);
    }
}
