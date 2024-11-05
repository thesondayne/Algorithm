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
public class Z_Bank {

    static int n;
    static int target;
    static int X[] = new int[100];
    static int c[] = new int[100];
    static boolean used[] = new boolean[100];
    static int ans = Integer.MAX_VALUE;

    static void Try(int i, int sum) {
        for (int j = 0; j < n; j++) {
            if (sum + c[j] <= target && !used[j]) {
                X[i] = c[j];
                sum += c[j];
                used[j] = true;
                if (sum == target) {
                    ans = Math.min(ans, i);
                } else {
                    Try(i + 1, sum);
                }
                sum -= c[j];
                used[j] = false;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        target = sc.nextInt();
        for (int i = 0; i < n; i++) {
            c[i] = sc.nextInt();
        }
        Try(1, 0);
        System.out.println(ans);
    }
}
