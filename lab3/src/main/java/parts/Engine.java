package parts;

import java.util.Objects;

/**
 *  parts.Engine description
 */
public class Engine extends Part {
    public int cylindersNumber, maxPower;

    public Engine() {
    }

    /**
     * @param make
     * @param model
     * @param type
     * @param cylindersNumber
     * @param maxPower
     */
    public Engine(String make, String model, String type, int cylindersNumber, int maxPower) {
        super(make, model, type);
        this.cylindersNumber = cylindersNumber;
        this.maxPower = maxPower;
    }

    /**
     * @return int
     */
    public int getCylindersNumber() {
        return cylindersNumber;
    }

    /**
     * @param cylindersNumber
     */
    public void setCylindersNumber(int cylindersNumber) {
        this.cylindersNumber = cylindersNumber;
    }

    /**
     * @return int
     */
    public int getMaxPower() {
        return maxPower;
    }

    /**
     * @param maxPower
     */
    public void setMaxPower(int maxPower) {
        this.maxPower = maxPower;
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
        Engine engine = (Engine) o;
        return cylindersNumber == engine.cylindersNumber && maxPower == engine.maxPower;
    }

    /**
     * @return int
     */
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), cylindersNumber, maxPower);
    }

    /**
     * @return String
     */
    @Override
    public String toString() {
        return "parts.Engine{" +
                "cylindersNumber=" + cylindersNumber +
                ", maxPower=" + maxPower +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
