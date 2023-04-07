import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
        }
        int min = findMinFromArr(arr, n);
        System.out.println("Problem 1. Min from arr is: " + min);

        double avg = findAvg(arr, n);
        System.out.println("Problem 2. Average from arr is: " + avg);

        if(isPrime(n))
            System.out.println("Problem 3. Number n is prime");
        else{
            System.out.println("Problem 3. Number n is component");
        }

        int factorial = factorial(n);
        System.out.println("Problem 4. " + n + "! = " + factorial);

        int nthElement = fibonacci(n);
        System.out.println("Problem 5. "+ n + "-th element of Fibonacci sequence is " + nthElement);

    }

    /*
    int findMinFromArr(int[] arr, int n)

    @findMinFromArr - function for finding minimum number from array
    @parameter  int[] arr - arr from which we find minimum number
    @parameter int n - number of elements in array
    @return - minimum number from array
    */
    public static int findMinFromArr(int[] arr, int n){
        if(n==1)
            return arr[0];
        else {
            int min = findMinFromArr(arr, n - 1); //move with n-1 length
            return Math.min(min, arr[n-1]);//return lesser number
        }
    }


        /*
    double findAvg(int[] arr, int n)

    @findAvg - function for finding average number from array
    @parameter int[] arr - array from which we find average number
    @parameter int n - number of elements in array
    @return - average number from array
    */
        public static double findAvg(int[] arr, int n){
            double sum = 0;
            for(int i = 0; i < n; i++){ //creating a loop to sum all numbers in array
                sum = sum + arr[i];
            }
            double avg = sum / n; //defining average
            return avg;
        }

    /*
    boolean isPrime(int n)

    @isPrime - function to identify if number is prime
    @parameter int n - number which is under testing
    @return - true if number is prime and false if component

     */
    public static boolean isPrime(int n){
        boolean flag = true; //setting a flag for further identifying of prime a number or not
        for(int i = 2; i <= n/2; i++){ //Creating Loop through all numbers from 2 to n/2
            if(n % i == 0){ //Creating if statement to find prime numbers
                flag = false; //setting a flag's value to false if number is not prime
                break; //breaking a loop after finding component number
            }
        }
        return flag;
    }

    /*
    int factorial(int n)

    @factorial - function to calculate factorial
    @parameter int n - number whose factorial we need
    @return - factorial of the number
     */
    public static int factorial(int n) {

        if (n == 0 || n == 1) {// Base case: if n is 0 or 1 then return 1 because 0! = 1 and 1! = 1
            return 1;
        }
        else {
            return n * factorial(n - 1);// Recursive case: if n is greater than 1 - use factorial
        }
    }

    /*
    int fibonacci(int n)

    @fibonacci - function to calculate n-th element of Fibonacci sequence
    @parameter int n - the serial number of the Fibonacci element that needs to be found
    @return - n-th element of Fibonacci sequence
     */
    public static int fibonacci(int n) {

        if (n == 0 || n == 1) {// Base case: if n is 0 or 1 then return n
            return n;
        }

        else { // Recursive case: if n is greater than 1 - calculate the n-th element of Fibonacci sequence
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }

}

