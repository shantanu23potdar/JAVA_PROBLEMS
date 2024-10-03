import java.util.Scanner;
public class Greaterthan {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("Enter the number to check then number is greater then or not : ");
        System.out.println("1st Number: ");
        int n1 = input.nextInt();
        System.out.println("2nd Number: ");
        int n2 = input.nextInt();

        if(n1 > n2)
            System.out.println( n1+ " is Greater then " +n2);
        else
            System.out.println( n2+ " is Greater then " +n1);

    }
}
