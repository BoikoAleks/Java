package org.example.entities.parts;

import java.util.Objects;

/**
 * Gearbox params
 */
public class GearBox extends Part {
    public int gearsNumber, maxSpeed, maxTorque;

    public GearBox() {
    }

    /**
     * @param make
     * @param model
     * @param type
     * @param gearsNumber
     * @param maxSpeed
     * @param maxTorque
     */
    public GearBox(String make, String model, String type, int gearsNumber, int maxSpeed, int maxTorque) {
        super(make, model, type);
        this.gearsNumber = gearsNumber;
        this.maxSpeed = maxSpeed;
        this.maxTorque = maxTorque;
    }

    /**
     * @return int
     */
    public int getGearsNumber() {
        return gearsNumber;
    }

    /**
     * @param gearsNumber
     */
    public void setGearsNumber(int gearsNumber) {
        this.gearsNumber = gearsNumber;
    }

    /**
     * @return int
     */
    public int getMaxSpeed() {
        return maxSpeed;
    }

    /**
     * @param maxSpeed
     */
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    /**
     * @return int
     */
    public int getMaxTorque() {
        return maxTorque;
    }

    /**
     * @param maxTorque
     */
    public void setMaxTorque(int maxTorque) {
        this.maxTorque = maxTorque;
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
        GearBox gearBox = (GearBox) o;
        return gearsNumber == gearBox.gearsNumber && maxSpeed == gearBox.maxSpeed && maxTorque == gearBox.maxTorque;
    }

    /**
     * @return hash code
     */
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), gearsNumber, maxSpeed, maxTorque);
    }

    /**
     * @return String
     */
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
