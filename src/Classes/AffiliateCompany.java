package Classes;

public class AffiliateCompany {
    String companyName;
    Address companyAddress;
    Subscription companySubscription;

    public AffiliateCompany(String companyName, Address companyAddress, String companySubscription) {
        this.companyName = companyName;
        this.companyAddress = companyAddress;
        this.companySubscription = new Subscription(companySubscription);
    }

    public String getCompanyName() {
        return companyName;
    }

    public Address getCompanyAddress() {
        return companyAddress;
    }

    private void setCompanyAddress(Address companyAddress) {
        this.companyAddress = companyAddress;
    }

    public Subscription getCompanySubscription() {
        return companySubscription;
    }

    public void setCompanySubscription(String companySubscription) {
        this.companySubscription.setSubscriptionType(companySubscription);
    }

    public void changeCompanyAddress(Address newAddress) {
        setCompanyAddress(newAddress);
    }
}
