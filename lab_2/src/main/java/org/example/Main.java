package org.example;

import javax.xml.stream.XMLStreamException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.example.entities.*;
import org.example.serialize.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException { //parametr class
        vechicle car = new vechicle("BMW","m5",30000,new Saller("Bogdan", "Vihovski"));
        vechicle bike = new vechicle("Honda","CBR",5000,new Saller("Linkoln","Rake"));

        List<vechicle> catalog = new ArrayList<>();
        catalog.add(car);
        catalog.add(bike);

        SerializeToJSON serializerJSON = new SerializeToJSON();
        SerializeToXml serializerToXml = new SerializeToXml();
        SerializeToTxt serializerToTxt = new SerializeToTxt();

        System.out.println("JSON:");
        serializerJSON.writeToFile(catalog,"example.json");
        System.out.println(serializerJSON.readFromFile("example.json"));

        System.out.println("XML:");
        serializerToXml.writeToFile(catalog,"example.xml");
        System.out.println(serializerToXml.readFromFile("example.xml"));

        System.out.println("TXT:");
        serializerToTxt.writeToFile(catalog,"example.txt");
        System.out.println(serializerToTxt.readFromFile("example.txt"));
    }
}