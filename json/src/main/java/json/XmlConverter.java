package json;

import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;
import java.io.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class XmlConverter {
    public static Logger LOGGER = LogManager.getLogger();
    public static void main(String[] args) throws Exception
    {
        DataSource dataXml = new DataSource();
        LOGGER.info("New DataSource object created");
        Serializer serializer = new Persister();
        File source = new File("example.xml");
        LOGGER.info("Source file defined");
        serializer.read(dataXml, source);
        LOGGER.info("Data pasted to dataXml object");
        System.out.println(dataXml);
        File result = new File("example.xml");
        serializer.write(dataXml, result);
        LOGGER.info("Data is written to file from dataXml object");
        System.out.println(dataXml);
    }
}