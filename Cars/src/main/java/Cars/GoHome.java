package Cars;

public class GoHome {
    public static void main(String[] args) {
        Car audi = new BenzinCar(Toplivo.BENZIN95, "avtomat", true);
        Car tesla = new ElectroCar(Toplivo.ELECTRO, "neAvtomat", false);
        Car ford = new DieselCar(Toplivo.DIESEL, "avtomat", true);
        Snegohod sani = new ElectroCar(Toplivo.ELECTRO, "avtomat", true);
        ford.goHome();
        tesla.goHome();
        audi.goHome();
        sani.goSneg();

    }
    }
