package org.example.serialize;


import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
//import lab2.entities.Person;

import java.io.File;
import java.io.IOException;
import java.util.List;
import org.example.entities.vechicle;
import org.example.serialize.Serialize;

public class SerializeToXml implements Serialize<vechicle> {
    @Override
    public void writeToFile(List<vechicle> objs, String fileName) throws IOException {
        XmlMapper mapper = new XmlMapper();
        mapper.writeValue(new File(fileName),objs);
    }

    @Override
    public List<vechicle> readFromFile(String fileName) throws IOException {
        XmlMapper mapper = new XmlMapper();
        return mapper.readValue(new File(fileName), new TypeReference<List<vechicle>>(){});
    }
}