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
public class Z_HourseChess {

    static boolean check = false;
    static int n;
    static int[][] used = new int[100][100];
    static int cnt = 1;
    static int[] I;
    static int[] J;
    static ArrayList<ArrayList<Integer>> a = new ArrayList<>();
    static ArrayList<Integer> b;

    public static void Try(int i, int j) {
        if (cnt == n * n) {
            System.out.println("Yes");
            check = true;
            System.out.println(a.size());
            for (ArrayList x : a) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
        for (int x = 0; x < I.length; x++) {
            if (1 <= i + I[x] && i + I[x] <= n && 1 <= j + J[x] && j + J[x] <= n && used[i + I[x]][j + J[x]] == 0) {
                used[i + I[x]][j + J[x]] = 1;
                b = new ArrayList<>();
                b.add(i + I[x]);
                b.add(j + J[x]);
                a.add(b);
                cnt++;
                Try(i + I[x], j + J[x]);
                used[i + I[x]][j + J[x]] = 0;
                a.remove(a.size() - 1);
                cnt--;
            }
        }

    }

    public static void main(String[] args) {
        I = new int[]{-1, -2, -2, -1, 1, 2, 2, 1};
        J = new int[]{-2, -1, 1, 2, 2, 1, -1, -2};
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int i = sc.nextInt();
        int j = sc.nextInt();
        used[i][j] = 1;
        Try(i, j);
        if (check == false) {
            System.out.println("No");
        }
    }
}
