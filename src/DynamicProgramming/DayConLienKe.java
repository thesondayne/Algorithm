package DynamicProgramming;

import java.util.Scanner;

public class DayConLienKe {
    public static int find(int [] arr){
        int n = arr.length;
        int [] a = new int[n];
        a[0] = 1;
        int max=1;
        for(int i=1;i<n;i++){
            if(arr[i]>arr[i-1]){
                a[i] = a[i-1]+1;
            }
            else {
                a[i] = 1;
            }
            max = Math.max(max,a[i]);
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(find(arr));
    }
}
