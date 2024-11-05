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
public class Z_SinhChuoiHoaThuong {

    static String s;
    static char c[] = new char[100];
    static int n;
    static char X[] = new char[100];

    static void xuly() {
        s = s.toLowerCase();
        int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))) {
                cnt++;
                c[cnt] = s.charAt(i);
            }
        }
        n = cnt;
    }
    static ArrayList<ArrayList<Character>> list = new ArrayList<>();
    static ArrayList<Character> con;

    static void Try(int i, int begin) {
        for (int j = 0; j <= 1; j++) {
            if (j == 0) {
                X[i] = c[begin];
            } else {
                X[i] = Character.toUpperCase(c[begin]);
            }
            if (i == n) {
                con = new ArrayList<>();
                for (int l = 1; l <= n; l++) {
                    con.add(X[l]);
                }
                list.add(con);
            } else {
                Try(i + 1, begin + 1);
            }
        }
    }

    static void in(ArrayList<Character> a) {
        String kq = "";
        int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))) {
                kq += a.get(cnt);
                cnt++;
            } else {
                kq += s.charAt(i);
            }
        }
        System.out.println(kq);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();
        xuly();
        Try(1, 1);
        for (ArrayList<Character> a : list) {
            in(a);
        }
    }
}
