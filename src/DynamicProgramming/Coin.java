package DynamicProgramming;

import java.util.Scanner;

public class Coin {
    public static int coin(int [] arr, int sum){
        if (sum == 0) return 0;
        int[] dp = new int[sum + 1];
        for (int i = 1; i <= sum; i++) {
            dp[i] = Integer.MAX_VALUE;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr[i]; j <= sum; j++) {
                if (dp[j - arr[i]] != Integer.MAX_VALUE) {
                    dp[j] = Math.min(dp[j], dp[j - arr[i]] + 1);
                }
            }
        }
        return dp[sum] == Integer.MAX_VALUE ? -1 : dp[sum];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = sc.nextInt();
        System.out.println(coin(arr, sum));
    }
}
