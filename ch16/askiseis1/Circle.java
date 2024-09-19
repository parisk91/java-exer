package gr.aueb.cf.ch16.askiseis1;

public class Circle extends AbstractShape implements ITwoDimensional{

    private final double radius;

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
}
