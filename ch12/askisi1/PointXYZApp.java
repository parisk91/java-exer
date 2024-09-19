package gr.aueb.cf.ch12.askisi1;

import gr.aueb.cl.ch15.Point;

/**
 * Sets and prints 3D points using PointXYZ JavaBean
 */

public class PointXYZApp {

    public static void main(String[] args) {
        PointXYZ point1 = new PointXYZ(1, 3, 5);
        PointXYZ point2 = new PointXYZ();

        point2.setX(4);
        point2.setY(5);
        point2.setZ(8);

        System.out.println(point1);
        System.out.println(point2.convertToString());
    }




}
