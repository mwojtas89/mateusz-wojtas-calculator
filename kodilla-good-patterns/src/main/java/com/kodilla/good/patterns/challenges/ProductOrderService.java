package com.kodilla.good.patterns.challenges;

public class ProductOrderService {
    private InformationService informationService;
    private PurchageService purchageService;
    private PurchageRepository purchageRepository;

    public ProductOrderService(final InformationService informationService,final PurchageService purchageService,final PurchageRepository purchageRepository) {
        this.informationService = informationService;
        this.purchageService = purchageService;
        this.purchageRepository = purchageRepository;
    }

    public PurchageDTO process (final BuyRequest buyRequest) {
        boolean isBought = purchageService.buy(buyRequest.getUser(), buyRequest.getProduct());

        if(isBought){
            informationService.inform(buyRequest.getUser());
            purchageRepository.createPurchage(buyRequest.getUser(), buyRequest.getProduct());
            return new PurchageDTO(buyRequest.getUser(), true);
        } else {
            return new PurchageDTO(buyRequest.getUser(), false);
        }

    }
}
