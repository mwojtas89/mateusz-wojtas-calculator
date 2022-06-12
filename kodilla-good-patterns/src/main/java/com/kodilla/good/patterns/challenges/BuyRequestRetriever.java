package com.kodilla.good.patterns.challenges;

public class BuyRequestRetriever {
    public BuyRequest retrieve() {
        User user = new User("Adam","Bolek");
        Product product = new Product("Szczotka");

        return new BuyRequest(user,product);
    }
}
