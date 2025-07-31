
class emloyee{
        int id;
        String name;
        public void get_deitails(){
            System.out.println("my id is :"+id);
            System.out.println("my name is :"+name);
        }
    }
    
public class cwh_38_custom_class {
    public static void main(String[] args) {
         emloyee rajan = new emloyee();
         emloyee jhon = new emloyee();
         rajan.id = 12;
         rajan.name = "rajan";
         jhon.id = 82;
         jhon.name = "jhon";
         rajan.get_deitails();
         jhon.get_deitails(); 
    }
}
