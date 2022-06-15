package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public class Bigmac {
    private final String bun;
    private final int burgers;
    private final String sauce;
    private List<String> ingredients = new ArrayList<>();

    public static class BigmacBuilder {
        private String bun;
        private int burgers;
        private String sauce;
        private List<String> ingredients = new ArrayList<>();

        public static final String BUN_SESAM="BUN SESAM";
        public static final String BUN="BUN";
        public static final String STANDARD="STANDARD";
        public static final String THOUSAND_ISLAND="THOUSAND ISLAND";
        public static final String BARBECUE="BARBECUE";

        public BigmacBuilder bun (String bunType) {
            bunType=bunType.toUpperCase();
            if(bunType.equals(BUN_SESAM)) {
                this.bun =bunType;
                return this;
            } else if (bunType.equals(BUN)) {
                this.bun=bunType;
                return this;
            } else {
                throw new IllegalStateException("Please chose between BUN or BUN_SESAM");
            }
        }

        public BigmacBuilder burgers (int burgersQuantity) {
            this.burgers=burgersQuantity;
            return this;
        }

        public BigmacBuilder sauce (String sauceType) {
            sauceType=sauceType.toUpperCase();
            switch (sauceType) {
                case STANDARD: this.sauce=sauceType;
                        return this;
                case THOUSAND_ISLAND: this.sauce=sauceType;
                        return this;
                case BARBECUE: this.sauce=sauceType;
                        return this;
                default: throw new IllegalStateException("Place chose between STANDARD, THOUSAND_ISLAND and BARBECUE");

            }
        }

        public BigmacBuilder ingredients (String ingredient) {
            ingredients.add(ingredient);
            return this;
        }

        public Bigmac build () {
            return new Bigmac(bun, burgers, sauce, ingredients);
        }

    }

    public Bigmac(final String bun,final int burgers,final String sauce, List<String> ingredients) {
        this.bun = bun;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = new ArrayList<>(ingredients);
    }

    @Override
    public String toString() {
        return "Bigmac{" +
                "bun='" + bun + '\'' +
                ", burgers=" + burgers +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }

    public String getBun() {
        return bun;
    }

    public int getBurgers() {
        return burgers;
    }

    public String getSauce() {
        return sauce;
    }

    public List<String> getIngredients() {
        return ingredients;
    }
}
