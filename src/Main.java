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
        System.out.println("1 Problem. Min from arr is: " + min);
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
}
