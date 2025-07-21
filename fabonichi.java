public class fabonichi {
    static void fabonichi(int a){
         int first = 0;
         int second = 1;
       System.out.println("fabonacci is " + a +"is");
        for(int i=0;i<=a;i++){
            int next = first+second;
            System.out.println(first + " ");
            first = second;
            second= next;
        }   
    }
    public static void main(String[] args) {
        int x =9;
        fabonichi(x);
    }
    
}
