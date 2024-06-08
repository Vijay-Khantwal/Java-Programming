package BackTracking;

import java.util.Arrays;

public class MazeProblemBackTracking {public static void main(String[] args) {
    // Allowed to go down,up,left,right.
    // Can visit any block only once for a single path.
    // true means a clear block
    boolean[][] maze = {
            {true,true,true}
            ,{true,true,true}
            ,{true,true,true}
    };
//    Solve("",maze,0,0); // starting position r,c = {0,0}
    int[][] path = new int[maze.length][maze[0].length];
    PrintAllPaths("",maze,0,0,path,1);
}
    static void Solve(String p,boolean[][] maze, int r , int c){
        if(r == maze.length-1 && c == maze[0].length -1  ){
            System.out.println(p);
            return;
        }

        if(!maze[r][c]){
            return;
        }
        // I am considering this block in my path.
        maze[r][c] = false;

        if(r < maze.length -1){
            Solve(p+"D",maze,r+1,c);
        }
        if(c< maze[0].length-1){
            Solve(p+"R",maze,r,c+1);
        }
        if(r>0){
            Solve(p+"U",maze,r-1,c);
        }
        if(c>0){
            Solve(p+"L",maze,r,c-1);
        }

        // this line is where the function will be over
        // so before the function gets removed, also remove the changes that were made by that function
        maze[r][c] = true;
    }

    static void PrintAllPaths(String p,boolean[][] maze, int r , int c,int[][] path , int step){
        if(r == maze.length-1 && c == maze[0].length -1  ){
            path[r][c] = step;
            for(int[] arr : path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
//            path[r][c] = 0;  //optional
            return;
        }

        if(!maze[r][c]){
            return;
        }
        // I am considering this block in my path.
        maze[r][c] = false;
        path[r][c] = step;

        step+=1;
        if(r < maze.length -1){
            PrintAllPaths(p+"D",maze,r+1,c,path,step);
        }
        if(c< maze[0].length-1){
            PrintAllPaths(p+"R",maze,r,c+1,path,step);
        }
        if(r>0){
            PrintAllPaths(p+"U",maze,r-1,c,path,step);
        }
        if(c>0){
            PrintAllPaths(p+"L",maze,r,c-1,path,step);
        }

        // this line is where the function will be over
        // so before the function gets removed, also remove the changes that were made by that function
        maze[r][c] = true;
        path[r][c] = 0;
    }

}
