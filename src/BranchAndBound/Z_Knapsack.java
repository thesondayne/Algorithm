package BranchAndBound;

import java.util.Arrays;
import java.util.Scanner;

public class Z_Knapsack {
    static int n;
    static int w;
    static int[] profit;
    static int[] weight;
    static boolean[] used;
    static int max = 0;
    public static void Try(int i, int sum, int value) {
        for (int j = 0; j < n; j++) {
            if (!used[j] && sum + weight[j] <= w) {
                used[j] = true;
                sum += weight[j];
                value += profit[j];
                max = Math.max(max, value);
                if (sum < w) {
                    Try(i + 1, sum, value);
                }
                used[j] = false;
                sum -= weight[j];
                value -= profit[j];
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        w = sc.nextInt();
        profit = new int[n];
        weight = new int[n];
        used = new boolean[n];
        Arrays.fill(used, false);
        for (int i = 0; i < n; i++) {
            profit[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            weight[i] = sc.nextInt();
        }
        Try(0, 0,0);
        System.out.println(max);
    }
}
