package newCodeChallenges;

import java.text.DecimalFormat;

public class Line {
    private final Point start;
    private final Point end;
    double slope;
    DecimalFormat decimalFormat= new DecimalFormat("#0.0");

    public Line(Point startPoint, Point endPoint) {
        this.start = startPoint;
        this.end = endPoint;
        if(startPoint==null || endPoint==null)
            return;

        if(endPoint.getX() == startPoint.getX()){
           slope=Double.POSITIVE_INFINITY;
        }else
            slope=(end.getY() -start.getY())/(end.getX()-start.getX());
        System.out.println(decimalFormat.format(slope));
    }

    public double getSlope() {
        return slope;
    }

    public boolean isParallel(Line other){
        if(other==null)
            return false;

        return this.slope == other.slope;
    }

    public boolean isPerpendicular(Line other){
        if(other==null)
            return false;
    // you should add code to handle the vertical line.
        return this.slope * other.slope == -1;
    }
}
