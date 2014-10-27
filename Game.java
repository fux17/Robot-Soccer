package RegularClass.soccerRobot;


/**
 * Write a description of class Game here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Game
{
    
    public static String [][] field = new String [10][10];
    public static Robot r;
    public static Robot t;
    public static Ball ball;
    public static void main (String [] args){
        
        r = new Robot ();  
        r.Pos.xLocation = 3;
        r.Pos.yLocation = 4;
        r.Pos.direction = 1;
        
        
        //System.out.println("I am here");
        //System.out.println("rpos " + r.Pos.xLocation + " " + r.Pos.yLocation);
        //field [r.Pos.xLocation][r.Pos.yLocation] = "R";
         
        t = new Robot ();
        t.Pos.xLocation = 2;
        t.Pos.yLocation = 6;
        t.Pos.direction = 3;
        
        //System.out.println("tposition " + t.Pos.xLocation + " " + t.Pos.yLocation);
        //field [t.Pos.xLocation][t.Pos.yLocation] = "T";
        ball = new Ball ();
        ball.Pos.xLocation = 2;
        ball.Pos.yLocation = 5;
        ball.Pos.direction = 2;
                
        board();
        
        //System.out.println("ballpos "+ball.ballPos.xLocation + " " + ball.ballPos.yLocation);
        
        ball.moveBall();
        r.moveRobot();
        t.moveRobot();
        board();
    }
    public static void board(){
        for(int i = 0; i< 10; i++){ //sets all the items inside the array to space
            for (int j=0; j<10; j++){
                field [i][j] = " ";
            }
        }        
        field [r.Pos.xLocation][r.Pos.yLocation] = "R";
        //System.out.println("In board r xposition " + r.Pos.xLocation);
        //System.out.println("In board r yposition " + r.Pos.yLocation);
        
        field [t.Pos.xLocation][t.Pos.yLocation] = "T";    
        //System.out.println("field T " + field[t.Pos.xLocation][t.Pos.yLocation]);
        //System.out.println("In board t xposition " + t.Pos.xLocation);
        //System.out.println("In board t yposition " + t.Pos.yLocation);
        //System.out.println("field R " + field[r.Pos.xLocation][r.Pos.yLocation]);
        field [ball.Pos.xLocation][ball.Pos.yLocation] = "B";
        System.out.println(" ");
        for(int y = 0; y < 10; y++){//setting values by every row, so y goes first
            for(int i=0; i<41; i++){
                System.out.print("-");
            }
            System.out.println(" ");
            for(int x=0; x<10; x++){
                System.out.print("| " + field[x][y]+" ") ;
            }
            System.out.println("|");
        }
        for(int i=0; i<41; i++){
            System.out.print("-");
        }
        System.out.println();
        System.out.println();
    }
}
