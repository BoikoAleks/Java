package org.example;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.example.serialize.*;
import org.example.entities.*;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import static org.testng.Assert.assertEquals;


public class test {
    @Test(dataProvider = "serializeToJSONTest")
    public void serializeProviderTest(String fileName, Serialize<vechicle> serializer, List<vechicle> objs) throws IOException, ClassNotFoundException {
        serializer.writeToFile(objs, fileName);
        List<vechicle> res = serializer.readFromFile(fileName);
        assertEquals(res, objs);
    }

    @DataProvider
    public Object[][] serializeToJSONTest() {
        List<vechicle> list = Arrays.asList
                (
                        new vechicle("Yamaha", "mt 03", 19000, new Saller("Bob", "Jonson")),
                            new vechicle("KTM", "Duke", 5000, new Saller("John", "Ellison"))
                );
        return new Object[][]
                {
                        {"example.json", new SerializeToJSON(), list},
                        {"example.xml", new SerializeToXml(), list},
                        {"example.txt", new SerializeToTxt(), list}
                };
    }
}
