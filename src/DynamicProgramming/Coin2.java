package DynamicProgramming;

import java.util.Scanner;

public class Coin2 {
    public static int coin2(int [] arr, int sum){
        int [] dp = new int[sum+1];
        dp[0] = 1;
        for(int i=1;i<=sum;i++){
            for(int j=0;j<arr.length;j++){
                if(i-arr[j]>=0){
                    dp[i] += dp[i-arr[j]];
                }
            }
        }
        return dp[sum];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = sc.nextInt();
        System.out.println(coin2(arr, sum));
    }
}
