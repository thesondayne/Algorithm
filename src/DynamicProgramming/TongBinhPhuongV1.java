package DynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class TongBinhPhuongV1 {
    public static int TongBinhPhuongV1(int [] arr, int n, int sum){
        int [] dp = new int [sum+1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for(int i=0; i<n; i++){
            for(int j=arr[i]; j<=sum; j++){
                if(dp[j-arr[i]] != Integer.MAX_VALUE){
                    dp[j] = Math.min(dp[j], dp[j-arr[i]] + 1) ;
                }
            }
        }
        return dp[sum] == Integer.MAX_VALUE ? -1 : dp[sum];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int length = (int)Math.floor(Math.sqrt(n)) + 1;
        int [] arr = new int[length];
        for(int i=0; i<length; i++){
            arr[i] = (int)Math.pow(i,2);
        }
        System.out.println(TongBinhPhuongV1(arr, length, n));
    }
}
