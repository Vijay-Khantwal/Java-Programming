package Recursion;

import java.util.Arrays;

public class SelectionSortUsingRecursion {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};// Input Here!
        selection(arr,arr.length-1,0,0);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int[] arr,int r, int c,int max) {
        if(r==0){
            return;
        }
        if(c<r){
            if(arr[max] < arr[c+1]){
                max = c+1;
            }
            selection(arr,r,c+1,max);
        }
        else{
            swap(arr,max,r);
            max = 0;
            selection(arr,r-1,0,max);
        }
    }

    static void swap(int[] arr,int i,int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
