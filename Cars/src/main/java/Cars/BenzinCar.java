package Cars;

public class BenzinCar extends Car {

    public BenzinCar(Toplivo toplivoType, String korobka, boolean toplivoUr) {
        super(Toplivo.BENZIN, korobka, toplivoUr);
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
