package shape;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = {new Circle(2), new Triangle(3, 4), new Square(5)};

        double totalArea = 0;
        for (Shape shape : shapes) {
            totalArea += shape.getArea();
        }

        System.out.println("Total area of all shapes: " + totalArea);
    }

}
