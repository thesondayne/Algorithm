package Greedy;

import java.util.Scanner;

public class Z_ChiaKeo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        if(n==1){
            System.out.println("1");
        }
        else{
            int [] a = new int[n];
            int [] b = new int[n];
            a[0]=1;
            b[n-1]=1;
            for(int i = 1; i < n; i++){
                if(arr[i] > arr[i-1]){
                    a[i]=a[i-1]+1;
                }
                else{
                    a[i]=1;
                }
            }
            for(int i=n-2; i >= 0; i--){
                if(arr[i] > arr[i+1]){
                    b[i]=b[i+1]+1;
                }
                else {
                    b[i]=1;
                }
            }
            int cnt=0;
            for(int i=0; i<n; i++){
                cnt+=Math.max(a[i],b[i]);
            }
            System.out.println(cnt);
        }
    }
}
