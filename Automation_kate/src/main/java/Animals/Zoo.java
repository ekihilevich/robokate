package Animals;
public class Zoo {
public static void main(String[] args) {

        Cat street = new Cat("Red", 5, 45, "Street");
        Cat bob = new Cat("Bob", "Red", 4, 30, "Home");
        Dog polkan = new Dog("Polkan");
        Dog reks = new Dog ("Multi", 35,60,"ovcharka");
        Dog sharik = new Dog ("Brown", 20,50,"pekines");
        Enot lesnoy = new Enot ("polosatyi", 2, 20, "Zivet v lesy");
//        Сравнение котов
    boolean sravn, sravn1;

    sravn = street.equals(bob);
    System.out.println("Cats the same ? - " + sravn);
// Выводим первого кота
    System.out.println(street.toString());
//    Движение кота
    System.out.println(bob.getMove());
//    Сравнение собак
    sravn1 = reks.equals(sharik);
    System.out.println("Poroda the same ? - " + sravn1);
//    Ввыодим собаку
    System.out.println(reks.toString());
// Движение собаки
    System.out.println(polkan.getMove());
//    Создание и движение енота
    System.out.println(lesnoy.toString());
    System.out.println(lesnoy.getMove());
}


}
