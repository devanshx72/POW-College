package week1;

import java.util.*;

public class rubySecondHouse {
    static int findMinCost(int[][] arr) { 
            int n = arr.length; 
            if (n == 0) return 0; 
            int k = arr[0].length; 
            if (k == 0) return 0; 
            int m1 = -1, m2 = -1; 
     
            for (int i = 0; i < n; i++) { 
                int lastM1 = m1, lastM2 = m2; 
                m1 = -1; 
                m2 = -1; 
                for (int j = 0; j < k; j++) { 
                    if (i > 0) { 
                        if (j != lastM1) arr[i][j] += arr[i - 1][lastM1]; 
                        else arr[i][j] += arr[i - 1][lastM2]; 
                    } 
                    if (m1 == -1 || arr[i][j] < arr[i][m1]) { 
                        m2 = m1; 
                        m1 = j; 
                    } else if (m2 == -1 || arr[i][j] < arr[i][m2]) m2 = j;
                } 
            } 
     
            return arr[n - 1][m1]; 
        } 
        public static void main(String[] args) { 
            Scanner scan = new Scanner(System.in); 
            int n = scan.nextInt(); 
            int k = scan.nextInt(); 
            int[][] arr = new int[n][k]; 
            for (int i = 0; i < n; i++) { 
                for (int j = 0; j < k; j++) arr[i][j] = scan.nextInt(); 
            } 
             
            System.out.println(findMinCost(arr)); 
            scan.close();
        } 
}
