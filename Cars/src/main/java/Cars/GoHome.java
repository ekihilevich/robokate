package Cars;

public class GoHome {
    public static void main(String[] args) {
        Car audi = new BenzinCar(Toplivo.BENZIN,"avtomat", false);
        Car audi1 = new BenzinCar(Toplivo.BENZIN,"neAvtomat", true);
        Car tesla = new ElectroCar(Toplivo.ELECTRO,"neAvtomat", true);
        Car tesla1 = new ElectroCar(Toplivo.ELECTRO, "Avtomat", false);
        Car ford = new DieselCar(Toplivo.DIESEL, "avtomat", true);
        Car ford1 = new DieselCar(Toplivo.DIESEL, "neAvtomat", false);
        Snegohod sani = new ElectroCar(Toplivo.ELECTRO,"avtomat", true);

        ford.goHome();
        ford1.goHome();
        tesla.goHome();
        tesla1.goHome();
        audi.goHome();
        audi1.goHome();
        sani.goSneg();

    }
    }
