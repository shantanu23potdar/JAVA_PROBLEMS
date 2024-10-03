import java.util.*;
public class Array {
    public static void main(String[] args) {
//        int[] marks = new int[3];
//        int marks[] = {98,22,33};
////        marks[0] = 98;
////        marks[1] = 94;
////        marks[2] = 97;
////        System.out.println(marks[0]);
////        System.out.println(marks[1]);
////        System.out.println(marks[2]);
//
//        for (int i = 0; i<3; i++) {
//            System.out.println(marks[i]);
//        }

        Scanner sc = new Scanner(System.in);
        int size =sc.nextInt();
        int Number[] = new int[size];

        //input
        for (int i = 0 ; i < size ; i++){
            Number[i] = sc.nextInt();
        }

        int x = sc.nextInt();

        //output
        for (int i = 0 ; i < Number.length ; i++){
            if (Number[i] == x){
                System.out.println("x found at index :" +i);
            }
            //System.out.println(Number[i]);
        }


    }
}
