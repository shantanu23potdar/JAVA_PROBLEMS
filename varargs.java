public class varargs {
    static int sum(int x,int ...arr){     ///x value gets compasory

        int result = x;
        for(int a: arr){
            result += a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("result of 4 and 5 =" + sum(4,5,1));
    }
}
