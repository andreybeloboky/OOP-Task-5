package com.company;

public class Basket {
    private Product[] boughtProduct;
    private String[] listProduct;

    public Basket(Product[] boughtProduct, String[] listProduct) {
        this.boughtProduct = boughtProduct;
        this.listProduct = listProduct;
    }

    public String[] getBoughtProduct() {
        for (int i = 0; i < listProduct.length; i++) {
            listProduct[i] = boughtProduct[i].getName();
        }
        return listProduct;
    }
}
