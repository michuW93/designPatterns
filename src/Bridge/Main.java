package Bridge;

public class Main {
    public static void main(String[] args) {
        RasterRenderer raster = new RasterRenderer();
        VectorRenderer vector = new VectorRenderer();

        Circle circle = new Circle(vector, 1);
        circle.draw();
        circle.resize(2);
        circle.draw();
    }
}
