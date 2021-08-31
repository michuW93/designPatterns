package Bridge;

public class Circle extends Shape{
    public double radius;

    public Circle(Renderer renderer) {
        super(renderer);
        this.radius = radius;
    }

    public Circle(Renderer renderer, double radius) {
        super(renderer);
        this.radius = radius;
    }

    @Override
    public void draw() {
        renderer.renderCircle(radius);
    }

    @Override
    public void resize(double factor) {
        radius = radius * factor;
    }
}
