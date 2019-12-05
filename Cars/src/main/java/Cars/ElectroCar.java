package Cars;

public class ElectroCar extends Car implements Snegohod {


    public ElectroCar(Toplivo toplivoType, String korobka, boolean toplivoUr) {
        super(Toplivo.ELECTRO, korobka, toplivoUr);
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
    @Override
    public void goSneg() {
        System.out.println(" ");
        System.out.println("Poehali na sankah");
    }
}

