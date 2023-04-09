public class Main {
    public static void main(String[] args) {
        int a = 32;
        int b = 48;
        System.out.println("The GCD of (" + a + "," + b + ") is " + getGCD(a, b));
    }
    public static int getGCD(int a, int b) {
        if (a == 0) {
            return b;
        }
        if (b == 0) {
            return a;
        }
        else {
            return getGCD(b, (a % b));
        }
    }
}
