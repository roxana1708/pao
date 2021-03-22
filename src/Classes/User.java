package Classes;

public abstract class User {
    String firstName;
    String secondName;
    String email;
    Address address;

    public User() {System.out.println("User constructor from the abstract class"); }

    public User(String firstName, String secondName, String email, Address address) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.email = email;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public abstract Address getAddress();

    public abstract void setAddress(Address address);

    /*
    @Override
    public boolean equals(User user) {
        if (user == this)
            return true;

        return this.getFirstName() == user.getFirstName()
                && this.getSecondName() == user.getSecondName();
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }
    */

}
