package Strings;

import java.util.ArrayList;

public class StringPermutations {
    public static void main(String[] args) {
        String str = "abc" ;
        ArrayList<String> ans = permutations("",str);
        System.out.println(ans);

    }

    private static ArrayList<String> permutations(String p, String up) {
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        for(int i = 0; i<=p.length();i++){
            String left = p.substring(0,i);
            char ch = up.charAt(0) ;
            String right = p.substring(i);
            ans.addAll(permutations(left+ch+right,up.substring(1)));

        }

        return ans;
    }

}
