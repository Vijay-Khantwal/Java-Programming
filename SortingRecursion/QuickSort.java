package SortingRecursion;

import java.util.Arrays;

public class QuickSort{
    public static void main(String[] args) {
        int[] arr = {9,5,1,3,4,10,11,12,13};
        quick(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void quick(int[] arr, int low, int high){
        int s = low;
        int e = high;
        int m = s + (e-s)/2;
        int pivot = arr[m];

        if(low >= high){
            return;
        }
        while(s<=e){
            while(arr[s] < pivot){
                s++;
            }
            while(arr[e] > pivot){
                e--;
            }
            if(s<=e){
                //swap
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++; e--;
            }
        }
        quick(arr,low,e);
        quick(arr,s,high);
    }
}