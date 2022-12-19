package parts;

import java.util.Objects;

/**
 * Parrent class for all parts
 */
class Part {
    public String make, model, type;

    public Part() {
    }

    /**
     * @return String
     */
    public String getMake() {
        return make;
    }

    /**
     * @param make
     */
    public void setMake(String make) {
        this.make = make;
    }

    /**
     * @return String
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return String
     */
    public String getType() {
        return type;
    }

    /**
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @param make
     * @param model
     * @param type
     */
    public Part(String make, String model, String type) {
        this.make = make;
        this.model = model;
        this.type = type;
    }

    /**
     * @param o
     * @return bool
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Part part = (Part) o;
        return make.equals(part.make) && model.equals(part.model) && type.equals(part.type);
    }

    /**
     * @return int
     */
    @Override
    public int hashCode() {
        return Objects.hash(make, model, type);
    }

    /**
     * @return String
     */
    @Override
    public String toString() {
        return "part{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
