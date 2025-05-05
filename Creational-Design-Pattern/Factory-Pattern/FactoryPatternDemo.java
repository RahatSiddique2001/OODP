public class FactoryPatternDemo {
    
    public static void main(String[] args) {
        
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape circle_1 = shapeFactory.getShape("Circle");
        circle_1.draw();

        Shape rect_1 = shapeFactory.getShape("Rectangle");
        rect_1.draw();
    }
}
