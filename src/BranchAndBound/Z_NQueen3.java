/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BranchAndBound;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Z_NQueen3 {

    static ArrayList<ArrayList<Integer>> list = new ArrayList<>();
    static ArrayList<Integer> a;
    static int n;
    static int X[] = new int[100];
    static boolean xuoi[] = new boolean[100];
    static boolean nguoc[] = new boolean[100];
    static boolean cot[] = new boolean[100];

    public static void Try(int i) {
        for (int j = 1; j <= n; j++) {
            if (!xuoi[n + i - j] && !nguoc[i + j - 1] && !cot[j]) {
                X[i] = j;
                xuoi[n + i - j] = true;
                nguoc[i + j - 1] = true;
                cot[j] = true;
                if (i == n) {
                    a = new ArrayList<>();
                    for (int l = 1; l <= n; l++) {
                        a.add(X[l]);
                    }
                    list.add(a);
                } else {
                    Try(i + 1);
                }
                xuoi[n + i - j] = false;
                nguoc[i + j - 1] = false;
                cot[j] = false;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        Try(1);
        for (ArrayList<Integer> i : list) {
            for (int x : i) {
                for (int k = 1; k <= n; k++) {
                    if (k == x) {
                        System.out.print("Q");
                    } else {
                        System.out.print(".");
                    }
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
