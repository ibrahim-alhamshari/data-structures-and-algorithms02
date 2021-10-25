package newCodeChallenges;

public class Point {

    private final float x;
    private final float y;

    public Point(int x, int y){
        this.x =x;
        this.y =y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public boolean isIdentical(Point other){
        if(other == null)
            return false;

        if(this.getX()== other.getX() && this.getY()== other.getY()){
            return true;
        }
        return false;
    }
}
