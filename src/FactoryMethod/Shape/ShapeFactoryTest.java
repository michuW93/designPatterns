package FactoryMethod.Shape;

public class ShapeFactoryTest {
    public static void main(String[] args){
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape circle = shapeFactory.getShape("Circle");
        circle.draw();

        Shape square = shapeFactory.getShape("Square");
        square.draw();
    }
}
