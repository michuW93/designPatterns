package Bridge;

public class VectorRenderer implements Renderer {

    @Override
    public void renderCircle(double radius) {
        System.out.println("Drawning vector circle of radius: " + radius);
    }
}
