public class cwh_28_multidimantion_array {
    public static void main(String[] args) {
        int [] [] flates ;
        flates = new int[2][3];
        flates [0] [0] = 101;
        flates [0] [1] = 102;
        flates [0] [2] = 103;
        flates [1] [0] = 201;
        flates [1] [1] = 202;
        flates [1] [2] = 203;
        // diplay 2-d array by using for loop
        for (int row=0;row<flates.length;row++){
            for(int col=0;col<flates[row].length;col++){
                System.out.print(flates[row][col]);
                System.out.print(" ");
            }
            System.out.println();
        }
      
    }
    
}
