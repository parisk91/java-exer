package gr.aueb.cf.ch17.askiseis1;

import java.io.Serializable;
import java.util.Objects;

public class Rectangle extends AbstractShape implements ITwoDimensional, Serializable, Cloneable {
    private static final long serialUID = 1L;
    private final double width;
    private final double height;

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(width, rectangle.width) == 0 && Double.compare(height, rectangle.height) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, height);
    }

    //Copy Constructor
    public Rectangle (Rectangle rectangle) {
        this.height = rectangle.height;
        this.width = rectangle.width;
    }


}
