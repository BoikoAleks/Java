package org.example.serialize;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.entities.vechicle;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class SerializeToJSON implements Serialize<vechicle> {
    @Override
    public void writeToFile(List<vechicle> objs, String fileName) throws IOException
    {
        ObjectMapper mapper = new ObjectMapper();  //
        mapper.writeValue(new File(fileName),objs);
    }

    @Override
    public List<vechicle> readFromFile(String fileName) throws IOException
    {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(new File(fileName), new TypeReference<List<vechicle>>(){});
    }
}
