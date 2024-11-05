package SortAlgorithm;

public class QuickSort_Hoare {
    private static int partition(int[] arr, int l, int r) {
        int i = l - 1;
        int j = r + 1;
        int pivot = arr[l];
        while(true){
            do{
                ++i;

            }while(arr[i] < pivot);
            do{
                --j;
            }while(arr[j] > pivot);
            if(i < j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            return j;
        }
    }
    private static void sort(int[] arr, int l, int r) {
        if(l < r) {
            int p = partition(arr, l, r);
            sort(arr, l, p);
            sort(arr, p + 1, r);
        }
    }
}
