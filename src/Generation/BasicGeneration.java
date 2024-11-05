/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Generation;

import java.util.Arrays;

/**
 *
 * @author Dell
 */
public class BasicGeneration {

    static int cnt;
    static int n; // phải dùng static
    static int k; // phải dùng static
    static int[] a = new int[100]; // phải dùng static
    static boolean check = false;

    //--------------------------------------------------------------------------
    //Sinh ra sâu nhị phân
    public static void khoitaoSauNhiPhan() {
        for (int i = 1; i <= n; i++) {
            a[i] = 0;
        }
    }

    public static void sinhSauNhiPhan() {
        int i = n;
        while (i > 0 && a[i] == 1) {
            a[i] = 0;
            i--;
        }
        if (i == 0) {
            check = true;
        } else {
            a[i] = 1;
        }
    }

    //--------------------------------------------------------------------------
    //Sinh ra tổ hợp theo thứ tự tăng dần
    //Muốn sinh ra theo thứ tự giảm dần thì có thể lưu chỉ số rồi in ngược lại
    public static void khoitaoToHop() {
        for (int i = 1; i <= k; i++) {
            a[i] = i;
        }
    }

    public static void sinhToHop() {
        int i = k;
        while (i >= 1 && a[i] == n - k + i) {
            i--;
        }
        if (i == 0) {
            check = true;
        } else {
            a[i]++;
            for (int j = i + 1; j <= k; j++) {
                a[j] = a[j - 1] + 1;
            }
        }
    }

    //--------------------------------------------------------------------------
    //Sinh hoán vị
    public static void khoitaoHoanVi() {
        for (int i = 1; i <= n; i++) {
            a[i] = i;
        }
    }

    public static void sinhHoanVi() {
        int i = n - 1;
        while (i >= 1 && a[i] > a[i + 1]) {
            i--;
        }
        if (i == 0) {
            check = true;
        } else {
            int j = n;
            while (a[i] > a[j]) {
                j--;
            }
            int tmp = a[i];
            a[i] = a[j];
            a[j] = tmp;
            Arrays.sort(a, i + 1, n + 1);
        }
    }

    //--------------------------------------------------------------------------

    public static void main(String[] args) {
        n=5;
        khoitaoHoanVi();
        while(!check){
            for(int i=1; i<=n; i++){
                System.out.print(a[i]);
            }
            System.out.println();
            sinhHoanVi();
        }
    }
}
