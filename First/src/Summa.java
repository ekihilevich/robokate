import java.util.Scanner;
public class Summa {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter some number: ");
        int num = in.nextInt();
        int cif = (int)Math.log10(num)+1;
        int sum =0;

        int[] b = new int[cif];
        for (int i = 0; i < cif; i++) {
            b[i] = num % 10;
            sum = sum + num % 10;
            num = num / 10;

        }
        System.out.println( "Summa cifr - " + sum);
    }
}
