public class RectangleComputation {
    public static void main(String[] args) {
        double width = Double.parseDouble(args[0]);
        double height = Double.parseDouble(args[1]);

        double area = height * width;
        double perimeter = 2 * (width + height);

        System.out.println("Shape: rectangle");
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);

    }
}