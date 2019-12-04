package Cars;

public class GoHome {
    public static void main(String[] args) {
        Car audi = new BenzinCar("avtomat", true);
        Car audi1 = new BenzinCar("neAvtomat", true);
        Car tesla = new ElectroCar("neAvtomat", true);
        Car tesla1 = new ElectroCar("Avtomat", false);
        Car ford = new DieselCar("avtomat", true);
        Car ford1 = new DieselCar("neAvtomat", false);
        Snegohod sani = new ElectroCar( "avtomat", true);

        ford.goHome();
        ford1.goHome();
        tesla.goHome();
        tesla1.goHome();
        audi.goHome();
        audi1.goHome();
        sani.goSneg();

    }
    }
