public class CoffeeDecoratorDemo {
    public static void main(String[] args) {
        Coffee order = new SimpleCoffee();
        System.out.println(order.getDescription() + " $" + order.getCost());

        order = new MilkDecorator(order);
        order = new SugarDecorator(order);
        order = new WhippedCreamDecorator(order);

        System.out.println(order.getDescription() + " $" + order.getCost());
    }
}