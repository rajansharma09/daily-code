public class cwh_29_precticeset_06 {
    public static void main(String[] args) {
        // problem 01 sum of floating points int an array
        /* 
        float [] marks = {30.4f,92.3f,83.4f,83.9f,90.0f};
        float sum = 0;
        for(float elemets: marks){
             sum += elemets; 
        }
        System.out.println(sum);
        */

        // problem 02 find the number isInArray
 
        /* 
        float [] marks = {30.4f,92.3f,83.4f,83.9f,90.0f};
        float num = 40.0f;
        boolean isInArray = false;
        for(float elemets: marks){
            if(num==elemets){
               isInArray = true;
               break;
            }
            }
             if(isInArray){
                System.out.println("num is in array");
            }else{
                System.out.println("number is not in an array");
            }
            */

        // problem 03 calculate averagre marks from an array
        /* 
        int [] marks = {50,85,80,40,70};
        int sum = 0;
        for(int elemets:marks){
            sum += elemets;
              
        }
        System.out.println("the average value of marks :"+sum/marks.length);
        */

        // problem 04 add two matrices of size 2x3
        /* 
        int [] [] mat1= {{10,3,8},{4,8,9}};
        int [] [] mat2= {{1,4,5},{2,5,6}};
        int [] [] result= {{0,0,0},{0,0,0}};
        for (int row=0;row<mat1.length;row++){
            for(int col=0;col<mat1[row].length;col++){
                result[row][col] = mat1[row][col]+mat2[row][col];
            }
        }   
         for (int row=0;row<mat1.length;row++){
            for(int col=0;col<mat1[row].length;col++){
                System.out.print(result[row][col]);
                result[row][col] = mat1[row][col]+mat2[row][col]; 
                System.out.print(" "); 
        }
        System.out.println("");
        }
        */

        // problem 05 revrse an array 
        /* 
        int [] arr = {1,2,3,4,5,6};
        int l = arr.length;
        int n = Math.floorDiv(l, 2);
        int temp;
        for(int i=0;i<n;i++){
            temp = arr[i];
            arr[i] = arr[l-1-i]; 
            arr[l-1-i] = temp;
        }
        for(int elemets:arr){
            System.out.print(elemets + "|");
        }
        */

        // problem 06 find the maximum element in an array

        /*
        int [] num = {34,54,654,76433,7366,246704564};
        int max =0;
        for(int element:num){
            if(element>max){
                max = element;
            }
        }
         System.out.println("gretest element of an array is :" + max);
         System.out.println(Integer.MIN_VALUE);
         System.out.println(Integer.MAX_VALUE);\
         */

         // problem 07 array is sorted or not 

         int [] arr = {1,2,3,4,5,6};
         boolean isSorted = true;
         for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                isSorted =false;
            }
        }
        if(isSorted ){
                System.out.println("array is sorted");
            }
            else{
               System.out.println("array is not sorted");
            }
}
}
