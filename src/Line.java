public class Line {

    private Point startPoint;
    private Point endPoint;

    public Line(Point startPoint, Point endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    public Point getStartPoint() {
        return startPoint;
    }

    public Point getEndPoint() {
        return endPoint;
    }

    public double getLenght() {
        //sqrt((x1-x2)(x1-x2)+(y1-y2)(y1-y2))
        double x1 = this.startPoint.getX();
        double y1 = this.startPoint.getY();
        double x2 = this.endPoint.getX();
        double y2 = this.endPoint.getY();

        return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    }
}
