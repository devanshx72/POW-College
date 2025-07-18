package week1;

import java.util.*;

public class subarraySumEqualsK {
    static int countSubarray(int[] arr, int k) {
        int c = 0;
        int sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for (int num : arr) {
            sum += num;
            if (map.containsKey(sum - k)) {
                c += map.get(sum - k);
            }
            if (map.containsKey(sum)) {
                map.put(sum, map.get(sum) + 1);
            } else {
                map.put(sum, 1);
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
        System.out.println("Total subarrays -> " + countSubarray(arr, k));
        scan.close();
    }

}
