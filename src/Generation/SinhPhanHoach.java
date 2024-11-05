/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Generation;

/**
 *
 * @author Dell
 */
public class SinhPhanHoach {

    static int cnt;
    static int n; // phải dùng static
    static int k; // phải dùng static
    static int[] a = new int[100]; // phải dùng static
    static boolean check = false;
    //Sinh phân hoạch

    public static void khoitaoSinhPhanHoach() {
        a[1] = n;
        cnt = 1;
    }

    public static void sinhPhanHoach() {
        int i = cnt;
        while (i >= 1 && a[i] == 1) {
            i--;
            cnt--;
        }
        if (i == 0) {
            check = true;
        } else {
            a[i]--;
            int sum = 0;
            for (int l = 1; l <= i; l++) {
                sum += a[l];
            }
            int tmp = n - sum;
            int q = tmp / a[i];
            int r = tmp % a[i];
            int j = i + 1;
            while (q > 0) {
                a[j] = a[i];
                j++;
                q--;
                cnt++;
            }
            if (r != 0) {
                a[j] = r;
                cnt++;
            }
        }
    }
}
