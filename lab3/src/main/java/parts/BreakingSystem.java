package parts;

import java.util.Objects;

/**
 * Class for breaking system
 */
public class BreakingSystem extends Part {
    public String coolingType;

    public BreakingSystem() {
    }

    /**
     * @param make
     * @param model
     * @param type
     * @param coolingType
     */
    public BreakingSystem(String make, String model, String type, String coolingType) {
        super(make, model, type);
        this.coolingType = coolingType;
    }

    public String getCoolingType() {
        return coolingType;
    }

    /**
     * @param coolingType
     */
    public void setCoolingType(String coolingType) {
        this.coolingType = coolingType;
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
        BreakingSystem that = (BreakingSystem) o;
        return coolingType.equals(that.coolingType);
    }

    /**
     * @return hash code
     */
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), coolingType);
    }

    /**
     * @return string
     */
    @Override
    public String toString() {
        return "parts.BreakingSystem{" +
                "coolingType='" + coolingType + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
