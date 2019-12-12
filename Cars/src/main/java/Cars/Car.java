package Cars;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Car {
    Toplivo toplivoType;
    String korobka;
    boolean toplivoUr;

    public static Logger LOGGER = LogManager.getLogger();

    public Car(Toplivo toplivoType, String korobka, boolean toplivoUr) {

        LOGGER.info("start");
        this.toplivoUr = toplivoUr;
        this.korobka = korobka;
        this.toplivoType = toplivoType;
        LOGGER.info("finish");
    }


   public void goHome() {};
   public void goSneg() {};
}
