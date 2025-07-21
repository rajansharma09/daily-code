public class cwh_32_method_overloading {
    static void change (int a){
        a = 89;
    }
    static void change2 ( int [] b){
        b [0]= 90;
    }
    static void foo(){ // we cant given perameter here 
        System.out.println("hello good morning bro");
    }
    static void foo (String r){ // here we havee geven perameter
        System.out.println("hello good morning " + r + " bro");
    }
     //static String foo (String r){ // method overloding can't be perforem by changing the return type of methods
     //   System.out.println("hello good morning " + r + " bro");
     //   return r;
     // }

    /* 
    static void telljok(){
        System.out.println("hi i am jok");
    }
    public static void main(String[] args) {
        telljok();
    }
    */    
    // changing an integer 
     public static void main(String[] args) {
    
    //  int x = 45;
    //  change(x);   
    //  System.out.println(x);

    // changing an array

    //int [] arr = {96,69,53,67,43,};
    //    change2(arr);
    //    System.out.println(arr[0]);
        foo(); // here has no argument
        foo("rajan"); // here have an argument
        // one more thig arguments are actule
    } 
}