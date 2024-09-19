package gr.aueb.cf.ch15;

import static gr.aueb.cf.ch15.PointUtil.distanceFromOrigin;

public class PointApp {

    public static void main(String[] args) {
        Point p = new Point();
        Point2D p2 = new Point2D();
        Point3D p3 = new Point3D();

        doMovePlus10(p);
        doMovePlus10(p2);
        doMovePlus10(p3);

//        doCalculateDistance(p);
//        doCalculateDistance(p2);
//        doCalculateDistance(p3);

        doPrint(p);
        doPrint(p2);
        doPrint(p3);


    }

    //το point μπορεί να είναι p1, p2, p3 - πολυμορφισμός
    public static void doMovePlus10(Point point) {
        point.movePlus10();
    }

    public static void doPrint(Point point) {
        System.out.println(distanceFromOrigin(point));
    }
}
