package DivideAndConquer;

import java.util.Scanner;

public class Z_MaxMangConLienTiep {
    public static int max(int [] arr){
        int n = arr.length;
        if(n == 1) return arr[0];
        int [] arrLeft = new int [n/2];
        for(int i = 0; i < n/2; i++){
            arrLeft[i] = arr[i];
        }
        int [] arrRight = new int [n-n/2];
        for(int i = 0; i < n-n/2; i++){
            arrRight[i] = arr[i+n/2];
        }
        int maxLeft = max(arrLeft);
        int maxRight = max(arrRight);
        int a = Integer.MIN_VALUE, b = Integer.MIN_VALUE;
        int cntA = 0, cntB = 0;
        for(int i = n/2-1; i >=0; i--){
            cntA+=arr[i];
            a = Math.max(a, cntA);
        }
        for(int i = n/2; i < n; i++){
            cntB+=arr[i];
            b = Math.max(b, cntB);
        }
        int maxMid;
        if(a>=0 && b>=0){
            maxMid=a+b;
        }
        else if(a>=0) maxMid = a;
        else if(b>=0) maxMid=b;
        else maxMid = Math.max(a, b);
        return Math.max(Math.max(maxLeft, maxRight), maxMid);
    }
    public static int maxSubArray(int[] arr) {
        int maxSoFar = arr[0];  // Giá trị lớn nhất tìm được
        int maxEndingHere = arr[0];  // Giá trị lớn nhất đến vị trí hiện tại

        for (int i = 1; i < arr.length; i++) {
            // Cập nhật giá trị maxEndingHere: hoặc giữ phần tử hiện tại hoặc tiếp tục cộng với dãy con trước
            maxEndingHere = Math.max(arr[i], maxEndingHere + arr[i]);

            // Cập nhật giá trị maxSoFar nếu maxEndingHere lớn hơn
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }

        return maxSoFar;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(max(arr));
        System.out.println(maxSubArray(arr));
    }
}
