import javax.lang.model.element.TypeElement;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class test {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
       ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        System.out.println(list);
        //initialisation
       for(int i = 0 ; i<3 ; i++){
           list.add(new ArrayList<>());
       }
        System.out.println(list);
       for(int j= 0;j<3 ;j++){
           for (int k = 0; k <3 ; k++) {
               list.get(j).add(in.nextInt());

           }
       }
        System.out.println(list);

    }
}
