package Cars;

public class DieselCar extends Car {


    public DieselCar(Toplivo toplivoType, String korobka, boolean toplivoUr) {
        super(Toplivo.DIESEL, korobka, toplivoUr);
    }
    public void goHome() {
        System.out.println(" ");
        System.out.println( toplivoType + " Pravilnoe toplivo!");

        if (toplivoUr == false) {
            System.out.println("Net topliva  nikuda ne edem");
        } else if (korobka == "avtomat") {

            System.out.println("Toplivo est, zavodi i poedem");
            System.out.println("Avtomat - Poehali domoi");
        } else {
            System.out.println("Ne mogy ehat, vyzovi taxi");
        }
    }
}

