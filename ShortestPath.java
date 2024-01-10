import java.util.*;

public class ShortestPath{   //TC - O(n)

    public static float getShortestPath(String path){
        
        int x = 0;
        int y = 0;

        for(int i=0; i<path.length(); i++){
            char dir = path.charAt(i);

            //south
            if(dir == 'S'){
                y--;
            }
            //North
            else if(dir == 'N'){
                y++;
            }
            //west
            else if(dir == 'W'){
                x--;
            }
            else{
                x++;
            }
        }
        int xSquare = x*x;
        int ySquare = y*y;

        return (float) Math.sqrt(xSquare + ySquare);  //return shortest path 

    }
    public static void main(String args[]){

        String path = "WNEENESENNN";

        System.out.println(getShortestPath(path));
    }
}