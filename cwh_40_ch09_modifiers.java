
    class Employee{
        private String name;
        public String getname(){
           return name;
        }
        public void setName(String n){
         name = n;
        }
    }
    public class cwh_40_ch09_modifiers {
 public static void main(String[] args) {
    Employee rajan = new Employee();
    rajan.setName("rajan");
    System.out.println(rajan.getname());
 }    
    
}
