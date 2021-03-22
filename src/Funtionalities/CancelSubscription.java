package Funtionalities;

import Classes.*;

import java.util.List;

public class CancelSubscription {
    public static void main(List<User> users, User user) {
        users.remove(user);
    }
}
