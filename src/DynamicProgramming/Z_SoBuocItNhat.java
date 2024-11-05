package DynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class Z_SoBuocItNhat {
    public static int soBuocItNhat(int[] arr) {
        int n = arr.length;
        int[] a = new int[n];
        Arrays.fill(a, 1);
        int max = 1;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j]) {
                    a[i] = Math.max(a[i], a[j] + 1);
                }
            }
            max = Math.max(max, a[i]);
        }
        return arr.length-max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(soBuocItNhat(arr));
    }
}
