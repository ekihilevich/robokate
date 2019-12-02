package Cars;

public class Car {

    Toplivo toplivoType;
    String korobka;
    boolean toplivoUr;


    public Car(Toplivo toplivoType, String korobka, boolean toplivoUr) {
        this.toplivoType = toplivoType;
        this.toplivoUr = toplivoUr;
        this.korobka = korobka;
    }

   public void goHome() {};
   public void goSneg() {};
}
