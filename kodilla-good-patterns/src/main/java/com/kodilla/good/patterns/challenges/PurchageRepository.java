package com.kodilla.good.patterns.challenges;

public class PurchageRepository {
    public void createPurchage (User user, Product product) {
        System.out.println("Purchage of user : " + user.getName() + "of product :" + product.getNameOfProduct()
                + "saved to database");
    }
}
