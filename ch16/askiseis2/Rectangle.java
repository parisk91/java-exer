package gr.aueb.cf.ch16.askiseis2;

public class Rectangle extends AbstractShape implements IRectangle{

    private double width;
    private double height;

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
}
