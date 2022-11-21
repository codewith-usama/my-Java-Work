/*

Task 3:
Create a class named Robot that will input:
• the x and y coordinates of a Robot and the direction in which he wants to move using
parameterized constructor. (direction could be E,W,N,S)
• Create a method to display the intial position of the robot.
Create another class named Moving Robot inherited from robot
• This class have a function named moveRobot; function will take steps to move as
argument and move robot in that direction.
For example, if initially the direction = N and Y = 2, and user entered the steps=3, so
after movement the updated coordinates are; Y = 5. (Since moving in North will
update the +Y in Quadrant System)
• Create a display method to show the updated X and Y coordinates.


 */

public class Task_03 {
    public static void main(String[] args) {
        MovingRobot m1 = new MovingRobot(2, 7);
        m1.rDisplay();
        m1.setDirection('N');
        m1.moveRobot(3);
        m1.mDisplay();
    }
}

class Robot {
    protected int x;
    protected int y;
    protected char direction;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public char getDirection() {
        return direction;
    }

    public void setDirection(char direction) {
        this.direction = direction;
    }

    Robot(int x, int y) {
        this.x = x;
        this.y = y;
    }
    void rDisplay() {
        System.out.println("Initial Posotion of Robot=> " + x + " " + y);
    }
}

class MovingRobot extends Robot {

    MovingRobot(int x, int y) {
        super(x, y);
    }

    void moveRobot(int steps) {
        switch (direction) {
            case 'E':
                x += steps;
                break;
            case 'W':
                x -= steps;
                break;
            case 'N':
                y += steps;
                break;
            case 'S':
                y -= steps;
                break;
            default:
                System.out.println("Invalid Direction");
        }
    }


    void mDisplay() {
        System.out.println("Updted Position=> " + x + " " + y);
    }

}