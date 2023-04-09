public class Main {
    public static void main(String[] args) {
        int a = 2;   // inialize a base number
        int n = 10;  // initialize a exponential number
        System.out.println(toPower(a, n)); // print a result
    }

    public static int toPower(int a, int n) {
        if (n == 1) {
            return a;  // base condition if n = 1 return base num
        }
        else {
            return a * toPower(a, n - 1);
        }  // return the base number multiplied with the func called recursively arguments as the base and power minus 1
    }
}
