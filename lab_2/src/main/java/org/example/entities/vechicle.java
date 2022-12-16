package org.example.entities;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import org.example.entities.Saller;

import java.util.Objects;

public class vechicle {
    public String make, model;
    public int price;
    @JsonUnwrapped
    public Saller saller;

    public vechicle() {
    }

    public vechicle(String make, String model, int price, Saller saller) {
        this.make = make;
        this.model = model;
        this.price = price;
        this.saller = saller;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Saller getSaller() {
        return saller;
    }

    public void setSaller(Saller saller) {
        this.saller = saller;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        vechicle vechicle = (vechicle) o;
        return price == vechicle.price && make.equals(vechicle.make) && model.equals(vechicle.model) && saller.equals(vechicle.saller);
    }

    @Override
    public int hashCode() {
        return Objects.hash(make, model, price, saller);
    }

    @Override
    public String toString() {
        return "vechicle{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", saller=" + saller +
                '}';
    }
}
