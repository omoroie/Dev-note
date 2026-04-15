package std_java;

public class exam14 {
    public static void main(String[] args) {
        int[] numbers = {3, 5, 8, 12, 17};
        System.out.println(computeMaxSum(numbers, 0, numbers.length - 1));
    }
    static int computeMaxSum(int[] arr, int start, int end) {
        if (start >= end) 
            return 0;
        int mid = (start + end) / 2;

        return arr[mid] + Math.max(computeMaxSum(arr, start, mid), computeMaxSum(arr, mid + 1, end));
    }
}