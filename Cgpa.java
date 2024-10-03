import java.util.Scanner;
public class Cgpa {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your 3 marks of subjects: ");
        System.out.println("Enter 1st marks: ");
        int s1=input.nextInt();
        System.out.println("Enter 2st marks: ");
        int s2=input.nextInt();
        System.out.println("Enter 3st marks: ");
        int s3=input.nextInt();

        int sum = s1 + s2 + s3 ;
        int percentage = sum*100/300;

        System.out.println("Your percentage: " +percentage);

        double cgpa_m = percentage / 9.5 ;

        System.out.println("your cgpa: " + cgpa_m);

    }
}
