package week1;

import java.util.Scanner;

public class subarraySumEqualsK {
    static int countSubarray(int[] arr, int k) {
        int c = 0;
            for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum == k) {
                    c++;
                }
            }
        }
        
        return c;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) arr[i] = scan.nextInt();
        int k = scan.nextInt();
        System.out.println(countSubarray(arr, k));
        scan.close();
    }

}
