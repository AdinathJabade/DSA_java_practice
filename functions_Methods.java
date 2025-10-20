import java.util.*;

public class functions_Methods {
    // Basic first code of printing Hello world
    public static void printHelloWorld() {
        System.out.println("Hello world");
    }

    // sum of two numbers
    public static int sumOfNum(int a, int b) {
        return a + b;
    }

    // swap value
    public static void swapVal(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("after swaping values:" + a + " and" + " " + b);
    }

    // product of two numbers
    public static int productOfTwoNum(int a, int b) {
        int product = a * b;
        return product;
    }

    // find factorial
    public static int findFact(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // bionomial coeficient
    public static int calFact(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static int binoalCoee(int n, int r) {
        int factn = calFact(n);
        int factr = calFact(r);
        int factnMr = calFact(n - r);
        return factn / (factr * factnMr);
    }

    // overloading exa.
    public static void calSum(int num1, int num2) {
        System.out.println("sum of two num:" + (num1 + num2));
    }

    public static void calSum(int num1, int num2, int num3) {
        System.out.println("sum of three num:" + (num1 + num2 + num3));
    }

    public static void calSum(int num1, int num2, int num3, int num4) {
        System.out.println("sum of four num:" + (num1 + num2 + num3 + num4));
    }

    // prime number program
    public static boolean checkPrime(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }

        }

        return true;

    }

    // prime range
    public static void allPrime(int n) {
        for (int i = 2; i <= n; i++) {
            if (!checkPrime(i)) {
                continue;
            } else {
                System.out.print(i + " ");
            }
        }
    }

    // binary to decimal
    public static void binToDeci(int num) {
        int decimal = 0;
        int power = 0;
        while (num > 0) {
            int digit = num % 10;
            decimal = (int) (decimal + (digit * (Math.pow(2, power))));
            power++;
            num = num / 10;
        }
        System.out.println("decimal:" + decimal);
    }

    public static void main(String[] args) {
        // printHelloWorld();
        // System.out.println("Sum of two numbers is:"+sumOfNum(2, 3));
        // int a=50;
        // int b=10;
        // System.out.println("before swaping values:"+a+" and"+" "+b);
        // swapVal(a, b);
        // int product=productOfTwoNum(a, b);
        // System.out.println("product is:"+product);
        // int n=4;
        // int factorial=findFact(n);
        // System.out.println("factorial of"+" "+n+" "+"is"+" "+factorial);
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the n:");
        // int n = sc.nextInt();
        // System.out.print("Enter the r:");
        // int r = sc.nextInt();
        // System.out.println("Bionomial coeficient:"+binoalCoee(n, r));
        // calSum(0, 4);
        // calSum(2, 4, 5, 1);
        // calSum(4, 5, 1);
        // checkPrime(7);
        // allPrime(200);
        binToDeci(1111);
    }
}
