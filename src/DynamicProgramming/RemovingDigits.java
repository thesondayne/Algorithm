package DynamicProgramming;

import java.util.Scanner;

public class RemovingDigits {
    public static int removingDigits(int n) {
        if(n==0) return 0;
        if(n<10) return 1;
        int [] dp = new int [n+1];
        dp[10] = 2;
        for(int i=11;i<=n;i++){
            String tmp = String.valueOf(i);
            dp[i] = dp[i-(tmp.charAt(0) - '0')] + 1;
            for(int j=1;j<tmp.length();j++){
                dp[i] = Math.min(dp[i],dp[i-(tmp.charAt(j) - '0')] + 1);
            }
        }
        return dp[n];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(removingDigits(n));
    }
}
