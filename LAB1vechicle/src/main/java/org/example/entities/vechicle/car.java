package org.example.entities.vechicle;

import org.example.entities.parts.BreakingSystem;
import org.example.entities.parts.Engine;
import org.example.entities.parts.GearBox;
import org.example.entities.parts.Wheels;

import java.util.Objects;

/**
 * Car type
 */
public class car extends Vechicle{
    public int seats;

    /**
     * @param CB
     */
    public car(CarBuilder CB){
        super(CB); //передаєм параметр в конструктор батьківського класу
        this.seats = CB.seats;
    }

    /**
     * @return int
     */
    public int getSeats() {
        return seats;
    }

    /**
     * @param seats
     */
    public void setSeats(int seats) {
        this.seats = seats;
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
        car car = (car) o;
        return seats == car.seats;
    }

    /**
     * @return int
     */
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), seats);
    }

    /**
     * @return String
     */
    @Override
    public String toString() {
        return "car{" +
                "seats=" + seats +
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
     * car builder
     */
    final static public class CarBuilder extends VechicleBuilder
    {
        private int seats;

        /**
         * @param seats
         * @return builder
         */
        public CarBuilder setSeats(int seats)
        {
            this.seats = seats;
            return this;
        }

        /**
         * @return car
         */
        @Override
        public car build() {
            return new car(this);
        }
    }
}
