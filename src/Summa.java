public class Summa {
    public static void main(String[] args) {


        int c =0;
        int a = 22222;
        int[] b = new int[5];
        for (int i = 0; i < 5; i++) {
            b[i] = a % 10;
            c = c + a % 10;
            a = a / 10;

        }
        System.out.println(c);
    }
}
