package ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;

public class MapList {
    public static void main(String[] args) {

        Map<String, String> person = new HashMap<String, String>();
        person.put("p1", "Tom");
        person.put("p2", "Mike");
        person.put("p3", "Sam");
        person.put("p4", "Bon");

        System.out.println(person.get("p2") + " - Potom udalim ego");
        Set<String> keys = person.keySet();
        System.out.println(keys + " - keys values");
        Collection<String> values = person.values();
        System.out.println(values + " - spisok vsex imen");

        person.replace("p1", "Ivan");

        person.remove("p2");
        System.out.println(person + " - spisok bez Mike");
    }
}
