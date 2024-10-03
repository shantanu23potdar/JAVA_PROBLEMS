import java.util.Scanner;
public class Add_Three_number {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your 3 Number for addition: ");
        System.out.println("Enter 1st Number: ");
        int n1=input.nextInt();
        System.out.println("Enter 2st Number: ");
        int n2=input.nextInt();
        System.out.println("Enter 3st Number: ");
        int n3=input.nextInt();

        int sum = n1 + n2 + n3 ;

        System.out.println("Your Sum: " +sum);
    }
}
