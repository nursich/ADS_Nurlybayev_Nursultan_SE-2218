public class Main {
    public static void main(String[] args) {
        int[] arr = {3, 2, 4, 1}; // given array
        System.out.println(arrAverage(arr, arr.length)); // print result

    }
    public static float arrAverage(int[] arr, int n) {
        float sum = 0;  // variable to count sum numbers in array
        for(int i = 0; i < n; i++) {
            sum += arr[i];  // iterating every element in array and incrementing it to the variable
        }
        return (sum / arr.length);  // returning the solution
    }
}