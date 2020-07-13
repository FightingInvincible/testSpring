package com.tyy.ch02.ref;

public class Car {
    private String label;
    private Double price;

    public Car() {
    }

    public Car(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "label='" + label + '\'' +
                ", price=" + price +
                '}';
    }
}
