package com.company;

public class Basket {
    private Product[] boughtProduct;

    public Basket(Product[] boughtProduct) {
        this.boughtProduct = boughtProduct;
    }

    public String[] getBoughtProduct() {
        String [] name = new String[boughtProduct.length];
        for (int i = 0; i < boughtProduct.length; i++) {
            name[i] = boughtProduct[i].getName();
        }
        return name;
    }
}
