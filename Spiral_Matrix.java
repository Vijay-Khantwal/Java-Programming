
import java.util.ArrayList;
import java.util.Scanner;
public class Spiral_Matrix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of rows and columns");
        int r = in.nextInt()  ;
        int c = in.nextInt() ;
        System.out.println("Enter the elements");
        int[][] arr = new int[r][c];
        for(int i =0 ;i<r;i++){
            for(int j = 0 ; j<c ;j++){
                arr[i][j] = in.nextInt();
            }
        }
        System.out.println("You entered");

        for(int i =0 ;i<r;i++){
            for(int j = 0 ; j<c ;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        spiralOrder(arr);
    }

    static void spiralOrder(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;

//        System.out.println(r+" "+c) ;
        ArrayList<Integer> spiral = new ArrayList(r*c);

        //Main;

        int rowStart = 0;   int rowEnd = r -1  ; int colStart = 0; int colEnd = c-1 ;


       while(true){

           spiral = add(spiral, to_right(matrix, rowStart, colStart, colEnd));
           if(spiral.size() == r*c){
               break;
           }
           spiral = add(spiral, to_bottom(matrix, colEnd, rowStart + 1, rowEnd));
           if(spiral.size() == r*c){
               break;
           }
           spiral = add(spiral, to_left(matrix, rowEnd, colEnd - 1, colStart));
           if(spiral.size() == r*c){
               break;
           }
           spiral = add(spiral, to_top(matrix, colStart, rowEnd - 1, rowStart + 1));
           if(spiral.size() == r*c){
               break;
           }

            rowStart++;
            rowEnd--;
            colStart++;
            colEnd--;
        }

        //PRINT OUTPUT
        System.out.println("Spiral Result:");
        System.out.println(spiral);
    }
    static int[] to_right(int[][] matrix , int row,int colStart , int colEnd){
        if(colStart > colEnd){
            return new int[] {} ;
        }
        int[] result = new int[colEnd - colStart +1] ;

            for(int i = colStart,j=0 ; i<=colEnd ;i++,j++){
                result[j] = matrix[row][i] ;
            }


        return result;
    }
    static int[] to_bottom(int[][] matrix , int col,int rowStart,int rowEnd){
        if(rowStart > rowEnd ){
            return new int[] {} ;
        }
        int[] result = new int[rowEnd - rowStart + 1] ;

            for(int i = rowStart,j=0 ; i<=rowEnd ;i++,j++){
                result[j] = matrix[i][col] ;
            }


        return result;
    }
    static int[] to_left(int[][] matrix ,int row,int colStart , int colEnd){
        if(colStart < colEnd){
            return new int[] {} ;
        }
        int[] result = new int[colStart - colEnd + 1] ;

            for(int i = colStart,j=0 ; i>=colEnd ;i--,j++){
                result[j] = matrix[row][i] ;
            }


        return result;
    }
    static int[] to_top(int[][] matrix ,int col, int rowStart, int rowEnd){
        if(rowStart < rowEnd){
            return new int[] {} ;
        }
        int[] result = new int[rowStart - rowEnd + 1] ;

            for(int i = rowStart ,j =0 ; i>=rowEnd ;i--,j++){
                result[j] = matrix[i][col] ;
            }


        return result;
    }

    static ArrayList<Integer> add (ArrayList<Integer> spiral ,int[] arr){
        for(int i = 0 ; i<arr.length ; i++){
            spiral.add(arr[i]);
        }
        return spiral ;
    }
}

