/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SortAlgorithm;

/**
 *
 * @author Dell
 */
public class MergeSort {

    // Thao tắc trộn
    public static void merge(int a[], int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;
        int[] X = new int[n1];
        int[] Y = new int[n2];
        for (int i = l; i <= m; i++) {
            X[i - l] = a[i];
        }
        for (int i = m + 1; i <= r; i++) {
            Y[i - m - 1] = a[i];
        }
        int i = 0;
        int j = 0;
        int cnt = l; // Nhớ rõ đoạn này
        while (i < n1 && j < n2) {
            if (X[i] < Y[j]) {
                a[cnt++] = X[i++];
            } else {
                a[cnt++] = Y[j++];
            }
        }
        while (i < n1) {
            a[cnt++] = X[i++];
        }
        while (j < n2) {
            a[cnt++] = Y[j++];
        }
    }

    // Sắp xếp trộn độ phúc tạp là O(nlogn)
    public static void mergeSort(int a[], int l, int r) {
        if (l < r) {
            int m = (r + l) / 2;
            mergeSort(a, l, m);
            mergeSort(a, m + 1, r);
            merge(a, l, m, r);
        }
    }
}
