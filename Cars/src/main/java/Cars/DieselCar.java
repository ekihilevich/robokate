package Cars;

public class DieselCar extends Car {
    public DieselCar(Toplivo toplivoType, String korobka, boolean toplivoUr) {
        super(toplivoType, korobka, toplivoUr);
    }

    public void goHome() {

        if (toplivoUr = false) {
            System.out.println("Net topliva  nikuda ne edem");
        } else if (toplivoUr = true) {
            System.out.println("Toplivo est, zavodi i poedem");
        }

        switch (toplivoType) {
            case BENZIN92:
                System.out.println("Diesel trebyetsa, a ne benzin - 92,  nikuda ne edem");
                break;
            case BENZIN95:
                System.out.println("Diesel trebyetsa, a ne benzin - 95,  nikuda ne edem");
                break;
            case ELECTRO:
                System.out.println("Diesel trebyetsa, a ne electrichestvo - nikuda ne edem");
                break;
            default:
                System.out.println(toplivoType + " Detected! Gotov ehat");
        }
        switch (korobka) {
            case "avtomat":
                System.out.println("Avtomat - Poehali domoi");
                break;
            case "neAvtomat":
                System.out.println("ne mogy ehat, vyzovi taxi");
                break;

        }
    }
}

