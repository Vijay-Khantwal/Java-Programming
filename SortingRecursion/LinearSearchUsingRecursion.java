package SortingRecursion;

import java.util.ArrayList;
import java.util.Arrays;

public class LinearSearchUsingRecursion {
    public static void main(String[] args) {
        int[] arr = {2,3,1,4,4,5}; // Input Here!
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> ans = findAllIndex(arr,4, 0,list);
        System.out.println(ans);
    }

    private static ArrayList<Integer> findAllIndex(int[] arr, int target, int index,ArrayList<Integer> list) {
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }

        return findAllIndex(arr,target,index+1, list);

    }
}
