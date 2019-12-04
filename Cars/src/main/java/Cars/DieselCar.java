package Cars;

public class DieselCar extends Car {

    Toplivo toplivoType;

    public DieselCar(String korobka, boolean toplivoUr) {
        super(korobka, toplivoUr);
        toplivoType = Toplivo.DIESEL;
    }
    public void goHome() {
        System.out.println(" ");
        System.out.println(toplivoType + " Pravilnoe toplivo!");
        if (toplivoUr = false) {
            System.out.println("Net topliva  nikuda ne edem");
        } else if (toplivoUr = true) {
            System.out.println("Toplivo est, zavodi i poedem");
        }
        switch (korobka) {
            case "avtomat":
                System.out.println("Avtomat - Poehali domoi");
                break;
            case "neAvtomat":
                System.out.println("Ne mogy ehat, vyzovi taxi");
                break;
        }
    }
}

