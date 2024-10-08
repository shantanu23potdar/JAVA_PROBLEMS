public class Fibonacci_series {
    static void fibonacci(int n){
        //case 1
        //base case
//        if (n <= 1){
//            return n;
//        }else {
        //recursive call
//            return fibonacci(n - 1) + fibonacci(n - 2);
//        }

        //case 2 without  recursion
        int n1 = 0 , n2 = 1;
        //loop
        for (int i = 0;i < n;i++){
            System.out.print(n1 + " ");
            //swap
            int n3 = n2 + n1;
            n2 = n1;
            n1 = n3;
        }
    }
    public static void main(String[] args) {
        int n = 8;
        //case 1//System.out.println((fibonacci(n));
        //by using case 1 series print by help of loop of case 2

        fibonacci(n);
    }
}
