package gr.aueb.cf.ch17.askiseis2;

import java.io.Serializable;
import java.util.Objects;

public class Rectangle extends AbstractShape implements IRectangle, Serializable, Cloneable {

    private double width;
    private double height;
    private static final long serialUID = 1L;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public void setId(long id) {
        super.setId(id);
    }

    @Override
    public long getId() {
        return super.getId();
    }

    @Override
    public double getArea() {
        return height * width;
    }

    @Override
    public double getCircumference() {
        return 2 * height + 2 * width;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(getWidth(), rectangle.getWidth()) == 0 && Double.compare(getHeight(), rectangle.getHeight()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getWidth(), getHeight());
    }

    //Copy Constructor
    public Rectangle (Rectangle rectangle) {
        this.height = getHeight();
        this.width = getWidth();
    }
}
