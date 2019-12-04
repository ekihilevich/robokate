package Cars;

public class BenzinCar extends Car {

    Toplivo toplivoType;
    public BenzinCar(String korobka, boolean toplivoUr) {
        super(korobka, toplivoUr);
        toplivoType = Toplivo.BENZIN;
    }
    public void goHome() {
        System.out.println(" ");
        System.out.println( toplivoType + " Pravilnoe toplivo!");

        if (toplivoUr = false) {
            System.out.println("Net topliva  nikuda ne edem");
        } else if (toplivoUr = true) {
            System.out.println("Toplivo est, zavodi i poedem");
        }
        switch (korobka) {
            case "avtomat":
                System.out.println("Avtomat - Poehali domoi");
                break;
            case "NeAvtomat":
                System.out.println("Ne mogy ehat, vyzovi taxi");
                    break;
        }
    }
}
