package DynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class SubsetSum {
    public static boolean subsetSum(int [] arr, int sum){
        boolean [] dp = new boolean[sum+1];
        Arrays.fill(dp,false);
        dp[0] = true;
        for(int i=0;i<arr.length;i++){
            for(int j=sum;j>=arr[i];j--){
                if(dp[j-arr[i]]){
                    dp[j] = true;
                }
            }
        }
        return dp[sum];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(subsetSum(arr,sum));
    }
}
