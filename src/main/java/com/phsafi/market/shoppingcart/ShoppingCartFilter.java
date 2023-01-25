package com.phsafi.market.shoppingcart;

public class ShoppingCartFilter {
    private String parcialName;
    private float maxValue;
    private float minValue;

    public String getParcialName() {
        return parcialName;
    }

    public void setParcialName(String parcialName) {
        this.parcialName = parcialName;
    }

    public float getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(float maxValue) {
        this.maxValue = maxValue;
    }

    public float getMinValue() {
        return minValue;
    }

    public void setMinValue(float minValue) {
        this.minValue = minValue;
    }
}
