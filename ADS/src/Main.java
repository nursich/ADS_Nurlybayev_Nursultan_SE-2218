public class Main {
    public static void main(String[] args) {
        int n = 7;   // initialize a number
        int n2 = 10;   // initialize a number
        if (isPrime(n)) {   // Check the number
            System.out.println("The number: " + n + " is prime");
        } else {
            System.out.println("The number:" + n + " is not prime");
        }
        if (isPrime(n2)) {   // Check the number
            System.out.println("The number: " + n2 + " is prime");
        } else {
            System.out.println("The number: " + n2 + " is not prime");
        }
    }
    public static boolean isPrime(int n) {
        boolean st = true;  // boolean variable in order to check
        for(int i = 2; i < n; i++) {
            if (n % i == 0) {   // condition: if any number that divides to 'n' met = not prime
                st = false;
                break;
            }
        }
        return st;
    }
}
