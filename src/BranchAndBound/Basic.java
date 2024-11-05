/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BranchAndBound;

import java.util.Arrays;

/**
 *
 * @author Dell
 */
public class Basic {

    static int[] X = new int[100];
    static int n;
    static int k;
    static boolean[] used = new boolean[100]; //Dùng cho xét hoán vị ( trước khi dùng phải chuyển tất thành false trong main)
    //--------------------------------------------------------------------------
    //Quay lui nhị phân

    public static void inSauNhiPhan() {
        for (int i = 1; i <= n; i++) {
            System.out.print(X[i]);
        }
    }

    public static void TrySauNhiPhan(int i) {
        for (int j = 0; j <= 1; j++) {
            X[i] = j;
            if (i == n) {
                inSauNhiPhan();
                System.out.println();
            } else {
                TrySauNhiPhan(i + 1);
            }
        }
    }

    //--------------------------------------------------------------------------
    public static void inToHop() {
        for (int i = 1; i <= k; i++) {
            System.out.print(X[i]);
        }
    }

    public static void TryToHop(int i) {
        for (int j = X[i - 1] + 1; j <= n - k + i; j++) {
            X[i] = j;
            if (i == k) {
                inToHop();
                System.out.println();
            } else {
                TryToHop(i + 1);
            }
        }
    }

    //--------------------------------------------------------------------------
    //Quay lui hoán vị
    public static void inHoanVi() {
        for (int i = 1; i <= n; i++) {
            System.out.print(X[i]);
        }
    }

    public static void TryHoanVi(int i) {
        // Các giá trị có thể điền vào một cấu hình
        for (int j = 1; j <= n; j++) {
            // Kiểm tra xem giá trị có thể điền được vào không
            if (!used[j]) {
                // Gán giá trị
                X[i] = j;
                // Thay đổi ghi nhận
                used[j] = true;
                if (i == n) {
                    inHoanVi();
                    System.out.println();
                } else {
                    TryHoanVi(i + 1);
                }
                // Bỏ ghi nhận
                used[j] = false;
            }
        }
    }

    //--------------------------------------------------------------------------
    // Quay lui chỉnh hợp
    public static void TryChinhHop(int i) {
        for (int j = 1; j <= n; j++) {
            if (used[j] == false) {
                X[i] = j;
                used[j] = true;
                if (i == k) {
                    for (int l = 1; l <= k; l++) {
                        System.out.print(X[l]);
                    }
                    System.out.println();
                } else {
                    TryChinhHop(i + 1);
                }
                used[j] = false;
            }
        }
    }

    //--------------------------------------------------------------------------
    public static void main(String[] args) {
        n = 5;
        Arrays.fill(used, false); // Phải dùng ở trong hàm main mới được  
        TryHoanVi(1);
    }
}
