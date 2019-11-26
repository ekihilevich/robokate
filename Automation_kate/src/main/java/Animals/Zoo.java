package Animals;
public class Zoo {
public static void main(String[] args) {

        Cat street = new Cat("Red", 5, 45, "Street");
        Cat bob = new Cat("Bob", "Red", 4, 30, "Home");
        Dog polkan = new Dog("Polkan");
        Dog reks = new Dog ("Multi", 35,60,"ovcharka");
        Dog sharik = new Dog ("Brown", 20,50,"pekines");
        Enot lesnoy = new Enot ("polosatyi", 2, 20, "Zivet v lesy");
        Enot buryi new Enot ();
//        Sravnenie kotov
    boolean sravn;

    sravn = street.equals(bob);
    System.out.println("Cats the same ? - " + sravn);
// Vyvodim kota
    System.out.println(street.toString());
//    Cat's move
    System.out.println(bob.getMove());
//    Sravnenie sobak
    sravn = reks.equals(sharik);
    System.out.println("Poroda the same ? - " + sravn);
//    Vyvodim sobaky
    System.out.println(reks.toString());
// Dog's move
    System.out.println(polkan.getMove());
//    Create and move enot
    System.out.println(lesnoy.toString());
    System.out.println(lesnoy.getMove());
}


}
