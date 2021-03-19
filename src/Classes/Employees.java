package Classes;

public class Employees extends User{
    AffiliateCompany company;
    String jobDescription;

    public Employees(String firstName, String secondName, String email, String address, AffiliateCompany company, String jobDescription) {
        super(firstName, secondName, email, address);
        this.company = company;
        this.jobDescription = jobDescription;
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
    public String getAddress() {
        return company.getCompanyAddress();
    }

    @Override
    public void setAddress(String address) {
        if (this.jobDescription.toUpperCase() == "ADMIN") {
            this.company.changeCompanyAddress(address);
        } else {
            System.out.println("Only administrators can change the address of the company");
        }
    }
}
