public class cwh_24_breack_continue {
    public static void main(String[] args) {
    /*   for (int i=0;i<5;i++){
         System.out.println(i);
         System.out.println("rajan");
        
        if(i==2){
            System.out.println("ending the loop");
            break;
        }
        }
         System.out.println("loop ends here");
*/

/*   int i = 0;
     while(i<5){
        System.out.println(i);
        System.out.println("rajan");
        i++;
        if(i==3){
        System.out.println("ending the loop");
        break;
        }
    }
        */
        //continue statment
        for (int i=0;i<5;i++){
        if(i==2){
           
           continue;
        }
        System.out.println(i);
        System.out.println("rajan");
        
    }
}
}
