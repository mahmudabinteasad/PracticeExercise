import java.util.Scanner;
public class RectangleWork {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length: ");
        double length = scanner.nextDouble();
        System.out.print("Enter width: ");
        double width = scanner.nextDouble();
        double area = length * width;
        double perimeter = 2 * (length + width);
        double diagonal = Math.sqrt(Math.pow(length, 2) + Math.pow(width, 2));
        System.out.printf("Area: %.2f \n", area);
        System.out.printf("Perimeter: %.2f \n", perimeter);
        System.out.printf("Length of Diagonal: %.2f \n", diagonal);
    }
}
