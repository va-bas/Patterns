package com.vabas.patterns.adapter;

public class AdapterAppToRunner extends ShopApp implements Shop{
    @Override
    public void add() {
        addObject();
    }

    @Override
    public void sale() {
        saleObject();
    }

    @Override
    public void select() {
        selectObject();
    }

    @Override
    public void remove() {
        removeObject();
    }
}
