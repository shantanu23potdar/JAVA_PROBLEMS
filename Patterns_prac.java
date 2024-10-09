public class Patterns_prac {
    public static void main(String[] args) {
       // multiple(5);

       // pattern1(5);

        pattern2(4);
    }

    //problem 1
//    static void multiple(int n) {
//        for (int i = 1;i<=10;i++){
//            System.out.format("%d X %d = %d\n", n ,i , n*i);
//        }
//    }


    //problem 2
//    static void pattern1 (int n){
//      for (int i = 1;i<=n;i++){
//          for (int j = 1;j<=i;j++){
//              System.out.print("* ");
//          }
//          System.out.println();
//      }
//    }
//            *
//            **
//            ***
//            ****
//            *****

    //problem 3
//    static void pattern2 (int n){
//        for (int i = 1;i<=n;i++){
//            for (int j = i;j<=n;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }
//        * * * *
//        * * *
//        * *
//        *

//    static void pattern2 (int n){
//        for (int i = 1;i<=n;i++){
//            for (int j = i;j<=n;j++){
//                System.out.print("  ");
//            }
//            for (int j = 1;j <= i;j++){
//                System.out.print("* ");
//            }
//
//            System.out.println();
//        }
//    }
//                    *
//                   * *
//                 * * *
//               * * * *


//    static void pattern2 (int n){
//        for (int i = 1;i<=n;i++){
//            for (int j = 1;j<=i;j++){
//                System.out.print("  ");
//            }
//            for (int j = i;j <= n;j++){
//                System.out.print("* ");
//            }
//
//            System.out.println();
//        }
//    }
//            * * * *
//              * * *
//                * *
//                  *


//        static void pattern2 (int n){
//        for (int i = 1;i<=n;i++){
//            for (int j = i;j<=n;j++){
//                System.out.print("  ");
//            }
//            for (int j = 1;j < i;j++){
//                System.out.print("* ");
//            }
//            for (int j = 1;j <= i;j++){
//                System.out.print("* ");
//            }
//
//            System.out.println();
//        }
//
//    }
//                          *
//                        * * *
//                      * * * * *
//                    * * * * * * *

//    static void pattern2 (int n){
//        for (int i = 1;i<=n;i++){
//            for (int j = 1;j<=i;j++){
//                System.out.print("  ");
//            }
//            for (int j = i;j < n;j++){
//                System.out.print("* ");
//            }
//            for (int j = i;j <= n;j++){
//                System.out.print("* ");
//            }
//
//            System.out.println();
//        }
//
//    }
//         * * * * * * *
//           * * * * *
//             * * *
//               *

//            static void pattern2 (int n){
//        for (int i = 1;i<n;i++){
//            for (int j = i;j<=n;j++){
//                System.out.print("  ");
//            }
//            for (int j = 1;j < i;j++){
//                System.out.print("* ");
//            }
//            for (int j = 1;j <= i;j++){
//                System.out.print("* ");
//            }
//
//            System.out.println();
//        }
//                for (int i = 1;i<=n;i++){
//                    for (int j = 1;j<=i;j++){
//                        System.out.print("  ");
//                    }
//                    for (int j = i;j < n;j++){
//                        System.out.print("* ");
//                    }
//                    for (int j = i;j <= n;j++){
//                        System.out.print("* ");
//                    }
//
//                    System.out.println();
//                }
//
//    }
//                          *
//                        * * *
//                      * * * * *
//                    * * * * * * *
//                      * * * * *
//                       * * *
//                         *


//static void pattern2 (int n){
//for (int i = 1;i<=n;i++) {
//    for (int j = i; j <= n; j++) {
//        System.out.print("* ");
//    }
//    System.out.println();
//        }
//    }

//    static void pattern2 (int n){
//        if (n > 0) {
//            pattern2(n-1);
//            for (int i = 0; i < n; i++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }
//        *
//        * *
//        * * *
//        * * * *


    static void pattern2 (int n){
        if (n > 0) {
            pattern2(n-1);
            for(int i = 1;i<=n;i++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}









