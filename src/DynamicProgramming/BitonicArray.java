package DynamicProgramming;

import java.util.Scanner;

public class BitonicArray {
    public static int bitonicArray(int [] arr){
        int [] inc = new int[arr.length];
        int [] dec = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            inc[i]=arr[i];
            dec[i]=arr[i];
        }
        for(int i=1;i<arr.length;i++){
            for(int j=0;j<i;j++){
                if(arr[j]<arr[i]){
                    inc[i] = Math.max(inc[i],arr[i] + inc[j]);
                }
            }
        }
        for(int i=arr.length-2;i>=0;i--){
            for(int j=arr.length-1;j>i;j--){
                if(arr[j]<arr[i]){
                    dec[i] = Math.max(dec[i],arr[i] + dec[j]);
                }
            }
        }
        int max = 0;
        for(int i=0;i<arr.length;i++){
            max = Math.max(max,inc[i] + dec[i] - arr[i]);
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
        System.out.println(bitonicArray(arr));
    }
}
