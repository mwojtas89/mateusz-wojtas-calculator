package com.kodilla.good.patterns.challenges;

public class PurchageDTO {
    private User user;
    private boolean isBought;

    public User getUser() {
        return user;
    }

    public boolean isBought() {
        return isBought;
    }

    public PurchageDTO(final User user,final boolean isBought) {
        this.user = user;
        this.isBought = isBought;
    }
}
