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
public class Z_TapConTangDan {

    static ArrayList<ArrayList<Integer>> list = new ArrayList<>();
    static ArrayList<Integer> a;
    static int n;
    static int c[] = new int[100];
    static int X[] = new int[100];

    static void Try(int i, int begin) {
        for (int j = begin; j <= n; j++) {
            if (c[j] > X[i - 1]) {
                X[i] = c[j];
                if (i >= 2) {
                    a = new ArrayList<>();
                    for (int l = 1; l <= i; l++) {
                        a.add(X[l]);
                    }
                    list.add(a);
                    Try(i + 1, j + 1);
                } else {
                    Try(i + 1, j + 1);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            c[i] = sc.nextInt();
        }
        Try(1, 1);
        for (ArrayList x : list) {
            System.out.println(x);
        }
    }
}
