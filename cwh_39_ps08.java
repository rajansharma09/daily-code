class Employee {
    int salary;
    String name;
    public int getsalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
}
class cellphone{
public void ring(){
    System.out.println("ringing....");
}
public void vibrate(){
    System.out.println("viabrating....");
}
public void call(){
    System.out.println("calling....");
}
}
class square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}
class tommyvecity{
    public void hitt(){
        System.out.println("hitting the enemy");
    }
    public void run(){
        System.out.println("run from the enemy");
    }
    public void fire(){
        System.out.println("fire on the enemy");
    }

}
public class cwh_39_ps08 {
        // problem 01
        
        public static void main(String[] args) {
        /*
        Employee rajan = new Employee();
        rajan.setName("rajan");
        rajan.salary = 2300;
        System.out.println(rajan.getName());
        System.out.println(rajan.getsalary());
        
        // problem 02
        cellphone vivo = new cellphone();
        vivo.call();
        vivo.vibrate();
        vivo.ring();
        */
        // problem 03
        /* 
    square sc = new square();
    sc.side = 3;
    System.out.println(sc.area());
    System.out.println(sc.perimeter());
    */
    tommyvecity player = new tommyvecity();
    player.hitt();
    player.run();
    player.fire();
}
}
