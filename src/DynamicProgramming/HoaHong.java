package DynamicProgramming;

import java.util.Scanner;

public class HoaHong {
    public static int HoaHong(int[] arr, int n) {
    int[] start = new int[n];
    int[] end = new int[n];
    end[0] = 1;
    start[n - 1] = 1;
    int max = end[0];
    for (int i = 1; i < n; i++) {
        if (arr[i] > arr[i - 1]) {
            end[i] = end[i - 1] + 1;
        } else {
            end[i] = 1;
        }
        if (max < end[i]) {
            max = end[i];
        }
    }
    for (int i = n - 2; i >= 0; i--) {
        if (arr[i] >= arr[i + 1]) {
            start[i] = 1;
        } else {
            start[i] = start[i + 1] + 1;
        }
    }
    int[] result = new int[n];
    for (int i = 1; i <= n - 2; i++) {
        if (arr[i + 1] > arr[i - 1]) {
            result[i] = end[i - 1] + start[i + 1];
        }
        if (result[i] > max) {
            max = result[i];
        }
    }
    return max;
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(HoaHong(arr, n));
    }

}
