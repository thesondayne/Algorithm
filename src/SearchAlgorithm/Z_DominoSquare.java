/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SearchAlgorithm;

/**
 *
 * @author Dell
 */
public class Z_DominoSquare {
    // Cho n thanh domino kích thức a x b. Xếp chúng sao cho thành một hình vuông
    // Cạnh của hình vuông là nhỏ nhất
    public static boolean check(int n, int length, int width, int target) {
        if ((target / length) * (target / width) >= n) {
            return true;
        }
        return false;
    }

    public static int binarySearch(int n, int length, int width) {
        int result = 0;
        int left = 0;
        int right = 100;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (check(n, length, width, mid)) {
                right = mid - 1;
                result = mid;
            } else {
                left = mid + 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int length = 3;
        int width = 2;
        int n = 12;
        System.out.println(binarySearch(n, length, width));
    }

}
