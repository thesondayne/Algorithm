package Greedy;

import java.util.Scanner;

public class Z_DoiChoMang {
    public static boolean check(int arr[]){
        for(int i=0; i<arr.length; i++){
            if(arr[i]!=arr.length-i) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        while(k>0){
            if(check(arr)) break;
            for(int i=0; i<n; i++){
                if(arr[i]!=arr.length-i){
                    for(int j=i+1; j<n; j++){
                        if(arr[j]==arr.length-i){
                            int tmp = arr[i];
                            arr[i] = arr[j];
                            arr[j] = tmp;
                            break;
                        }
                    }
                    break;
                }
            }
            k--;
        }
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
