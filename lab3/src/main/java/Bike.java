import java.util.Objects;

public class Bike extends Vechicle implements Comparable<Vechicle> {
    public String color;
    public int weight;

    public Bike(BikeBuilder BB){
        super(BB);
        this.color = BB.color;
        this.weight = BB.weight;
    }

    public String getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bike bike = (Bike) o;
        return weight == bike.weight && color.equals(bike.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), color, weight);
    }

    @Override
    public String toString() {
        return "bike{" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", type='" + type + '\'' +
                ", price='" + price + '\'' +
                ", engine=" + engine +
                ", gearBox=" + gearBox +
                ", breakingSystem=" + breakingSystem +
                ", wheels=" + wheels +
                '}';
    }

    @Override
    public int compareTo(Vechicle o) {
        return this.getMake().compareTo(o.getMake());
    }


    final static public class BikeBuilder extends VechicleBuilder {
        private String color;
        private int weight;

        public BikeBuilder setColor(String color) {
            this.color=color;
            return this;
        }

        public BikeBuilder setWeight(int weight) {
            this.weight = weight;
            return this;
        }

        @Override
        public Vechicle build() {
            return new Bike(this);
        }
    }
}