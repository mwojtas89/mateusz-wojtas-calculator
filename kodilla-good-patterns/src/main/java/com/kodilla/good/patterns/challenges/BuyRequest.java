package com.kodilla.good.patterns.challenges;

public class BuyRequest {
    private User user;
    private Product product;

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public BuyRequest(User user, Product product) {
        this.user = user;
        this.product = product;
    }
}
