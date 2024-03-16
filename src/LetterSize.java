public class LetterSize {
    public static void main(String[] args){
        double width = 8.5 * 25.4;
        double height = 11 * 25.4;
        double perimeter = 2 * (width + height);
        double diagonal = Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
        System.out.printf("Width: %8.2f mm\n", width);
        System.out.printf("Height: %8.2f mm\n", height);
        System.out.printf("Perimeter: %8.2f mm\n", perimeter);
        System.out.printf("Diagonal: %.2f mm\n", diagonal);
    }
}
