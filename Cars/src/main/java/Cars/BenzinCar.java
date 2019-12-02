package Cars;

public class BenzinCar extends Car {


    public BenzinCar(Toplivo toplivoType, String korobka, boolean toplivoUr) {
        super(toplivoType, korobka, toplivoUr);
    }

    public void goHome() {

        if (toplivoUr = false) {
            System.out.println("Net topliva  nikuda ne edem");
        } else if (toplivoUr = true) {
            System.out.println("Toplivo est, zavodi i poedem");
        }

        switch (toplivoType) {
            case ELECTRO:
                System.out.println("Benzin trebyetsa, a ne electro,  nikuda ne edem");
                break;
            case DIESEL:
                System.out.println("Benzin trebyetsa, a ne diesel - nikuda ne edem");
                break;
            default:
                System.out.println (toplivoType + " Detected! Gotov ehat");
        }
        switch (korobka) {
            case "avtomat":
                System.out.println("Avtomat - Poehali domoi");
                break;
            case "NeAvtomat":
                System.out.println("ne mogy ehat, vyzovi taxi");
                    break;

        }

    }

}
