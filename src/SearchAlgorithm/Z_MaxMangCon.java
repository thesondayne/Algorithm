/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SearchAlgorithm;

/**
 *
 * @author Dell
 */
public class Z_MaxMangCon {
    // Cho một mảng và một số n. Chia thành n mảng con liên tiếp
    // Sao cho mảng con có giá trị lớn nhất là tối thiểu

    public static boolean check(int a[], int h, int target) {
        int cnt = 0;
        int tmp = 0;
        for (int i = 0; i < a.length; i++) {
            if (tmp + a[i] > h) {
                cnt++;
                tmp = a[i];
            } else {
                tmp += a[i];
            }
        }
        cnt++;
        if (cnt > target) {
            return false;
        }
        return true;
    }

    public static int binarySearch(int a[], int target) {
        int result = 0;
        int left = 0;// phần tử lớn nhất
        int right = 100;// tổng của tất cả các phần tử 
        while (left <= right) {
            int mid = (left + right) / 2;
            if (check(a, mid, target)) {
                right = mid - 1;
                result = mid;
            } else {
                left = mid + 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int target = 3;
        int[] a = new int[]{2, 4, 7, 3, 5};
        System.out.println(binarySearch(a, target));
    }

}
