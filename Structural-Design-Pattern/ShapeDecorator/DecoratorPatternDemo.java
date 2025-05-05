
public class DecoratorPatternDemo {

    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape redCircle = new RedShapeDecorator(new Circle());


        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\n\nCircle with red Border");
        redCircle.draw();
    }
}