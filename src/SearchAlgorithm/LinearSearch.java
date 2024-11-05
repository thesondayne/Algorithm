/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SearchAlgorithm;

/**
 *
 * @author Dell
 */
public class LinearSearch {
    // Tìm kiếm tuyến tính (Linear Search) O(n)
    public static boolean linearSearch(int a[], int x) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == x) {
                return true;
            }
        }
        return false;
    }
    //--------------------------------------------------------------------------
    public static void main(String[] args) {
        int [] a = new int []{1,2,3,4,5,6};
        boolean check = linearSearch(a,1);
        System.out.println(check);
    }
}
