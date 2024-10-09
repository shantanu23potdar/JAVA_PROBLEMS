import java.util.Scanner;
public class percentage {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your 5 Subjects marks: ");
        System.out.println("Enter 1st subject: ");
        int s1=input.nextInt();
        System.out.println("Enter 2st subject: ");
        int s2=input.nextInt();
        System.out.println("Enter 3st subject: ");
        int s3=input.nextInt();
        System.out.println("Enter 4st subject: ");
        int s4=input.nextInt();
        System.out.println("Enter 5st subject: ");
        int s5=input.nextInt();
        int total_m = s1 + s2 + s3 + s4 + s5 ;
        int percentage_m = total_m*100/500;
        System.out.println("Your total marks: " +total_m);
        System.out.println("Your percentage : " +percentage_m );
    }
}
