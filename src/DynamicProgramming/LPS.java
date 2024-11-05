package DynamicProgramming;

import java.util.Scanner;

public class LPS {
    public static String LPS(String s) {
        int start = 0;
        int end = 1;
        char[] chars = s.toCharArray();
        int[][] dp = new int[chars.length][chars.length];
        for (int i = 0; i < chars.length; i++) {
            dp[i][i] = 1;
            if (i + 1 < chars.length && chars[i] == chars[i + 1]) {
                dp[i][i + 1] = 1;
                start = i;
                end = i + 2;
            }
        }
        for (int length = 3; length <= chars.length; length++) {
            for (int i = 0; i <= chars.length - length; i++) {
                if (dp[i + 1][i + length - 2] == 1 && chars[i] == chars[i + length - 1]) {
                    dp[i][i + length - 1] = 1;
                    start = i;
                    end = i + length;
                }
            }
        }
        return s.substring(start, end);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(LPS(s));
    }
}
