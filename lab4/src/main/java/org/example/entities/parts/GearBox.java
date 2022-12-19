package org.example.entities.parts;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.Objects;

public class GearBox extends Part {

    @NotNull
    @Min(value = 2,message = "min gearsNumber = 2")
    public int gearsNumber;
    @NotNull
    @Max(value = 360,message = "max maxSpeed = 360")
    public int maxSpeed;
    @NotNull
    public int maxTorque;

    public GearBox() {}

    public GearBox(String make, String model, String type, int gearsNumber, int maxSpeed, int maxTorque) {
        super(make, model, type);
        this.gearsNumber = gearsNumber;
        this.maxSpeed = maxSpeed;
        this.maxTorque = maxTorque;
    }

    public int getGearsNumber() {
        return gearsNumber;
    }

    public void setGearsNumber(int gearsNumber) {
        this.gearsNumber = gearsNumber;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMaxTorque() {
        return maxTorque;
    }

    public void setMaxTorque(int maxTorque) {
        this.maxTorque = maxTorque;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        GearBox gearBox = (GearBox) o;
        return gearsNumber == gearBox.gearsNumber && maxSpeed == gearBox.maxSpeed && maxTorque == gearBox.maxTorque;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), gearsNumber, maxSpeed, maxTorque);
    }

    @Override
    public String toString() {
        return "GearBox{" +
                "gearsNumber=" + gearsNumber +
                ", maxSpeed=" + maxSpeed +
                ", maxTorque=" + maxTorque +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
