package SortingRecursion;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSets {
    public static void main(String[] args) {

        int[] arr = {1,2,2};

        List<List<Integer>> ans = subsetDuplicates(arr);
        for(List<Integer> list : ans){
            System.out.println(list);

        }
    }

    static List<List<Integer>> subset(int[] arr){

        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        for (int num : arr) {
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer> inner = new ArrayList<>(outer.get(i)); // this constructor call is same
//                as inner.addAll(outer.get(i));
                inner.add(num);
                outer.add(inner);
            }
        }
        return outer;
    }

    static List<List<Integer>> subsetDuplicates(int[] arr){
        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        for (int j = 0; j<arr.length; j++) {
            int start = 0;
            int n = outer.size();
            if(j>0 && arr[j] == arr[j-1]){
                start = n/2 ;
            }
            for (int i = start; i < n; i++) {
                List<Integer> inner = new ArrayList<>(outer.get(i)); // this constructor call is same
//                as inner.addAll(outer.get(i));
                inner.add(arr[j]);
                outer.add(inner);
            }
        }
        return outer;
    }
}
