public class cwh_31_methods {
    static int logic(int x,int y){
        int z;
        if(x<y){
           z = x+y;
        }else{
          z = (x+y)*5;
        }
        return z;
    }
    public static void main(String[] args) {
        //cwh_31_methods  obj = new  cwh_31_methods(); // object creation , method call upon object
        int a = 2;
        int b = 3;
        int c;
        c= logic(a, b);
        int a1 = 5;
        int b1 = 7;
        int c1;
        c1 = logic(a1, b1);
        System.out.println(c);
        System.out.println(c1);
    } 
}
