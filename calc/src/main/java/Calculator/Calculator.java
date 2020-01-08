package Calculator;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Calculator {
    public static void main(String[] args) {

        Calculator.getsum(2, 2);
        Calculator.getdiff(2, 2);
        System.out.println(Calculator.getpow(5, 2));
        Calculator.getdiv(2, 2);
        Calculator.getmult(2, 2);
        Calculator.getpow(2, 2);
        Calculator.getsqrt(9);
    }

        public static int getsum ( int num1, int num2){
            int sum = num1 + num2;
            return sum;
        }
        public static int getdiff ( int num1, int num2){
            int diff = num1 - num2;
            return diff;
        }
        public static int getmult ( int num1, int num2){
            int mult = num1 * num2;
            return mult;

        }
        public static int getdiv ( int num1, int num2){
            int div = num1 / num2;
            return div;
        }
        public static double getsqrt ( int num1){
            double sqrt = sqrt(num1);
            return sqrt;
        }
        public static double getpow ( int num1, int num2){
            double pow = pow(num1, num2);
            return pow;
        }

    }





