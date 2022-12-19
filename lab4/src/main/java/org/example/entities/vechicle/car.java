package org.example.entities.vechicle;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.Objects;
import java.util.Set;

public class car extends Vechicle{
    public int seats;

    public car(CarBuilder CB){
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
        car car = (car) o;
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

    final static public class CarBuilder extends VechicleBuilder
    {
        @NotNull
        @Min(value = 2,message = "min seats = 2")
        private int seats;

        public CarBuilder setSeats(int seats)
        {
            this.seats = seats;
            return this;
        }

        @Override
        public car build() {
            Validator validator = Validation.buildDefaultValidatorFactory().getValidator();
            Set<ConstraintViolation<CarBuilder>> constraintViolations = validator.validate(this);
            StringBuilder exceptions = new StringBuilder("\n");
            for(ConstraintViolation constraintViolation : constraintViolations) {
                String fieldName = constraintViolation.getPropertyPath().toString().toUpperCase();
                exceptions.append(fieldName).append(" ").append(constraintViolation.getMessage()).append("\n");
            }
            if(constraintViolations.size() > 0)throw new IllegalArgumentException(String.valueOf(exceptions));
            return new car(this);
        }
    }
}
