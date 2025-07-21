public class cwh_33_varargs {
    /* 
    // here if we have not any varargs then its all rigth run the code and give 0
    static int sum (int...arr){
        int result =0;
        for(int element:arr){
            result += element;
        }
        return result;
        }
    public static void main(String[] args) {
        System.out.println("sum of 4 and 5 is :" + sum(4 ,5));
        System.out.println("sum of 4 and 5 and 6 is :" + sum(4 ,5,6));
        System.out.println("sum of 4 and 5 and 6 and 7 is :" + sum(4 ,5,6,7));
        }
        */

        // here if we have pass atleast one varargs then
          static int sum (int x,int...arr){
        int result =x;
        for(int element:arr){
            result += element;
        }
        return result;
        }
    public static void main(String[] args) {
        System.out.println("sum of 1 is :" + sum(1));
        System.out.println("sum of 4 and 5 is :" + sum(4 ,5));
        System.out.println("sum of 4 and 5 and 6 is :" + sum(4 ,5,6));
        System.out.println("sum of 4 and 5 and 6 and 7 is :" + sum(4 ,5,6,7));
        }
    
        }
