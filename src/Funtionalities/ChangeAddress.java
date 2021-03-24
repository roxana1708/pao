package Funtionalities;

import Classes.*;

import java.awt.image.PackedColorModel;

public class ChangeAddress {


    public static boolean validAddress(Address address) {
        String[] acceptedCities = {"Bucuresti", "Brasov", "Sibiu", "Cluj"};

        for (String city : acceptedCities) {
            if (city == address.getCity()) {
                return true;
            }
        }

        return false;
    }

    public static void changeForUser(User user, Address newAddress) {
        if (validAddress(newAddress)) {
            user.setAddress(newAddress);
        } else {
            System.out.println("The address is refering to a city where we don't provide our services.");
        }
    }

    public static void changeForCompany(AffiliateCompany company, Address newAddress) {
        if (validAddress(newAddress)) {
            company.changeCompanyAddress(newAddress);
        } else {
            System.out.println("The address is refering to a city where we don't provide our services.");
        }
    }
}
