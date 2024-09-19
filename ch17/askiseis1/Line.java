package gr.aueb.cf.ch17.askiseis1;

import java.io.Serializable;
import java.util.Objects;

public class Line extends AbstractShape implements Serializable, Cloneable {

    private double length;
    private static final long serialUID = 2L;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Line line = (Line) o;
        return Double.compare(length, line.length) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(length);
    }

    //Copy Constructor
    public Line (Line line) {
        this.length = line.length;
    }


}
