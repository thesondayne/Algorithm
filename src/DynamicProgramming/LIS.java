package DynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class LIS {
    public static int LIS(int[] arr) {
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
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(LIS(arr));
    }
    // Có cách N.logN -> Dùng lowerbound
    // Tìm số nhỏ nhất làm kết thúc cho chuỗi có độ dài là i
    // Duyệt từ đầu đến cuối. Nếu lớn hơn tất cả thì cho vào. Nếu không thì thay cho lowerbound
}
