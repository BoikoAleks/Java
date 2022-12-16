package org.example.entities.vechicle;

import org.example.entities.parts.BreakingSystem;
import org.example.entities.parts.Engine;
import org.example.entities.parts.GearBox;
import org.example.entities.parts.Wheels;

import java.util.Objects;

/**
 * Type bike
 */
public class bike extends Vechicle {
    public String color;
    public int weight;

    /**
     * @param BB
     */
    public bike(BikeBuilder BB){
        super(BB);
        this.color = BB.color;
        this.weight = BB.weight;
    }

    /**
     * @return string
     */
    public String getColor() {
        return color;
    }

    /**
     * @return int
     */
    public int getWeight() {
        return weight;
    }

    /**
     * @param weight
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }

    /**
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
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
        bike bike = (bike) o;
        return weight == bike.weight && color.equals(bike.color);
    }

    /**
     * @return int
     */
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), color, weight);
    }

    /**
     * @return string
     */
    @Override
    public String toString() {
        return "bike{" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", type='" + type + '\'' +
                ", price='" + price + '\'' +
                ", engine=" + engine +
                ", gearBox=" + gearBox +
                ", breakingSystem=" + breakingSystem +
                ", wheels=" + wheels +
                '}';
    }


    /**
     * type bike builder
     */
    final static public class BikeBuilder extends VechicleBuilder {
        private String color;
        private int weight;

        /**
         * @param color
         * @return builder
         */
        public BikeBuilder setColor(String color) {
            this.color=color;
            return this;
        }

        /**
         * @param weight
         * @return builder
         */
        public BikeBuilder setWeight(int weight) {
            this.weight = weight;
            return this;
        }

        /**
         * @return bike
         */
        @Override
        public Vechicle build() {
            return new bike(this);
        }
    }
}