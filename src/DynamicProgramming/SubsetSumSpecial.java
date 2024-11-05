package DynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class SubsetSumSpecial {
    public static void subsetSumSpecial(int [] arr, int sum){
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
        for(int i=0; i<=sum;i++){
            if(dp[i]){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        int sum = 0;
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        subsetSumSpecial(arr, sum);
    }
}
