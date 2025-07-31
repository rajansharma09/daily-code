class myEmloyee{
       private int id;
       private String name;
       // public myEmloyee(){
       //     id = 45;
       //     name ="enter name";
       // }
        public myEmloyee(String myname , int myId){
            id = myId;
            name =myname;
        }
        public String getName(){
            return name;
        }
         public void setName( String n){
            name =n;
        }
         public int getId(){
            return id;
        }
        public  void setId(int i){
          id = i;
        }
        }
    
public class cwh_42_constructor {
    public static void main(String[] args) {
        myEmloyee emloyee = new myEmloyee("rajan" , 45);
        System.out.println(emloyee.getName());
        System.out.println(emloyee.getId());
    }
    
}
