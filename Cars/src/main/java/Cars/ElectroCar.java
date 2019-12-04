package Cars;

public class ElectroCar extends Car implements Snegohod {

    Toplivo toplivoType;

    public ElectroCar( String korobka, boolean toplivoUr) {
        super(korobka, toplivoUr);
        toplivoType = Toplivo.ELECTRO;
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
    @Override
    public void goSneg() {
        System.out.println(" ");
        System.out.println("Poehali na sankah");
    }
}

