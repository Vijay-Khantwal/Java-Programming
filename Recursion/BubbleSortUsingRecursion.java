package Recursion;

import java.util.Arrays;

public class BubbleSortUsingRecursion {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        bubble(arr,arr.length-1,0);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] arr,int r, int c) {
        if(r==0){
            return;
        }
        if(c<r){
            if(arr[c] > arr[c+1]){
                swap(arr,c);
            }
            bubble(arr,r,c+1);
        }
        else{
            bubble(arr,r-1,0);
        }
    }

    static void swap(int[] arr,int i) {
        int temp = arr[i];
        arr[i] = arr[i+1];
        arr[i+1] = temp;
    }

}
