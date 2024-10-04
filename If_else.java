import java.util.*;
public class If_else {
    public static void main(String[] args) {
        //
        //if else
//        System.out.println("Enter your age: ");
//        int age = scanner.nextInt();
//
//        if(age > 18) {
//            System.out.println("aAdualt");
//        }else {
//            System.out.println("not adualt");
//        }

//        System.out.println("Enter your NUmber to check the even number or odd number: ");
//        int num = scanner.nextInt();
//
//        if(num%2 == 0){
//            System.out.println("even");
//        }else {
//            System.out.println("odd");
//        }

//        System.out.println("Enter two Numbers: ");
//        System.out.println("enter 1st no.: ");
//        int num1 = scanner.nextInt();
//        System.out.println("enter 2st no.: ");
//        int num2 = scanner.nextInt();

//        if (num1 == num2 ){
//            System.out.println("Number equals");
//        } else {
//            if (num1 >num2 ) {
//            System.out.println( num1+ " Greater then " +num2);
//        } else {
//                System.out.println(num1+ " lesser then " +num2);
//            }
//        }

     //if  else if
//        if (num1 == num2 ){
//            System.out.println("Number equals");
//        } else if (num1 >num2 ) {
//                System.out.println( num1+ " Greater then " +num2);
//            } else {
//                System.out.println(num1+ " lesser then " +num2);
//            }


      //to much if else if else
//        System.out.println("Enter Button no. 1 - 3 : ");
//        int Button = scanner.nextInt();

//        if(Button == 1) {
//            System.out.println("hello");
//        } else if (Button == 2) {
//            System.out.println("namaste");
//        } else if (Button == 3) {
//            System.out.println("bojour");
//        } else {
//            System.out.println("invaid no.");
//        }


        //switch
//        System.out.println("Enter Button no. 1 - 3 : ");
//        int Button = scanner.nextInt();
//
//        switch (Button) {
//            case 1 :
//                System.out.println("hello");
//                break;
//            case 2 :
//                System.out.println("namaste");
//                break;
//            case 3:
//                System.out.println("bonjour");
//                break;
//            default:
//                System.out.println(" invaild button");
//        }


//      months
//        System.out.println("Enter month no. : ");
//        int Month = scanner.nextInt();
//
//        switch (Month) {
//            case 1 :
//                System.out.println("jan");
//                break;
//            case 2 :
//                System.out.println("feb");
//                break;
//            case 3:
//                System.out.println("march");
//                break;
//            case 4:
//                System.out.println("ap");
//                break;
//            case 5:
//                System.out.println("may");
//                break;
//            case 6:
//                System.out.println("jun");
//                break;
//            case 7:
//                System.out.println("july");
//                break;
//            case 8:
//                System.out.println("aug");
//                break;
//            case 9:
//                System.out.println("sep");
//                break;
//
//            default:
//                System.out.println(" invaild month");
//        }



                char operator;
                double number1, number2, result;

                // create an object of Scanner class
                Scanner input = new Scanner(System.in);

                // ask users to enter operator
                System.out.println("Choose an operator: +, -, *, or /");
                operator = input.next().charAt(0);

                // ask users to enter numbers
                System.out.println("Enter first number");
                number1 = input.nextDouble();

                System.out.println("Enter second number");
                number2 = input.nextDouble();

                switch (operator) {

                    // performs addition between numbers
                    case '+':
                        result = number1 + number2;
                        System.out.println(number1 + " + " + number2 + " = " + result);
                        break;

                    // performs subtraction between numbers
                    case '-':
                        result = number1 - number2;
                        System.out.println(number1 + " - " + number2 + " = " + result);
                        break;

                    // performs multiplication between numbers
                    case '*':
                        result = number1 * number2;
                        System.out.println(number1 + " * " + number2 + " = " + result);
                        break;

                    // performs division between numbers
                    case '/':
                        result = number1 / number2;
                        System.out.println(number1 + " / " + number2 + " = " + result);
                        break;

                    default:
                        System.out.println("Invalid operator!");
                        break;
                }

                //input.close();




    }
}
