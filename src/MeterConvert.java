import java.util.Scanner;
public class MeterConvert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a distance in meters: ");
        double meters = scanner.nextDouble();
        double miles = meters * 0.000621371;
        double feet = meters * 3.28084;
        double inches = meters * 39.37008;
        System.out.printf("%.2f meters is equal to:\n", meters);
        System.out.printf("%.2f miles\n", miles);
        System.out.printf("%.2f feet\n", feet);
        System.out.printf("%.2f inches\n", inches);
    }
}
