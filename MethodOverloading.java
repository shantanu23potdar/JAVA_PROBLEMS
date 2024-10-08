public class MethodOverloading {
    //Exaple best
    static void foo(){
        System.out.println("good morning");
    }
    static void foo(int a){
        System.out.println("good morning" + a + "yo !");
    }

    public static void main(String[] args) {
        foo();
        foo(2000);
    }
}
