package org.example.entities.vechicle;

import org.example.entities.parts.*;

import java.util.Objects;

/**
 * Type device
 */
abstract public class Vechicle {
    public String make, model, type, price;
    public Engine engine;
    public GearBox gearBox;
    public BreakingSystem breakingSystem;
    public Wheels wheels;

    /**
     * @param VB
     */
    public Vechicle(VechicleBuilder VB) { //конструктор який приймає білдер
        this.make = VB.make;
        this.model = VB.model;
        this.type = VB.type;
        this.price = VB.price;
        this.engine = VB.engine;
        this.gearBox = VB.gearBox;
        this.breakingSystem = VB.breakingSystem;
        this.wheels = VB.wheels;
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
     * @return string
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
     * @return string
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
     * @return string
     */
    public String getPrice() {
        return price;
    }

    /**
     * @param price
     */
    public void setPrice(String price) {
        this.price = price;
    }

    /**
     * @return Engine
     */
    public Engine getEngine() {
        return engine;
    }

    /**
     * @param engine
     */
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    /**
     * @return GearBox
     */
    public GearBox getGearBox() {
        return gearBox;
    }

    /**
     * @param gearBox
     */
    public void setGearBox(GearBox gearBox) {
        this.gearBox = gearBox;
    }

    /**
     * @return BreakingSystem
     */
    public BreakingSystem getBreakingSystem() {
        return breakingSystem;
    }

    /**
     * @param breakingSystem
     */
    public void setBreakingSystem(BreakingSystem breakingSystem) {
        this.breakingSystem = breakingSystem;
    }

    /**
     * @return Wheels
     */
    public Wheels getWheels() {
        return wheels;
    }

    /**
     * @param wheels
     */
    public void setWheels(Wheels wheels) {
        this.wheels = wheels;
    }

    /**
     * @param o
     * @return bool
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vechicle vechicle = (Vechicle) o;
        return make.equals(vechicle.make) && model.equals(vechicle.model) && type.equals(vechicle.type) && price.equals(vechicle.price) && engine.equals(vechicle.engine) && gearBox.equals(vechicle.gearBox) && breakingSystem.equals(vechicle.breakingSystem) && wheels.equals(vechicle.wheels);
    }

    /**
     * @return int
     */
    @Override
    public int hashCode() {
        return Objects.hash(make, model, type, price, engine, gearBox, breakingSystem, wheels);
    }

    /**
     * @return string
     */
    @Override
    public String toString() {
        return "Vechicle{" +
                "make='" + make + '\'' +
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
     * Type vechicle builder
     */
    static public abstract class VechicleBuilder{
        private String make;
        private String model;
        private String type;
        private String price;
        private Engine engine;
        private GearBox gearBox;
        private BreakingSystem breakingSystem;
        private Wheels wheels;

        public VechicleBuilder() { }


        /**
         * @param make
         * @return builder
         */
        public VechicleBuilder setMake(String make) {
            this.make = make;
            return this;
        }

        /**
         * @param model
         * @return builder
         */
        public VechicleBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        /**
         * @param type
         * @return builder
         */
        public VechicleBuilder setType(String type) {
            this.type = type;
            return this;
        }

        /**
         * @param price
         * @return builder
         */
        public VechicleBuilder setPrice(String price) {
            this.price = price;
            return this;
        }

        /**
         * @param engine
         * @return builder
         */
        public VechicleBuilder setEngine(Engine engine) {
            this.engine = engine;
            return this;
        }

        /**
         * @param gearBox
         * @return builder
         */
        public VechicleBuilder setGearBox(GearBox gearBox) {
            this.gearBox = gearBox;
            return this;
        }

        /**
         * @param breakingSystem
         * @return builder
         */
        public VechicleBuilder setBreakingSystem(BreakingSystem breakingSystem) {
            this.breakingSystem = breakingSystem;
            return this;
        }

        /**
         * @param wheels
         * @return builder
         */
        public VechicleBuilder setWheels(Wheels wheels) {
            this.wheels = wheels;
            return this;
        }

        /**
         * @return Vechicle
         */
        abstract public Vechicle build();
    }
}
