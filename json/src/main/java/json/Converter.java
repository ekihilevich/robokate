package json;

import com.google.gson.Gson;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Converter {
    public static Logger LOGGER = LogManager.getLogger();

    public static void main(String[] args) throws Exception {

        Gson gson = new Gson();
        LOGGER.debug("Object created");
        try (Reader reader = new FileReader("/Users/ekaterinakihilevich/IdeaProjects/Automation/json/document.json")) {
            LOGGER.debug("File is readed");
            DataSource transaction = gson.fromJson(reader, DataSource.class);
            LOGGER.debug("Json was converted into object");
            System.out.println(transaction);
            String json = gson.toJson(transaction);
            LOGGER.debug("Object was converted to json ");
            System.out.println(json);
            try (FileWriter writer = new FileWriter("/Users/ekaterinakihilevich/IdeaProjects/Automation/json/document1.json")) {
                gson.toJson(transaction, writer);
                LOGGER.debug("Json was written into the file document1");
            }
        }
    }
}