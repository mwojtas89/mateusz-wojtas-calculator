package com.kodilla.good.patterns.challenges;

public class PurchageService {
    public boolean buy (final User user, final Product product) {
        System.out.println("User: " + user.getName() + "bought :" + product.getNameOfProduct());
        return true;
    }
}
