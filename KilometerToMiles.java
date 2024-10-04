import java.util.Scanner;
public class KilometerToMiles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Kilometer: ");
        double n1 = input.nextDouble();

        double miles = n1 * 0.6213711922 ;
        System.out.println("Your km covert into miles: " +miles+ "mi");
    }
}
