public class cwh_35_ps_07_methods {
    static void multiplication(int n){
        for(int i=1;i<=10;i++){
            System.out.format("%d X %d = %d\n",i,n,i*n);
        }
    }
    static void pattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    } 
    static void pattern2(int a){
        for(int i=a;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    } 
    static int sumRec(int x){
        if (x==1){
            return 1;
        }
        return x + sumRec(x-1);
    }
    static int fib(int n){
        if(n==0){
            return 0;
       }else if (n==1){
        return 1;
       }else
        return fib(n-1)+fib(n-2);
    }
     static void pattern_recurrsion(int n){
        if(n>0){
            pattern_recurrsion(n-1);
            for(int i=0;i<n;i++){
                System.out.print("*");
            }
            System.out.println();
        }
    } 
    public static void main(String[] args) {
        /* 
            // problem 01
            int n =5;
        multiplication(n);
            int a=9;
            // problem 02
        pattern(a);
            int b=4;
            // problem 03
        pattern2(b);
        int c = sumRec(5);
        System.out.println(c);
        // problem 04 
        int result =fib(2);
        System.out.println(result);
        */
        pattern_recurrsion(4);
           
    }  
}
