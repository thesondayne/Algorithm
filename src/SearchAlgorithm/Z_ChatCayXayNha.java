/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SearchAlgorithm;

/**
 *
 * @author Dell
 */
public class Z_ChatCayXayNha {

    public static boolean check(int a[], int h, int target) {
        int cnt = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] - h > 0) {
                cnt += (a[i] - h);
            }
        }
        if (cnt >= target) {
            return true;
        }
        return false;
    }

    public static int binarySearch(int a[], int target) {
        int result = 0;
        int left = 0;
        int right = 100;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (check(a, mid, target)) {
                left = mid + 1;
                result = mid;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int target = 3;
        int[] a = new int[]{10, 16, 17, 15};
        System.out.println(binarySearch(a, target));
    }

}
