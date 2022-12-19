package org.example.entities.vechicle;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.Objects;
import java.util.Set;

public class bike extends Vechicle {

    public String color;
    public int weight;
    public bike(BikeBuilder BB){
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
        bike bike = (bike) o;
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


    final static public class BikeBuilder extends VechicleBuilder {
        @NotNull
        private String color;
        @NotNull
        @Min(value = 1, message = "min weight = 1")
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
            Validator validator = Validation.buildDefaultValidatorFactory().getValidator();
            Set<ConstraintViolation<BikeBuilder>> constraintViolations = validator.validate(this);
            StringBuilder exceptions = new StringBuilder("\n");
            for(ConstraintViolation constraintViolation : constraintViolations) {
                String fieldName = constraintViolation.getPropertyPath().toString().toUpperCase();
                exceptions.append(fieldName).append(" ").append(constraintViolation.getMessage()).append("\n");
            }
            if(constraintViolations.size() > 0)throw new IllegalArgumentException(String.valueOf(exceptions));
            return new bike(this);
        }
    }
}