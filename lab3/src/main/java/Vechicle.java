import parts.BreakingSystem;
import parts.Engine;
import parts.GearBox;
import parts.Wheels;

import java.util.Objects;

abstract public class Vechicle {
    public String make, model, type, price;
    public Engine engine;
    public GearBox gearBox;
    public BreakingSystem breakingSystem;
    public Wheels wheels;

    public Vechicle(VechicleBuilder VB) {
        this.make = VB.make;
        this.model = VB.model;
        this.type = VB.type;
        this.price = VB.price;
        this.engine = VB.engine;
        this.gearBox = VB.gearBox;
        this.breakingSystem = VB.breakingSystem;
        this.wheels = VB.wheels;
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

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public GearBox getGearBox() {
        return gearBox;
    }

    public void setGearBox(GearBox gearBox) {
        this.gearBox = gearBox;
    }

    public BreakingSystem getBreakingSystem() {
        return breakingSystem;
    }

    public void setBreakingSystem(BreakingSystem breakingSystem) {
        this.breakingSystem = breakingSystem;
    }

    public Wheels getWheels() {
        return wheels;
    }

    public void setWheels(Wheels wheels) {
        this.wheels = wheels;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vechicle vechicle = (Vechicle) o;
        return make.equals(vechicle.make) && model.equals(vechicle.model) && type.equals(vechicle.type) && price.equals(vechicle.price) && engine.equals(vechicle.engine) && gearBox.equals(vechicle.gearBox) && breakingSystem.equals(vechicle.breakingSystem) && wheels.equals(vechicle.wheels);
    }

    @Override
    public int hashCode() {
        return Objects.hash(make, model, type, price, engine, gearBox, breakingSystem, wheels);
    }

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


        public VechicleBuilder setMake(String make) {
            this.make = make;
            return this;
        }

        public VechicleBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public VechicleBuilder setType(String type) {
            this.type = type;
            return this;
        }

        public VechicleBuilder setPrice(String price) {
            this.price = price;
            return this;
        }

        public VechicleBuilder setEngine(Engine engine) {
            this.engine = engine;
            return this;
        }

        public VechicleBuilder setGearBox(GearBox gearBox) {
            this.gearBox = gearBox;
            return this;
        }

        public VechicleBuilder setBreakingSystem(BreakingSystem breakingSystem) {
            this.breakingSystem = breakingSystem;
            return this;
        }

        public VechicleBuilder setWheels(Wheels wheels) {
            this.wheels = wheels;
            return this;
        }

        abstract public Vechicle build();
    }
}
