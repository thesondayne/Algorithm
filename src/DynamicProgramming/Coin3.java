package DynamicProgramming;

import java.util.Scanner;

public class Coin3 {
    public static int coin3(int [] arr, int sum){
        int [] dp = new int[sum+1];
        dp[0] = 1;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<sum+1; j++){
                if(j>=arr[i]){
                    dp[j] += dp[j-arr[i]];
                }
            }
        }
        return dp[sum];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int sum = sc.nextInt();
        System.out.println(coin3(arr, sum));
    }
}
