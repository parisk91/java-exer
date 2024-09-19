package gr.aueb.cf.ch17.askiseis2;

public interface IRectangle extends IShape, ITwoDimensional {

    @Override
    long getId();

    @Override
    double getArea();

    @Override
    double getCircumference();
}
