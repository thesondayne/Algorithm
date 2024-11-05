package Greedy;

import java.util.Arrays;
import java.util.Scanner;

public class Z_MaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n-k+1; i++) {
            min = Math.min(min, arr[i+k-1]-arr[i]);
        }
        System.out.println(min);
    }
}
