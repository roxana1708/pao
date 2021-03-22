package Classes;

import java.util.ArrayList;
import java.util.List;
import java.lang.Integer;

public class AffiliateCompany implements Comparable<AffiliateCompany>{
    String companyName;
    Address companyAddress;
    Subscription companySubscription;
    List<Employees> employees = new ArrayList<Employees>();

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

    public List<Employees> getEmployees() {
        return employees;
    }

    public void addEmployee(Employees employee) {
        employees.add(employee);
    }

    @Override
    public int compareTo(AffiliateCompany aC) {
        return Integer.compare(this.employees.size(), aC.employees.size());
    }
}
