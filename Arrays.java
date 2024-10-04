public class Arrays {
    public static void main(String[] args) {

//        reverse
//        int[] marks = {45,65,23,87,43};
////        System.out.println(marks.length);
//
//        for (int i = marks.length - 1; i>=0;i--) {
//            System.out.println(marks[i]);
//        }

        //1
//        float sum = 0;
//        float [] marks = {40.0f,50.5f,70.5f,90.5f};
//
//          for(float element: marks){
//            sum += element;
//        }
//        System.out.println(sum);

//2
//        int[] marks = {45,65,23,87,43};
//        int num= 95;
//        boolean isInArray = false;
//        for (int element : marks){
//            if(num == element){
//                isInArray = true;
//                break;
//            }
//        }
//        if (isInArray){
//            System.out.println("present");
//        }
//            else{
//            System.out.println("not present");
//
//        }


        //4
//        int sum = 0;
//        int avg = 0;
//        int [] marks = {40,50,70,90};
//
//          for(int element: marks){
//              sum += element;
//        }
//        System.out.println(sum);
//
//          avg = (sum / marks.length);
//
//        System.out.println(avg);


//5
//        int [][] mat1 = {{1,2,3},
//                          {4,5,6}};
//        int [][] mat2 = {{2,6,13},
//                          {3,7,1}};
//        int [][] result = {{0,0,0},
//                            {0,0,0}};
//
//        for(int i = 0;i < mat1.length;i++){
//            for(int j = 0;j < mat1[i].length;j++){
//               System.out.print(result[i][j] + " ");
//                result[i][j] = mat1[i][j] + mat2[i][j];
//  //              System.out.print(result[i][j] + " ");
//            }
//            System.out.println(" ");
//        }

//6 explainnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn
//        int [] arr = {3,2,0,6,5};
//        int l = arr.length;
//
//       int n = Math.floorDiv(l , 2);
//        int temp;
//
//       //swap
//       // a[i]  & a[l-i-1]
//        for (int i=0;i < n;i++) {
//            temp = arr[i];
//            arr[i] = arr[l - i - 1];
//            arr[l - i - 1] = temp;
//        }
//        for (int element: arr){
//            System.out.println(element + " ");
//        }


        //7 mAX MIN
//        int [] arr = {3,2,13,24,5};
//        int min = Integer.MAX_VALUE; //0
//        for (int e: arr){
//            if(e<min){
//                min = e;
//            }
//        }
//        System.out.println(min);

        //8
        boolean isSorted = true;
//        int [] arr = {3,2,13,24,5};
        int [] arr = {3,20,34,45,57};
        for(int i = 0 ;i < arr.length-1;i++){
            if (arr[i] >arr[i+1]) {
                isSorted = false;
                break;
            }
        }
        if (isSorted){
            System.out.println("sort");
        }else {
            System.out.println("NOT sort");
        }



        }



    }

