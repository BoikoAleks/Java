package org.example.serialize;

import java.io.IOException;
import java.util.List;

public interface Serialize<T>  //шаблон
{
    void writeToFile(List<T> objs, String fileName) throws IOException;
    List<T> readFromFile(String fileName) throws IOException, ClassNotFoundException;
}