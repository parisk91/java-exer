package gr.aueb.cf.ch17.askiseis1;

import java.io.Serializable;
import java.util.Objects;

public class Circle extends AbstractShape implements ITwoDimensional, Serializable, Cloneable {

    private final double radius;
    private static final long serialUID = 3L;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void getId() {
        super.getId();
    }

    @Override
    public double getArea() {
        return Math.PI * radius;
    }

    //copy constructor
    public Circle (Circle radius) {
        this.radius = radius.radius;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(radius, circle.radius) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius);
    }
}
