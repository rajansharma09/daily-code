interface bycical {
    int x = 45;

    void applybreak(int decrement);

    void speedup(int increment);
}

interface blowHorn {
    void blowHorn3kg();

    void blowHornmhn();

}

class avoncycle implements bycical, blowHorn {
    public void applybreak(int decrement) {
        System.out.println("aplly brake");
    }

    public void speedup(int increment) {
        System.out.println("accelerate");
    }

    public void blowHorn3kg() {
        System.out.println("kabhi khusi kabhi gum pee pee pee pee");
    }

    public void blowHornmhn() {
        System.out.println("main hu na po po po po ");
    }
}

public class cwh_54_interbreface {
    public static void main(String[] args) {

        avoncycle a = new avoncycle();
        a.applybreak(1);
        System.out.println(avoncycle.x);
        // avoncycle.x=232; we cant change atributes of interface
        a.blowHorn3kg();
        a.blowHornmhn();
    }

}
