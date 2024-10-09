public class Recursion {
    static int factorial(int n){

        if (n == 0 || n == 1){
            return 1;
        }else{
            return n * factorial(n-1);
        }
    }

    static int factorial_iteration(int n){

        if (n == 0 || n == 1){
            return 1;
        }else{
            int product = 1;
            for (int i = 1;i <= n ;i++){
                product *= i;

            }
            return product;
        }
    }


    public static void main(String[] args) {
    int x = 5;
        System.out.format("factorial of %d = %d" ,x, +factorial(x));
        System.out.format("factorial of %d = %d" ,x, +factorial_iteration(x));
    }
}
