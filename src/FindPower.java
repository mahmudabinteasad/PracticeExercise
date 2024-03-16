import java.util.*;
public class FindPower {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a value: ");
        int value = scanner.nextInt();
        double square = (value * value);
        double cube = (value * value * value);
        double fourth = (Math.pow(value, 4));
        System.out.printf("Square: %8.2f \n", square);
        System.out.printf("Cube: %8.2f \n", cube);
        System.out.printf("Fourth: %8.2f \n", fourth);
    }
}
