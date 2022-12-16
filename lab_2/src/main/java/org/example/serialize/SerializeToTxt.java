package org.example.serialize;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.type.ReferenceType;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvParser;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.example.entities.vechicle;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class SerializeToTxt implements Serialize<vechicle> {
    @Override
    public void writeToFile(List<vechicle> objs, String fileName) throws IOException
    {
        CsvMapper mapper = new CsvMapper();
        mapper.configure(JsonGenerator.Feature.IGNORE_UNKNOWN,true);
        CsvSchema schema = mapper.schemaFor(vechicle.class);
        ObjectWriter writer = mapper.writerFor(vechicle.class).with(schema);
        writer.writeValues(new File(fileName)).writeAll(objs);
    }

    @Override
    public List<vechicle> readFromFile(String fileName) throws IOException
    {
        CsvMapper mapper = new CsvMapper();
        mapper.configure(JsonGenerator.Feature.IGNORE_UNKNOWN,true);
        CsvSchema schema = mapper.schemaFor(vechicle.class);
        ObjectReader reader = mapper.readerFor(vechicle.class).with(schema);
        return (List)reader.readValues(new File(fileName)).readAll();
    }
}