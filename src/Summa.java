import java.util.Scanner;
public class Summa {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter some 5 digit number: ");
        int num = in.nextInt();


        int sum =0;

        int[] b = new int[5];
        for (int i = 0; i < 5; i++) {
            b[i] = num % 10;
            sum = sum + num % 10;
            num = num / 10;

        }
        System.out.println( "Summa cifr - " + sum);
    }
}
