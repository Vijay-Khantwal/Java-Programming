package BackTracking;

public class MazeProblem {
    public static void main(String[] args) {
        // only allowed to move down or right.
        // true means a clear block
        // false means an obstacle (cannot pass through that block)
        boolean[][] maze = {
                 {true,true,true}
                ,{true,false,true}
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

        if(r < maze.length -1){
            Solve(p+"D",maze,r+1,c);
        }
        if(c< maze[0].length-1){
            Solve(p+"R",maze,r,c+1);
        }
    }

}
