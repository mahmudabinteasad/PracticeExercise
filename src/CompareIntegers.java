import java.util.Scanner;
public class CompareIntegers {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter 1st value: ");
        int first = scanner.nextInt();
        System.out.print("Please enter 2nd value: ");
        int second = scanner.nextInt();
        double sum = (first + second);
        double difference = (first - second);
        double product = (first * second);
        double average = (first + second)/2;
        double distance = Math.abs(difference);;
        double max = Math.max(first, second);
        double min = Math.min(first, second);
        System.out.printf("Summation: %8.2f \n", sum);
        System.out.printf("Difference: %8.2f \n", difference);
        System.out.printf("Product: %8.2f \n", product);
        System.out.printf("Average: %8.2f \n", average);
        System.out.printf("Distance: %8.2f \n", distance);
        System.out.printf("Maximum: %8.2f \n", max);
        System.out.printf("Minimum: %8.2f \n", min);
    }
}
