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
        LOGGER.info("start");
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);
        cars.set(3, "Mazda1");
        cars.remove("Volvo");
        cars.remove(1);
        LOGGER.info("finish");
        System.out.println(cars);
        sosedi.add("Vasya");
        sosedi.add("Masha");
        sosedi.add("Petya");
        sosedi.add("Ivan");
        System.out.println(sosedi.getFirst() + " - First sosed");


    }
}




