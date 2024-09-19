package gr.aueb.cf.ch15;

public class Point {
    private double x;

    public Point() {
    }

    public Point(double x) {
        this.x = x;
    }

    //setters, getters & toString
    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }
    public String convertToString() {
        return "(" + x +")";
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                '}';
    }

    //    @Override
//    public String toString() {
//        return super.toString();
//    }

    //μετακινεί το χ κατά 10
    public void movePlus10() {
        x +=10;
    }

    //protected για να μπορούν να κληρονομηθούν
    protected void movePlusOne() {
        x += 1;
    }

    protected void printTypeOf() {
        System.out.println(this.getClass().getSimpleName());
    }

    public void reset() {
        x = 0;
    }

    public double getDistanceFromOrigin() {
        double distanceX = Math.abs(this.x) - 0.0;
        return distanceX;
    }
}
