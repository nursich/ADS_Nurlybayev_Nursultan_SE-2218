public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 1, 32, 3, 45}; // given array
        System.out.println("Minimum in the array is:" + findMin(arr, arr.length)); // print solution on the screen
    }
    public static int findMin(int[] arr, int n) {
        if (n == 1) {       // base condition in order not to break a code
            return arr[0];
        }
        else {
            int minValue = findMin(arr, n - 1);   // variable calls the func
            return Math.min(minValue, arr[n - 1]);   // сomparing one element with 'n-1' el
        }
    }
}