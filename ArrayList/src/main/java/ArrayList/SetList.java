package ArrayList;
import java.util.HashSet;
import java.util.Iterator;
public class SetList {
    public static void main(String[] args) {
        HashSet<String> country = new HashSet<>();
        country.add("Belarus");
        country.add("France");
        country.add("Italy");
        country.add("Germany");
        country.add("Belarus");
        country.contains("Belarus");


        System.out.println(country);
        System.out.println(country.size());
        System.out.println("Belarus edet na evrovodenie - " + country.contains("Belarus"));
        Iterator<String> iterator = country.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next()
                    + ", ");
        }
    }
}