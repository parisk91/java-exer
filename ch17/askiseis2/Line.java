package gr.aueb.cf.ch17.askiseis2;

import java.io.Serializable;
import java.util.Objects;

public class Line extends AbstractShape implements ILine, Serializable, Cloneable {

    private double length;
    private static final long serialUID = 2L;

    public Line(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Line line = (Line) o;
        return Double.compare(getLength(), line.getLength()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLength());
    }

    //Copy constructor
    public Line (Line line) {
        this.length = getLength();
    }
}
