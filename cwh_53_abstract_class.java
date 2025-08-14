abstract class parent{
    parent(){
        System.out.println("i am a constructor of parent class");
    }
    public void sayhello(){
        System.out.println("hello");
    }
    abstract public void greet();
}
class child extends parent{
    public void greet(){
        System.out.println("good morning");
    }
}
abstract class subchild extends parent{
    public void th(){
        System.out.println("hello");
    }
}
public class cwh_53_abstract_class {
    public static void main(String[] args) {
        // parent p = new parent() ; -> error cant be enitait abstract class  
        child c =new child();
        c.greet();
            
    }
}
