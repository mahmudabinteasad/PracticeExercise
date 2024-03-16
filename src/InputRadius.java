import java.util.Scanner;
public class InputRadius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a radius: ");
        double radius = scanner.nextDouble();
        double area = 3.14 * Math.pow(radius, 2);
        double circumference = 2 * 3.14 * radius;
        double volume = (4.0 / 3.0) * 3.14 * Math.pow(radius, 3);
        double surfacearea = 4 * 3.14 * Math.pow(radius, 2);
        // double inches = meters * 39.37008;
        System.out.printf("Circle:\n");
        System.out.printf("Area: %.2f \n", area);
        System.out.printf("Circumference: %.2f \n", circumference);
        System.out.printf("\nSphere:\n");
        System.out.printf("Volume: %.2f \n", volume);
        System.out.printf("Surface Area: %.2f \n", surfacearea);
    }
}