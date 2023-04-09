public class Main {
    public static void main(String[] args) {
        int n = 5;   // initialize a number
        int n2= 17;
        System.out.println("The " + n + "-th element in Fibonacci sequence is: " + fibonacciEl(n));  // print a result
        System.out.println("The " + n2 + "-th element in Fibonacci sequence is: " + fibonacciEl(n2));
    }
    public static int fibonacciEl(int n) {
        if (n == 0) {      // base condition n1
            return 0;
        }
        else if (n == 1) {      // base condition n2
            return 1;
        }
        else {     // recursion in order to find n-th element in Fibo sequence
            return fibonacciEl(n - 1) + fibonacciEl(n - 2);
        }
    }
}
