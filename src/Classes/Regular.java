package Classes;

public class Regular extends User{

    Subscription subscription;

    public Regular(String firstName, String secondName, String email, Address address, String subscription) {
        super(firstName, secondName, email, address);
        this.subscription = new Subscription(subscription);
    }

    @Override
    public Address getAddress() {
        return this.address;
    }

    @Override
    public void setAddress(Address address) {
        this.address = address;
    }

    public Subscription getSubscription() {
        return subscription;
    }

    public void setSubscription(String subscription) {
        this.subscription = new Subscription(subscription);
    }
}
