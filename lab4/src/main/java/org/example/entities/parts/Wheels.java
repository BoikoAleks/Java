package org.example.entities.parts;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.Objects;

public class Wheels extends Part {
    @NotNull
    @Min(value = 1,message = "min radius = 1")
    public int radius;
    @NotNull
    @Min(value = 1,message = "min width = 1")
    public int width;
    @NotNull
    @Min(value = 1,message = "min amount = 1")
    public int amount;

    public Wheels() {
    }

    public Wheels(String make, String model, String type, int radius, int width, int amount) {
        super(make, model, type);
        this.radius = radius;
        this.width = width;
        this.amount = amount;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Wheels wheels = (Wheels) o;
        return radius == wheels.radius && width == wheels.width && amount == wheels.amount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), radius, width, amount);
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Wheels{" +
                "radius=" + radius +
                ", width=" + width +
                ", amount=" + amount +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
