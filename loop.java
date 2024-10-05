import java.util.*;
public class loop {
    public static void main(String[] args) {
        //for loop
//        for (int i = 0; i<11 ; i++) {
//            System.out.print(i+ " ");
//        }

        //while loop
//        int i = 0;
//        while (i < 11){
//            System.out.println(i);
//            i++; //i = i + 1;
//        }


//        //do while
//        int i = 0;
//        do {
//            System.out.println(i);
//            i = i + 1;
//        }  while (i<11);

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Number: ");
        //        int n =sc.nextInt();

//            int sum = 0;
//            for (int i = 1; i <= n ;i++){
//                sum =sum +i;
//            }
//        System.out.println("Sum of %n: "+sum);

//int n = 7 ;
//        for (int i = n; i >= 0; i--){
//            System.out.println(i);
//        }
//        }
//    }

//odd
//        int n = 10;
//        for (int i = 0; i < n; i++) {
//            System.out.println(2 * i + 1);
//        }

        int n = 10;
        System.out.println("First n natural numbers are: ");
        for(int i=0; i<n; i++){
            System.out.println(i);
        }
        System.out.println("The reverse order is: ");
        for(int i=n-1; i>=0; i--){
            System.out.println(i);
        }
  }
}