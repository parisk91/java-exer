package gr.aueb.cf.ch15;

public class Point2D extends Point {
    private double y;  //έχει πρόσβαση στο x μέσω των setters και getters που κληρονομεί

    /**
     * default constructor,
     * τα δίνει αυτόματα το jvm
     */
    public Point2D() {
//        super();
//        y = 0.0;
    }

    /**
     * υπερφορτωμένος constructor
     * o super(x) καλεί τον υπερφορτωμένο constructor
     * αν ο x ήταν protected θα μπορούσαμε να κάνουμε this.x = x
     * @param y η παράμετρος για το y
     */
    public Point2D(double x, double y) {
        super(x);
        this.y = y;
    }

    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }

    /**
     * overrides και προσθέτει και το y
     * @return super.convertToString + αυτό που θέλω
     */
//    @Override
//    public String convertToString() {
//        return super.convertToString() + "(" + y + ")";
//    }

    @Override
    public String toString() {
        return super.toString() + "{" +
                "y=" + y +
                '}';
    }

    //    @Override
//    public String toString() {
//        return super.toString() + "(" + y + ")";
//    }

    @Override
    public void movePlus10() {
        super.movePlus10();
        y += 10;
    }

    @Override
    protected void movePlusOne() {
        super.movePlusOne();
        y += 1;
    }

    @Override
    public double getDistanceFromOrigin() {
        double distanceY = Math.abs(y) - 0;
        double distanceXY =  Math.sqrt(Math.pow(super.getDistanceFromOrigin(), 2) + Math.pow(distanceY, 2));
        return distanceXY;
    }
}
