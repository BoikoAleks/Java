package org.example.entities.parts;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.Objects;

public class Engine extends Part {
    @NotNull
    @Min(value = 1,message = "min cylindersNumber = 1")
    public int cylindersNumber;
    @NotNull
    @Min(value = 1,message = "min maxPower = 1")
    public int maxPower;

    public Engine() {
    }

    public Engine(String make, String model, String type, int cylindersNumber, int maxPower) {
        super(make, model, type);
        this.cylindersNumber = cylindersNumber;
        this.maxPower = maxPower;
    }

    public int getCylindersNumber() {
        return cylindersNumber;
    }

    public void setCylindersNumber(int cylindersNumber) {
        this.cylindersNumber = cylindersNumber;
    }

    public int getMaxPower() {
        return maxPower;
    }

    public void setMaxPower(int maxPower) {
        this.maxPower = maxPower;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Engine engine = (Engine) o;
        return cylindersNumber == engine.cylindersNumber && maxPower == engine.maxPower;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), cylindersNumber, maxPower);
    }

    @Override
    public String toString() {
        return "Engine{" +
                "cylindersNumber=" + cylindersNumber +
                ", maxPower=" + maxPower +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
