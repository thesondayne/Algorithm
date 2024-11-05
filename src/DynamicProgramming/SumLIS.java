package DynamicProgramming;

import java.util.Scanner;

public class SumLIS {
    public static int sumLIS(int [] arr){
        int [] dp = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            dp[i]=arr[i];
        }
        for(int i=1;i<arr.length;i++){
            for(int j=0;j<i;j++){
                if(arr[j]<arr[i]){
                    dp[i] = Math.max(dp[i],arr[i] + dp[j]);
                }
            }
        }int max = 1;
        for(int i=0;i<arr.length;i++){
            max = Math.max(max,dp[i]);
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(sumLIS(arr));
    }
}
