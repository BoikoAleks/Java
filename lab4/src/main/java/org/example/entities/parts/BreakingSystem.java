package org.example.entities.parts;

import javax.validation.constraints.NotNull;
import java.util.Objects;

public class BreakingSystem extends Part {
    @NotNull
    public String coolingType;

    public BreakingSystem() {
    }

    public BreakingSystem(String make, String model, String type, String coolingType) {
        super(make, model, type);
        this.coolingType = coolingType;
    }

    public String getCoolingType() {
        return coolingType;
    }

    public void setCoolingType(String coolingType) {
        this.coolingType = coolingType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        BreakingSystem that = (BreakingSystem) o;
        return coolingType.equals(that.coolingType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), coolingType);
    }

    @Override
    public String toString() {
        return "BreakingSystem{" +
                "coolingType='" + coolingType + '\'' +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
