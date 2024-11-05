package Greedy;

import java.util.Arrays;
import java.util.Scanner;

public class Z_MaxProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] X = new int[n];
        for (int i = 0; i < n; i++) {
            X[i] = sc.nextInt();
        }
        sc.close();
        Arrays.sort(X);
        int x1 = X[0]*X[1];
        int x2 = X[n-1]*X[n-2];
        System.out.println(Math.max(Math.max(x1*X[n-1], x1*X[2]), Math.max(x2*X[n-3], x2*X[0])));
    }
}
