package org.example.entities.parts;

import java.util.Objects;

/**
 * Wheels params
 */
public class Wheels extends Part {
    public int radius, width, amount;

    public Wheels() {
    }

    /**
     * @param make
     * @param model
     * @param type
     * @param radius
     * @param width
     * @param amount
     */
    public Wheels(String make, String model, String type, int radius, int width, int amount) {
        super(make, model, type);
        this.radius = radius;
        this.width = width;
        this.amount = amount;
    }

    /**
     * @return int
     */
    public int getRadius() {
        return radius;
    }

    /**
     * @param radius
     */
    public void setRadius(int radius) {
        this.radius = radius;
    }

    /**
     * @return int
     */
    public int getWidth() {
        return width;
    }

    /**
     * @param width
     */
    public void setWidth(int width) {
        this.width = width;
    }

    /**
     * @param o
     * @return bool
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Wheels wheels = (Wheels) o;
        return radius == wheels.radius && width == wheels.width && amount == wheels.amount;
    }

    /**
     * @return int
     */
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), radius, width, amount);
    }

    /**
     * @return int
     */
    public int getAmount() {
        return amount;
    }

    /**
     * @param amount
     */
    public void setAmount(int amount) {
        this.amount = amount;
    }

    /**
     * @return string
     */
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
