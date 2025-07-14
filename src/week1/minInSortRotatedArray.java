package week1;
import java.util.*;

public class minInSortRotatedArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = scan.nextInt(); 
        int low = 0;
        int high = n - 1;
        int min = finMin(arr, low, high);
        System.out.println(min);
        scan.close();
    }
    static int finMin(int[] arr, int low, int high) {
        while (low < high) {
            int mid = (low + high) / 2;
            if (arr[mid] > arr[high]) low = mid + 1;
            else high = mid;
        }
        return arr[low];
    }
}
