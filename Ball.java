package RegularClass.soccerRobot;


public class Ball
{   
    public Point Pos = new Point (); 
    public void moveBall(){
        switch(Pos.direction){
            case 1://move up
                Pos.yLocation--;
                break;
            case 2://move right
                Pos.xLocation++;
                break;
            case 3://move down
                Pos.yLocation++;
                break;
            case 4://move left
                Pos.xLocation--;
                break;
        }
    }
}
