package gr.aueb.cf.ch17.askiseis2;

public interface ICircle extends IShape, ITwoDimensional {

    public double getDiameter();

    @Override
    long getId();

    @Override
    double getArea();

    @Override
    double getCircumference();
}
