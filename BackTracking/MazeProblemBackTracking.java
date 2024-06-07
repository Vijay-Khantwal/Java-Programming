package BackTracking;

public class MazeProblemBackTracking {public static void main(String[] args) {
    // Allowed to go down,up,left,right.
    // Can visit any block only once for a single path.
    // true means a clear block
    boolean[][] maze = {
            {true,true,true}
            ,{true,true,true}
            ,{true,true,true}
    };
    Solve("",maze,0,0); // starting position r,c = {0,0}
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

}
