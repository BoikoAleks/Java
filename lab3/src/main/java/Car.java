import java.util.Objects;

public class Car extends Vechicle implements Comparable<Vechicle>{
    public int seats;

    public Car(CarBuilder CB){
        super(CB);
        this.seats = CB.seats;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Car car = (Car) o;
        return seats == car.seats;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), seats);
    }

    @Override
    public String toString() {
        return "car{" +
                "seats=" + seats +
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
        return 0;
    }

    final static public class CarBuilder extends VechicleBuilder
    {
        private int seats;

        public CarBuilder setSeats(int seats)
        {
            this.seats = seats;
            return this;
        }

        @Override
        public Car build() {
            return new Car(this);
        }
    }
}
