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
public class Z_TapConLe {

    static int n;
    static int c[] = new int[100];
    static int X[] = new int[100];
    static boolean used[] = new boolean[100];

    static void Try(int i, int sum, int bd) {
        for (int j = bd; j <= n; j++) {
            if (!used[j]) {
                X[i] = c[j];
                used[j] = true;
                sum += c[j];
                if (sum % 2 != 0) {
                    for (int l = 1; l <= i; l++) {
                        System.out.print(X[l] + " ");
                    }
                    System.out.println();
                    Try(i + 1, sum, j + 1);

                } else {
                    Try(i + 1, sum, j + 1);
                }
                used[j] = false;
                sum -= c[j];
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            c[i] = sc.nextInt();
        }
        Try(1, 0, 1);
    }
}
