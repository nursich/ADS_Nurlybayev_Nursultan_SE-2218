public class Main {
    public static void main(String[] args) {
        int n = 7;
        int k = 3;
        System.out.println("The result of C(" + n + "," + k + ") is " + binomialCoeff(n, k));
    }
    public static int binomialCoeff(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        }
        else {
            return binomialCoeff(n - 1, k - 1) + binomialCoeff(n - 1, k);
        }
    }
}
