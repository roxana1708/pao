package Classes;

public class Employees extends User{
    AffiliateCompany company;
    String jobDescription;
    //Subscription subscription;

    public Employees(String firstName, String secondName, String email, Address address, AffiliateCompany company, String jobDescription) {
        super(firstName, secondName, email, address);
        this.company = company;
        this.jobDescription = jobDescription;
        //this.subscription = company.getCompanySubscription();
    }

    public String getJobDescription() {
        return jobDescription;
    }

    private void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    public AffiliateCompany getCompany() {
        return company;
    }

    private void setCompany(AffiliateCompany company) {
        this.company = company;
    }

    @Override
    public Address getAddress() {
        return company.getCompanyAddress();
    }

    @Override
    public void setAddress(Address address) {
        if (this.jobDescription.toUpperCase() == "ADMIN") {
            this.company.changeCompanyAddress(address);
        } else {
            System.out.println("Only administrators can change the address of the company");
        }
    }

    public Subscription getSubscription() {
        return this.company.getCompanySubscription();
    }
/*
    @Override
    public boolean equals(Employees e) {
        if (e == this)
            return true;

        if (!(e instanceof Employees)) {
            return false;
        }

        return this.getFirstName() == e.getFirstName()
                && this.getSecondName() == e.getSecondName()
                && this.getCompany() == e.getCompany()
                && this.getJobDescription() == e.getJobDescription();

    }

 */
}
