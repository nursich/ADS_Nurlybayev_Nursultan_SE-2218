public class Main {
    public static void main(String[] args) {
        String s = "123456";
        int n = s.length() - 1;
        if(ifStringOnlyDigits(s, n)) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
    public static boolean ifStringOnlyDigits(String s, int n) {
        if(n == 1) {
            return Character.isDigit(s.charAt(0));
        }
        if(Character.isDigit(s.charAt(n))) {
            return ifStringOnlyDigits(s, n - 1);
        }
        else {
            return false;
        }
    }
}
