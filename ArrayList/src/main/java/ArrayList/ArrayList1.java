package ArrayList;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.LinkedList;
public class ArrayList1 {

    public static Logger LOGGER = LogManager.getLogger();
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        LinkedList<String> sosedi = new LinkedList();
        LOGGER.debug("start");
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);
        cars.set(3, "Mazda1");
        cars.remove("Volvo");
        cars.remove(1);
        LOGGER.error("finish");
        System.out.println(cars);
        sosedi.add("Vasya");
        sosedi.add("Masha");
        sosedi.add("Petya");
        sosedi.add("Ivan");
        System.out.println(sosedi.getFirst() + " - First sosed");
        if (sosedi.contains("Masha")) {
            LOGGER.debug("Masha zdes");
        } else  LOGGER.debug("Mashs ushla");


    }
}




