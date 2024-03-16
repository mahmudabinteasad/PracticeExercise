import java.util.Scanner;
public class ProperAlign{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter 1st value: ");
        int first = scanner.nextInt();
        System.out.print("Please enter 2nd value: ");
        int second = scanner.nextInt();
        int sum = (first + second);
        int difference = (first - second);
        int product = (first * second);
        double average = (double)(first + second)/2;
        int distance = Math.abs(difference);;
        int max = Math.max(first, second);
        int min = Math.min(first, second);
        System.out.printf("Summation:   %d \n", sum);
        System.out.printf("Difference:  %d \n", difference);
        System.out.printf("Product:     %d \n", product);
        System.out.printf("Average: %8.2f \n", average);
        System.out.printf("Distance:    %d \n", distance);
        System.out.printf("Maximum:     %d \n", max);
        System.out.printf("Minimum:     %d \n", min);
    }
}
