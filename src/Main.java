import java.util.Scanner;

public class Main {
    /**
     * Calculates the binomial coefficient (n choose k) using factorials.
     *
     * @param n Total number of items
     * @param k Number of items to choose
     * @return Binomial coefficient (n choose k)
     */
    public static int calculateBC(int n, int k) {
        return factorial(n) / (factorial(k) * factorial(n - k));
    }
    /**
     * Calculates the factorial of a given number.
     *
     * @param num The input number
     * @return Factorial of num
     */

    public static int factorial(int num) {
        // Base case: if num is less than or equal to 1, return 1
        if (num <= 1) {
            return 1;
        } else {
            // Recursive case: multiply num by the factorial of (num - 1)
            return num * factorial(num - 1);
        }
    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n= scan.nextInt();
        int k=scan.nextInt();
        System.out.println(calculateBC(n,k));
    }
}
