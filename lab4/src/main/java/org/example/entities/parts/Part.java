package org.example.entities.parts;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Objects;

class Part {
    @NotNull
    @Size(min = 4,message = "min make size = 4")
    public String make;
    @NotNull
    @Size(min = 4,message = "min model size = 4")
    public String model;
    @NotNull
    public String type;

    public Part() {
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Part(String make, String model, String type) {
        this.make = make;
        this.model = model;
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Part part = (Part) o;
        return make.equals(part.make) && model.equals(part.model) && type.equals(part.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(make, model, type);
    }

    @Override
    public String toString() {
        return "part{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
