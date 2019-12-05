package Cars;

public class Car {
    Toplivo toplivoType;
    String korobka;
    boolean toplivoUr;


    public Car(Toplivo toplivoType, String korobka, boolean toplivoUr) {
        this.toplivoUr = toplivoUr;
        this.korobka = korobka;
        this.toplivoType = toplivoType;
    }

   public void goHome() {};
   public void goSneg() {};
}
