package gr.aueb.cf.ch12.askisi1;

/**
 * JavaBean that declares the fields x, y, z FOR A 3D point
 * and inputs the setters, getters, constructors and toString method
 */
public class PointXYZ {
    private int x;
    private int y;
    private int z;

    /**
     * Initializes the int x,y,z at 0
     */
    public PointXYZ() {
    }

    /**
     * Overloaded constructor. Initializes at a
     * new (x,y,z) coordinate
     *
     * @param x     the x coordinate
     * @param y     the y coordinate
     * @param z     the z coordinate
     */
    public PointXYZ(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    //Setters and Getters for x, y, z coordinates
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

    public int getZ() {
        return z;
    }
    public void setZ(int z) {
        this.z = z;
    }

    /**
     * Returns the full state of the point
     *
     * @return the String (x, y, z)
     */
    public String convertToString() {
        return "PointXYZ{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
