package com.kodilla.stream.invoice.simple;

public final class SimpleItem {
    private final SimpleProduct product;
    private final double quantity;

    public SimpleProduct getProduct() {
        return product;
    }

    public double getQuantity() {
        return quantity;
    }

    public SimpleItem(SimpleProduct product, double quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public double getValue () {
        return product.getProductPrice() * quantity;
    }
}
