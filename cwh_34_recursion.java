public class cwh_34_recursion {
    /* 
    static int factorial (int a ){
        if (a==0 || a==1){
           return 1;
        }else{
            return a*factorial(a-1);
        }
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println("factorial of n is :" + factorial(n));
        
    }
        */

    // factorial by iteretive function
    
      static int factorial_iteretive(int a ){
        if (a==0 || a==1){
           return 1;
        }else{
           int fac=1;
            for(int i=1;i<a;i++){
                fac *=i;
            }
            return fac;
        }
    }
    public static void main(String[] args) {
        int n = 0;
        System.out.println("factorial of n is :" + factorial_iteretive(n));
        
    }
    
}
