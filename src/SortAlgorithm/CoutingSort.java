/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SortAlgorithm;

import java.util.Arrays;

/**
 *
 * @author Dell
 */
public class CoutingSort {
    static int [] cSort = new int [1000000]; // Dành cho Counting Sort
    public static void countingSort(int a[]){
        Arrays.fill(cSort, 0);
        int max=0;
        int n=a.length;
        for(int i=0; i<n; i++){
            cSort[a[i]]+=1;
            max=Math.max(a[i], max);
        }
        for(int i=0; i<=max; i++){
            if(cSort[i]>0){
                for(int j=0; j<cSort[i]; j++){
                    System.out.print(i);
                }
            }
        }
    }
}
