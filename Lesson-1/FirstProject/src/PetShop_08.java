import java.util.Scanner;

public class PetShop_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dogs = Integer.parseInt(scanner.nextLine());
        int cats = Integer.parseInt(scanner.nextLine());

        double result = (dogs * 2.50) + (cats * 4);

        System.out.printf("%f lv.", result);

    }
}