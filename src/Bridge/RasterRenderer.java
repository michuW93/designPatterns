package Bridge;

public class RasterRenderer implements Renderer{
    @Override
    public void renderCircle(double radius) {
        System.out.println("Drawning raster circle of radius: " + radius);
    }
}
