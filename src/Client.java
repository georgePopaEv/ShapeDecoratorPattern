public class Client {
    public static void main(String[] args) {
        System.out.println("*** Decorator Chalange Shape ***");

        ShapeInterface circle = new Circle();

        ShapeInterface redCircle = new RedShapeDecorator(new Circle());
        ShapeInterface redRectangle = new RedShapeDecorator(new Rectangle());

        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\n Circle of red border");
        redCircle.draw();

        System.out.println("\n Rectangle of red border");
        redRectangle.draw();



    }
}