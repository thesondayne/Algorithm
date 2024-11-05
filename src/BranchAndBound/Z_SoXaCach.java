/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BranchAndBound;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Z_SoXaCach {

    static int n;
    static int X[] = new int[100];
    static boolean used[] = new boolean[100];

    static void Try(int i) {
        for (int j = 1; j <= n; j++) {
            if (Math.abs(j - X[i - 1]) != 1 && !used[j]) {
                X[i] = j;
                used[j] = true;
                if (i == n) {
                    for (int l = 1; l <= n; l++) {
                        System.out.print(X[l]);
                    }
                    System.out.println("");
                } else {
                    Try(i + 1);
                }
                used[j] = false;
            }

        }
    }

    public static void main(String[] args) {
        X[0] = -1;
        n = new Scanner(System.in).nextInt();
        Try(1);
    }
}
