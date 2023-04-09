public class Main {
    public static void main(String[] args) {
        int n = 5;   // initialize a number
        System.out.println(findFactorial(n));
    }
    public static int findFactorial(int n) {
        if (n == 1){  // base condition
            return 1;
        }
        else {
            return n * findFactorial(n - 1); // using recursion in order to multiply 'n' to 'n-1' and etc
        }
    }
}
