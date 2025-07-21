public class cwh_logical {
  
    public static void main(String[] args) {
        boolean a = true;
        boolean b = true;
        boolean c = true;
        System.out.println("logical operation AND:");
        // && retuen true if all conditions are true 
        if(a && b && c){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
        System.out.println("logical operator OR:");
        boolean a1 = true;
        boolean b1= true;
        if(a1 || b1){
            System.out.println("yes");

        }else {
            System.out.println("no");
        }
        System.out.println("logical oprator !:");
        System.out.println("not (a) is");
        System.out.println(!a);
        System.out.println("not (b) is");
        System.out.println(!b);

}
}
