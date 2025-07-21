public class cwh_27_array_length {
    public static void main(String[] args) {
        // length of array
        /* 
        int [] marks = {10,20,30,40,50};
        System.out.println(marks.length);
        System.out.println(marks[1]);

        float [] number = {10,20,30,40,50,60};
        System.out.println(number.length);
        System.out.println(number[3]);

        String [] name  = {"rajan","raju","raj","rohan","rahul"};
        System.out.println(name.length);
        System.out.println(name[3]);
        */

        // display the array

        /* 
        System.out.println("array display using for loop");
        int [] row = {10,38,29,39,83,73,83};
        for(int i=0;i<=row.length;i++){
            System.out.println(row[i]);
        }
         */   

        // display in revrse order

        /* 
        int [] col = {29,93,40,94,73,34};
        for(int i=col.length-1;i>=0;i--){
            System.out.println(col[i]);
        }
        */
        
        // DISPLAY ARRAY USING (FOR - EACH LOOP)

        int [] marks = {70,79,78,89,96};
        for(int element:marks){
            System.out.println(element);
        }
    }
    
}
