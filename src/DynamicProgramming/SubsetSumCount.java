package DynamicProgramming;

import java.util.Scanner;

public class SubsetSumCount {
    public SubsetSumCount() {
    }

    public static int SubsetSumCount(int [] arr, int n, int sum){
        int [][] dp = new int[n+1][sum+1];
        for(int i = 0; i <= n; i++){
            dp[i][0] = 1;
        }
        for(int i = 1; i <= n; i++){
            for(int j = 0; j <= sum; j++){
                if(j >=arr[i-1]){
                    dp[i][j] = dp[i-1][j] + dp[i-1][j-arr[i-1]];
                }
                else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[n][sum];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = sc.nextInt();
        System.out.println(SubsetSumCount(arr, n, sum));
    }
}
