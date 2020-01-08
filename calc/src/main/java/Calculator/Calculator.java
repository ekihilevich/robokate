package Calculator;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Calculator {

        public static int getsum(int num1, int num2){
            return num1 + num2;
        }

        public static int getdiff(int num1, int num2){
            return num1 - num2;
        }

        public static int getmult(int num1, int num2){
            return num1 * num2;
        }

        public static int getdiv(int num1, int num2){
            return num1 / num2;
        }

        public static double getsqrt(int num1){
            return sqrt(num1);
        }

        public static double getpow(int num1, int num2){
            return pow(num1, num2);
        }
    }