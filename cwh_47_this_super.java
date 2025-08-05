class ekclass{
    int a;
    ekclass(int a){
        this.a = a;
    }
    public int geta(){
        return a;
    }
    public int returnOne(){
        return 1;
    }
}
class doclass extends ekclass{
    doclass(int c){
        super(c);
        System.out.println(" i am a constructor");
    }
}
public class cwh_47_this_super {
public static void main(String[] args) {
    ekclass e = new ekclass(22);
    doclass d = new doclass(3);
    System.out.println(e.geta());
}    
}
