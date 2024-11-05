/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SortAlgorithm;

/**
 *
 * @author Dell
 */
public class BasicSort {
    // Sắp xếp chọn O(n^2)

    public static void selectionSort(int a[]) {
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[minIdx]) {
                    minIdx = j;
                }
            }
            int tmp = a[minIdx];
            a[minIdx] = a[i];
            a[i] = tmp;
        }
    }

    // Sắp xếp nổi bọt O(n^2)
    public static void bubleSort(int a[]) {
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                }
            }
        }
    }

    // Sắp xếp chèn O(n^2)
    public static void insertionSort(int a[]) {
        int n = a.length;
        for (int i = 1; i < n; i++) {
            int tmp = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > tmp) {
                a[j + 1] = a[j];
                j--;
            }
            j++;
            a[j] = tmp;
        }
    }
}
