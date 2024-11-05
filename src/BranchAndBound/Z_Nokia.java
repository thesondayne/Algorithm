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
public class Z_Nokia {
    // Mỗi phím có 3 chữ cái
    static int n;
    static int p[] = new int[100];
    static int X[] = new int[100];

    static void Try(int i, int k) {
        for (int j = p[k] * 3 - 3; j <= p[k] * 3 - 1; j++) {
            X[i] = j;
            if (i == n) {
                for (int l = 1; l <= n; l++) {
                    System.out.print((char) (X[l] + 'a'));
                }
                System.out.println();
            } else {
                Try(i + 1, k + 1);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            p[i] = sc.nextInt();
            p[i]--; // Giam tu phim 2 ve 1 cho dung
        }
        Try(1, 1);
    }
}
