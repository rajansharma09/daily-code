import java.util.Scanner;

public class cwh_18_elseif {
    public static void main(String[] args) {
        char var = 'r';
        switch (var) {
            case 'r':
                System.out.println("you are become adult");
                break;
            case 'c':
                System.out.println("you are getting a job ");    
            case 'e':
                System.out.println("you are getting retired!");
            default:
                System.out.println("enjon your life");
                break;
        }
        System.out.println("learn java very well");
   /*  
     int age ;
        System.out.println("enter your age");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
   if(age >56){
        System.out.println("you are experiens");
    }else if(age > 46){
        System.out.println("you are semi-experiens");
    } else{
        System.out.println("you are not experienced");
    }
        */
}
}
