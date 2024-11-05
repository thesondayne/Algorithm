package Greedy;

import java.util.Arrays;
import java.util.Scanner;

public class Z_HangDoiKhoChiu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int time = 0;
        int cnt=0;
        for (int i = 0; i < n; i++) {
            if (arr[i] >=time) {
                cnt++;
                time += arr[i];
            }
        }
        System.out.println(cnt);
    }
}
