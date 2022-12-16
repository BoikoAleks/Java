import static org.testng.Assert.assertEquals;

import org.example.entities.parts.BreakingSystem;
import org.example.entities.parts.Engine;
import org.example.entities.parts.GearBox;
import org.example.entities.parts.Wheels;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Objects;
import org.example.entities.vechicle.*;

public class test {
    @Test(dataProvider = "equalVechicle")
    public void equalTest(Vechicle obj1, Vechicle obj2, boolean res)
    {
        assertEquals(Objects.equals(obj1,obj2),res);
    }

    @DataProvider
    public Object[][] equalVechicle()
    {
        car.CarBuilder carBuilder = new car.CarBuilder();
        carBuilder.setMake("Peugeot");
        carBuilder.setModel("307");
        carBuilder.setType("Hatchback");
        carBuilder.setPrice("5000$");
        carBuilder.setSeats(5);
        carBuilder.setBreakingSystem(new BreakingSystem("Brembo", "c589rb", "Disk", "Passive"));
        carBuilder.setEngine(new Engine("Peugeot", "leon78", "Disel", 4, 110));
        carBuilder.setGearBox(new GearBox("PSA", "l789", "Manual", 5, 180, 150));
        carBuilder.setWheels(new Wheels("PSA", "psu7895", "Aluminium", 16, 300, 4));
        car car1 = (car) carBuilder.build();
        car car2 = (car) carBuilder.build();

        bike.BikeBuilder bikeBuilder = new bike.BikeBuilder();
        bikeBuilder.setMake("Honda");
        bikeBuilder.setModel("CBR");
        bikeBuilder.setType("Sport");
        bikeBuilder.setPrice("8000$");
        bikeBuilder.setColor("red");
        bikeBuilder.setWeight(100);
        bikeBuilder.setBreakingSystem(new BreakingSystem("Brembo", "amt895", "Disk", "Passive"));
        bikeBuilder.setEngine(new Engine("Honda", "mt89", "Gas", 1, 200));
        bikeBuilder.setGearBox(new GearBox("tm", "7789", "Manual", 7, 240, 300));
        bikeBuilder.setWheels(new Wheels("rpi", "pas895", "Aluminium", 16, 300, 2));
        bike bike1 = (bike) bikeBuilder.build();
        bike bike2 = (bike) bikeBuilder.build();
        return new Object[][] {{car1, car2, true},{car1,bike1,false},{bike1,bike2,true}};
    }

    @Test(dataProvider = "hashEqualVechicle")
    public void hashEqualVechicleTest(Vechicle obj1,Vechicle obj2)
    {
        assertEquals(obj1.hashCode(),obj2.hashCode());
    }
    @DataProvider
    public Object[][] hashEqualVechicle()
    {
        car.CarBuilder carBuilder = new car.CarBuilder();
        carBuilder.setMake("Peugeot");
        carBuilder.setModel("307");
        carBuilder.setType("Hatchback");
        carBuilder.setPrice("5000$");
        carBuilder.setSeats(5);
        carBuilder.setBreakingSystem(new BreakingSystem("Brembo", "c589rb", "Disk", "Passive"));
        carBuilder.setEngine(new Engine("Peugeot", "leon78", "Disel", 4, 110));
        carBuilder.setGearBox(new GearBox("PSA", "l789", "Manual", 5, 180, 150));
        carBuilder.setWheels(new Wheels("PSA", "psu7895", "Aluminium", 16, 300, 4));
        car car1 = (car) carBuilder.build();
        car car2 = (car) carBuilder.build();
        return new Object[][]{ {car1,car2} };
    }

    @Test(dataProvider = "stringEqualVechicle")
    public void stringEqualVechicleTest(Vechicle obj1,Vechicle obj2)
    {
        assertEquals(obj1.toString(), obj2.toString());
    }
    @DataProvider
    public Object[][] stringEqualVechicle()
    {
        car.CarBuilder carBuilder = new car.CarBuilder();
        carBuilder.setMake("Peugeot");
        carBuilder.setModel("307");
        carBuilder.setType("Hatchback");
        carBuilder.setPrice("5000$");
        carBuilder.setSeats(5);
        carBuilder.setBreakingSystem(new BreakingSystem("Brembo", "c589rb", "Disk", "Passive"));
        carBuilder.setEngine(new Engine("Peugeot", "leon78", "Disel", 4, 110));
        carBuilder.setGearBox(new GearBox("PSA", "l789", "Manual", 5, 180, 150));
        carBuilder.setWheels(new Wheels("PSA", "psu7895", "Aluminium", 16, 300, 4));
        car car1 = (car) carBuilder.build();
        car car2 = (car) carBuilder.build();

        bike.BikeBuilder bikeBuilder = new bike.BikeBuilder();
        bikeBuilder.setMake("Honda");
        bikeBuilder.setModel("CBR");
        bikeBuilder.setType("Sport");
        bikeBuilder.setPrice("8000$");
        bikeBuilder.setColor("red");
        bikeBuilder.setWeight(100);
        bikeBuilder.setBreakingSystem(new BreakingSystem("Brembo", "amt895", "Disk", "Passive"));
        bikeBuilder.setEngine(new Engine("Honda", "mt89", "Gas", 1, 200));
        bikeBuilder.setGearBox(new GearBox("tm", "7789", "Manual", 7, 240, 300));
        bikeBuilder.setWheels(new Wheels("rpi", "pas895", "Aluminium", 16, 300, 2));
        bike bike1 = (bike) bikeBuilder.build();
        bike bike2 = (bike) bikeBuilder.build();
        return new Object[][] {{car1,car2},{bike1,bike2}};
    }
}
