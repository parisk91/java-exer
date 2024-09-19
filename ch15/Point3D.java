package gr.aueb.cf.ch15;

public class Point3D extends Point2D {
    private double z;

    public Point3D() {
//        super();
//        z = 0.0;
    }

    public Point3D(double x, double y, double z) {
        //constructor chaining
        super(x, y);
        this.z = z;
    }

    //για x και y κληρονομούνται αυτόματα, δεν γράγω κάτι
    public double getZ() {
        return z;
    }
    public void setZ(double z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return super.toString() + "{" +
                "z=" + z +
                '}';
    }

    @Override
    public void movePlus10() {
        super.movePlus10();
        z += 10;
    }

    @Override
    protected void movePlusOne() {
        super.movePlusOne();
        z += 1;
    }

    @Override
    public String convertToString() {
        return super.convertToString() + "(" + getZ() + ")";
    }

    @Override
    public double getDistanceFromOrigin() {
        double distanceZ = Math.abs(z) - 0;
        double distanceXYZ = Math.sqrt(Math.pow(super.getDistanceFromOrigin(), 2) + Math.pow(distanceZ, 2));
        return distanceXYZ;
    }
}
