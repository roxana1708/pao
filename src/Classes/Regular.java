package Classes;

public class Regular extends User{

    Subscription subscription;

    public Regular(String firstName, String secondName, String email, String address, String subscription) {
        super(firstName, secondName, email, address);
        this.subscription.setSubscriptionType(subscription);
    }

    @Override
    public String getAddress() {
        return this.address;
    }

    @Override
    public void setAddress(String address) {
        this.address = address;
    }
}
