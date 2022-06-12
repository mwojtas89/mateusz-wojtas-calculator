package com.kodilla.good.patterns.challenges;

public class StreamMovies {

    public static void main(String[] args) {
        BuyRequestRetriever buyRequestRetriever = new BuyRequestRetriever();
        BuyRequest buyRequest = buyRequestRetriever.retrieve();

        ProductOrderService productOrderService = new ProductOrderService(new InformationService(), new PurchageService(), new PurchageRepository());
        productOrderService.process(buyRequest);

    }
}
