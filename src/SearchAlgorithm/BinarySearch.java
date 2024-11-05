/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SearchAlgorithm;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Dell
 */
public class BinarySearch {
    // Tìm kiếm nhị phân (Binary Search) O(log n)
    // Phải sắp xếp trước khi tìm kiếm

    public static boolean binarySearch(int a[], int x) {
        int n = a.length;
        int left = 0;
        int right = n - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (a[mid] == x) {
                return true;
            } else if (a[mid] > x) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return false;
    }
    //--------------------------------------------------------------------------
    // Tìm vị trị đầu tiên và vị trí cuối cùng trong mảng
    public static int binarySerchIndex(int a[], int x) {
        int n = a.length;
        int left = 0;
        int right = n - 1;
        int res = -1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (a[mid] == x) {
                res = mid;
                right = mid - 1; // để tìm chỉ số đầu tiên
                left = mid + 1; // để tìm chỉ số cuối cùng
            } else if (a[mid] > x) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return res;
    }
    //--------------------------------------------------------------------------
    // Tìm vị trí đầu tiên lớn hoặc bằng một số cho trước
    public static int binarySearchBigger(int a[], int x) {
        int n = a.length;
        int left = 0;
        int right = n - 1;
        int res = -1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (a[mid] >= x) {
                res = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return res;
    }
    //--------------------------------------------------------------------------
    // Tìm vị trí cuối cùng nhỏ hơn hoặc bằng số cho trước
    public static int binarySearchSmaller(int a[], int x) {
        int n = a.length;
        int left = 0;
        int right = n - 1;
        int res = -1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (a[mid] <= x) {
                res = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return res;
    }
    //--------------------------------------------------------------------------
    // Lower_Bound là trả về chỉ số đầu tiên lớn hơn hoặc bằng
    public static int lower_bound(int a[], int x) {
        int res = -1;
        int left = 0;
        int right = a.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (a[mid] >= x) {
                res = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return res;
    }
    //--------------------------------------------------------------------------
    // Upper_Bound trả về chỉ số đầu tiên lớn hơn
    public static int upper_bound(int a[], int x) {
        int res = -1;
        int left = 0;
        int right = a.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (a[mid] <= x) {
                left = mid + 1;
            } else {
                res = mid;
                right = mid - 1;
            }
        }
        return res;
    }
    //--------------------------------------------------------------------------
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a;
        int b;
        Map<Integer, Integer> check = new HashMap<>();
        for (int i = 0; i < n; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            if (check.containsKey(a)) {
                check.put(a, check.get(a) + 1);
            } else {
                check.put(a, 1);
            }
            if (check.containsKey(b)) {
                check.put(b, check.get(b) - 1);
            } else {
                check.put(b, -1);
            }
        }
        int cnt = 0;
        int max = 0;
        Set<Integer> key = check.keySet();
        for (int x : key) {
            cnt += check.get(x);
            if (cnt < 0) {
                cnt = 0;
            }
            if (cnt > max) {
                max = cnt;
            }

        }
        System.out.println(max);
    }
}
