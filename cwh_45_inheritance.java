class base{
    int X;
    public int getX(){
        System.out.println("i am a base class");
        return X;
    }
    public void setX(int X){
        this.X = X;
    }
    
}
 
class derived extends base{
    int Y;
     public int getY(){
        System.out.println("hi i am derived class");
        return Y;
    }
    public void setY(int Y){
        this.Y = Y;
    }
      public void base(){
        System.out.println("i am a constructor");
    }
}
public class cwh_45_inheritance {
    public static void main(String[] args) {
        base b = new base();
        b.setX(6);
        System.out.println(b.getX());
        derived d = new derived();
        d.setX(43);
        System.out.println(d.getX());
        d.setY(5);
        System.out.println(d.getY());
    }
    
}
