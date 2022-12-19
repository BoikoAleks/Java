import parts.BreakingSystem;
import parts.Engine;
import parts.GearBox;
import parts.Wheels;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Car.CarBuilder carBuilder1 = new Car.CarBuilder();
        Car.CarBuilder carBuilder2 = new Car.CarBuilder();
        Bike.BikeBuilder bikeBuilder = new Bike.BikeBuilder();
        carBuilder1.setMake("Peugeot");
        carBuilder1.setModel("307");
        carBuilder1.setType("Hatchback");
        carBuilder1.setPrice("5000$");
        carBuilder1.setSeats(5);
        carBuilder1.setBreakingSystem(new BreakingSystem("Brembo", "c589rb", "Disk", "Passive"));
        carBuilder1.setEngine(new Engine("Peugeot", "leon78", "Disel", 4, 110));
        carBuilder1.setGearBox(new GearBox("PSA", "l789", "Manual", 5, 180, 150));
        carBuilder1.setWheels(new Wheels("PSA", "psu7895", "Aluminium", 16, 300, 4));

        carBuilder2.setMake("Audi");
        carBuilder2.setModel("a8");
        carBuilder2.setType("Universal");
        carBuilder2.setPrice("10000$");
        carBuilder2.setSeats(9);
        carBuilder2.setBreakingSystem(new BreakingSystem("asd", "qwe", "asd", "zxc"));
        carBuilder2.setEngine(new Engine("ghj", "ghj", "kjh", 6, 160));
        carBuilder2.setGearBox(new GearBox("PS", "l78", "Man", 4, 260, 300));
        carBuilder2.setWheels(new Wheels("PS", "psu78", "Al", 18, 350, 8));

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

        Car car1 = (Car) carBuilder1.build();
        Car car2 = (Car) carBuilder2.build();
        Bike bike1 = (Bike) bikeBuilder.build();

        System.out.println("Comperable");
        TreeSet<Vechicle>set = new TreeSet<>();
        set.add(car1);
        set.add(bike1);
        for(Vechicle v : set)
        {
            System.out.println(v);
        }

        System.out.println("\nComparator");
        List<Vechicle>list = new ArrayList<>();
        list.add(car1);
        list.add(car2);
        list.add(bike1);
        Collections.sort(list,new VehicleComparator());
        for(Vechicle v : list)
        {
            System.out.println(v);
        }

        VehicleService service = new VehicleService(list);
        System.out.println("\ngetByMake");
        for(Vechicle v : service.getByMake("Honda"))
        {
            System.out.println(v);
        }

        System.out.println("\ngetByModel");
        for(Vechicle v : service.getByModel("a8"))
        {
            System.out.println(v);
        }

        System.out.println("\ngetByType");
        for(Vechicle v : service.getByType("Universal"))
        {
            System.out.println(v);
        }

        System.out.println("\ngetByEngineMaxPower");
        for(Vechicle v : service.getByEngineMaxPower(200))
        {
            System.out.println(v);
        }

        System.out.println("\ngetByEngineCylindersNumber");
        for(Vechicle v : service.getByEngineCylindersNumber(4))
        {
            System.out.println(v);
        }

        System.out.println("\ngetByBreakingSystemCoolingType");
        for(Vechicle v : service.getByBreakingSystemCoolingType("Passive"))
        {
            System.out.println(v);
        }
    }
}