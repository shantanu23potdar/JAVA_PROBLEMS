import java.util.Scanner;
public class Greeting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String username;

        System.out.println("Enter your Name :");
        username = input.nextLine();

        System.out.println("Hello " +username+ " ,have a good day!");
    }
}
