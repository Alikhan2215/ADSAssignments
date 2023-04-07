import java.util.Scanner;

public class ProblemSix {
    /*
    int power(int a, int n)

    @power - function to find 'a' to the power of 'n'
    @parameter int a - the number we raise to a power
    @parameter int n - to what power we raise number 'a'
    @return - a^n
     */
    public static int power(int a, int n) {

        if (n == 0) {// Base case: if n is 0 - return 1 because a^0 = 1
            return 1;
        }
        // Recursive case: if n is greater than 0, calculate a^n as a*a^(n-1)
        else {
            return a * power(a, n-1);
        }
    }

    public static void main(String[] args){
        int a;
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Type int a:");
        a = sc.nextInt();
        System.out.println("Type int n:");
        n = sc.nextInt();

        int pow = power(a, n);
        System.out.println("Problem 6. a^n = " + pow);
    }
}
