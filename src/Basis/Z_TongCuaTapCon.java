/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Basis;

import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class Z_TongCuaTapCon {

    // Đếm số tập con có tổng bằng n cho trước 
    public static void main(String[] args) {
        int n = 5;
        int[] a = new int[]{1, 4, 2, 3, 7, 4, 1, 5, 3};
        int tmp = 0;
        int cnt = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            arr.add(tmp); // phải cho vào luôn
            tmp += a[i];
            if (arr.contains(tmp - n)) {
                cnt++;
            }
        }
        System.out.println(cnt);

    }
}
