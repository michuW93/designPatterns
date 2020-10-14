package FactoryMethod.Shape;

public class ShapeFactory {
    public Shape getShape(String type){
        if (type.equals("Circle")){
            return new Circle();
        }
        else if(type.equals("Square")){
            return new Square();
        }
        return null;
    }
}
