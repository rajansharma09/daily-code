import java.util.Scanner;

public class cwh_19_ps4 {
    public static void main(String[] args) {
      // problem 01
      /*   int age = 11;
        if ( age = 11){ // here is the error = is assignment operator not relatoinal 
            System.out.println("you are 11");
        }
      */
      // problem 03
       /*  Scanner sc = new Scanner(System.in );
        System.out.println("Enter marks of maths : ");
        byte m1;
        m1 = sc.nextByte();
        System.out.println("Enter marks of physics :" );
        byte m2;
        m2 = sc.nextByte();
        System.out.println("Enter marks of chemistry");
        byte m3;
        m3 = sc.nextByte();    
        float avg = (m1+m2+m3)/3.0f;
        if(avg > 40 && m1>33 && m2>33 && m3>33){
            System.out.println("congrates you are promoted");
            System.out.println("your percntage is :"+avg);
        }else {
            System.out.println("you are not promoted");
        }
         */
         
         // problem 03
   
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your income (in lakhs): ");
        float income = sc.nextFloat();
        float tax = 0.0f;

        if (income <= 2.5f) {
            tax = 0.0f;
        } else if (income <= 5.0f) {
            tax = 0.05f * (income - 2.5f);
        } else if (income <= 10.0f) {
            tax = 0.05f * (5.0f - 2.5f);        // 5%
            tax += 0.2f * (income - 5.0f);      // 20%
        } else {
            tax = 0.05f * (5.0f - 2.5f);        // 5%
            tax += 0.2f * (10.0f - 5.0f);       // 20%
            tax += 0.3f * (income - 10.0f);     // 30%
        }

        System.out.println("The total tax is: " + tax + " lakh(s)");
        sc.close();
    }
}

    