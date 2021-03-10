package com.vabas.patterns.adapter;

public class ShopRunner {
    public static void main(String[] args) {
        Shop shop = new AdapterAppToRunner();

        shop.add();
        shop.sale();
        shop.select();
        shop.remove();
    }
}
