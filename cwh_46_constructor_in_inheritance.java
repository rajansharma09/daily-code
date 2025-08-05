class base{
    int x;
    base(){
        System.out.println("hi i am a constructor");
    }
    base(int a){
        System.out.println("hello i am a overloaded constructor with a value of a as :"+a);
    }
    public int getX(){
        return x;
    }
    public void setX(int x){
        x = x;
    }
}
    class derived extends base{
           int y;
           
        derived(){
            super(9);
            System.out.println("i am a derived constructor");
        }
        derived(int a, int b){
            super(a);
            System.out.println("i am a overloaded constructor of derived class:"+b);
        }
        public int getY(){
            return y;
        }
        public void setY(int y){
            y = y;
        }

    }
    class childOfDerived extends derived {
        int c;
      childOfDerived(){
        System.out.println(" hi am a child of derived");
      }
      childOfDerived(int a,int b,int c){
        super(a, b);
        System.out.println("i am a overloded constructor of child class:"+c);
      }
    }

public class cwh_46_constructor_in_inheritance {
    public static void main(String[] args) {
       // base b = new base();
       // derived d = new derived(2,3);
       childOfDerived c = new childOfDerived(2,4,5);
    }
    
}
