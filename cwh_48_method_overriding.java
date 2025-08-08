class A{
    public int rajan(){
        return 2;
    }
    public void meth2(){
        System.out.println("i am a method 2 of class A");
    }
}
class B extends A{
    @Override
    public void meth2(){
        System.out.println("i am a method 2 of class B");
    }
    public void meth3(){
         System.out.println("i am a method 3 of class B");
    }
}
public class cwh_48_method_overriding {
    public static void main(String[] args) {
        A a = new A();
      a.meth2();
        B b = new B();
        b.meth2();

    }
}