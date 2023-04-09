import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What type of problem do you want solve?: ");
        int ans = scanner.nextInt();
        switch (ans){
            case 1:
                System.out.println("Enter number of elements in array and array itself: ");
                int n1;
                n1 = scanner.nextInt();
                int[] arr1 = new int[n1];
                for(int i = 0; i < n1; i++){
                    arr1[i] = scanner.nextInt();
                }
                int min = findMinFromArr(arr1, n1);
                System.out.println("Problem 1. Min from arr is: " + min);
                break;
            case 2:
                System.out.println("Enter number of elements in array and array itself: ");

                int n2;
                n2 = scanner.nextInt();
                int[] arr2 = new int[n2];
                for(int i = 0; i < n2; i++){
                    arr2[i] = scanner.nextInt();
                }
                double avg = findAvg(arr2, n2);
                System.out.println("Problem 2. Average from arr is: " + avg);
                break;
            case 3:
                System.out.println("Enter number you want to check prime or composite: ");
                int n3;
                n3 = scanner.nextInt();
                if(isPrime(n3))
                    System.out.println("Problem 3. Number "+ n3 +" is prime");
                else{
                    System.out.println("Problem 3. Number "+ n3 +" is composite");
                }
                break;
            case 4:
                System.out.println("Enter number of which you need a factorial: ");
                int n4;
                n4 = scanner.nextInt();
                int factorial = factorial(n4);
                System.out.println("Problem 4. " + n4 + "! = " + factorial);
                break;
            case 5:
                System.out.println("Enter number that will represent n-th element of Fibonacci sequence");
                int n5;
                n5 = scanner.nextInt();
                int nthElement = fibonacci(n5);
                System.out.println("Problem 5. "+ n5 + "-th element of Fibonacci sequence is " + nthElement);
                break;
            case 6:
                System.out.println("a^n");
                int a;
                int n6;
                Scanner sc = new Scanner(System.in);
                System.out.println("Type int a:");
                a = sc.nextInt();
                System.out.println("Type int n:");
                n6 = sc.nextInt();

                int pow = power(a, n6);
                System.out.println("Problem 6. a^n = " + pow);
                break;
            case 7:
                System.out.println("Enter number of elements in array and array itself:");
                int n7;
                n7 = scanner.nextInt();
                int[] arr7 = new int[n7];
                for(int i = 0; i < n7; i++){
                    arr7[i] = scanner.nextInt();
                }
                System.out.println("Problem 7.");
                reverseArray(arr7, n7);
                break;
            case 8:
                System.out.println("Enter a string:");
                String s;
                scanner.nextLine();
                s = scanner.nextLine();
                System.out.println("Problem 8.");


                if(isAllDigits(s)){
                    System.out.println("yes");
                }
                else{
                    System.out.println("no");
                }
                break;
            case 9:
                System.out.println("Enter n and k for binomial coef: ");
                int n = scanner.nextInt();
                int k = scanner.nextInt();
                System.out.println("Problem 9. Binomial coefficient of entered n and k: " + binomialCoefficient(n, k));
                break;
            case 10:
                System.out.println("Enter a and b to find their GCD: ");
                int a1 = scanner.nextInt();
                int b = scanner.nextInt();
                int GCD = findGCD(a1, b);
                System.out.println("Problem 10. GCD of "+ a1 +" and "+ b +" is: " + GCD);
                break;
        }



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

    public static double findAvg(int[] arr, int n) {
        if (n == 1) {//Base case: if only one element return it
            return arr[0];
        } else { //Recursive case: compute average of first n-1 elements, then add the nth element and divide by n
            return ((findAvg(arr, n - 1) * (n - 1)) + arr[n - 1]) / n;
        }
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
                break; //breaking a loop after finding composite number
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
        } else {// Recursive case: if n is greater than 0, calculate a^n as a*a^(n-1)
            return a * power(a, n - 1);
        }
    }


    /*
    void reverseArray(int[] arr, int n)

    @reverseArray - function for reversing an array
    @parameter int[] arr - arr that we want to reverse
    @parameter int n - number of elements in this array
    @return - reversed array
     */
    public static void reverseArray(int[] arr, int n) {

        if (n == 1) {// Base case: if there's only one element in the array - print it
            System.out.print(arr[0]);
        }

        else {// Recursive case: print the last element of the array then call the function on the rest of the array
            System.out.print(arr[n-1] + " "); // print last element
            reverseArray(arr, n-1); // recursion with smaller array
        }
    }

    /*
    boolean isAllDigits(String s)

    @isAllDigits - function to check if string consist of all digits
    @parameter String s - string that is going to be checked
    @return - true or false depends on is all digits string or not
     */
    public static boolean isAllDigits(String s) {

        if (s.length() == 0) {// Check for base case: if the string is empty - return true, because of the recursion part
            return true;
        }

        if (Character.isDigit(s.charAt(0))) {// Check if the first character is a digit
            return isAllDigits(s.substring(1));// Recursively check the remaining substring
        } else {
            return false;// If this character is not digit then the string is not all digits
        }
    }
    /*
    long binomialCoefficient(int n, int k)

    @binomialCoefficient - function to find binomial coefficient of n and k
    @parameter int n - part of binomial coefficient formula
    @parameter int k - part of binomial coefficient formula
    @return - binomial coefficient of n and k
     */
    public static long binomialCoefficient(int n, int k) {
        if (k == 0 || k == n) {//Base case: C(0, n) = C(n, n) = 1
            return 1;
        } else {//Recursive case: C(k, n) = C(k-1, n-1) + C(k, n-1)
            return binomialCoefficient(n-1, k-1) + binomialCoefficient(n-1, k);
        }
    }
    /*
    int findGCD(int a, int b)

    @findGCD - function to find GCD of two numbers
    @parameter a - first number
    @parameter b - second number
    @return - GCD of 'a' and 'b'
     */
    public static int findGCD(int a, int b) {
        if (b == 0) {//Base case: if b = 0 we return 'a' because GCD of 'a' and 0 is 'a'
            return a;
        }
        return findGCD(b, a % b);//Recursive case: we keep dividing the larger number by
        // the smaller number until the remainder is zero, core concept - Euclidean Algorithm
    }

}

