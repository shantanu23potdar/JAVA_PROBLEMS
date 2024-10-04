import java.util.Scanner;

public class Int_or_Not {
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner input = new Scanner(System.in);
        if (input.hasNextInt()) {
            System.out.println("The number is an integer");
        } else {
            System.out.println("The number is not an integer");
        }
    }
}