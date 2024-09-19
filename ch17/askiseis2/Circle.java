package gr.aueb.cf.ch17.askiseis2;

import java.io.Serializable;
import java.util.Objects;

public class Circle extends AbstractShape implements ICircle, Serializable, Cloneable {

    private double radius;
    private static final long serialUID = 3L;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getDiameter() {
        return 2 * radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(getRadius(), circle.getRadius()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getRadius());
    }

    //Copy Constructor
    public Circle (gr.aueb.cf.ch17.askiseis1.Circle radius) {
        this.radius = getRadius();
    }
}
