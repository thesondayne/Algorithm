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
public class Z_TachTapCon {
    // Chia tap con bang k tap bang nhau. K cho san
    static int n;
    static int k;
    static int c[] = new int[100];
    static boolean used[] = new boolean[100];
    static int X[] = new int[100];
    static int tmp;
    static boolean check = false;

    public static void Try(int i, int sum) {
        for (int j = 1; j <= n; j++) {
            if (!used[j] && sum - c[j] >= 0) {
                X[i] = c[j];
                used[j] = true;
                sum -= c[j];
                if (i == n) {
                    if (sum == 0) {
                        check = true;
                    }
                } else {
                    if (sum == 0) {
                        Try(i + 1, tmp);
                    } else {
                        Try(i + 1, sum);
                    }
                }
                sum += c[j];
                used[j] = false;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            c[i] = sc.nextInt();
            sum += c[i];
        }
        if (sum % k != 0) {
            System.out.println("No");
        } else {
            tmp = sum / k;
            Try(1, tmp);
            if (check) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }

    }
}
