class phone {
    public void on() {
        System.out.println("turrning the phone on...");
    }

    public void showtime() {
        System.out.println("time is 8am");
    }
}

class smartphone extends phone {
    public void on() {
        System.out.println("turrning smartphone on......");
    }

    public void music() {
        System.out.println("play the music");
    }

    public void game() {
        System.out.println("play the game");
    }
}

public class cwh_49_dynamic_method_dispatch {
    public static void main(String[] args) {
        // phone obj = new phone();
        // smartphone obj1 = new smartphone();
        // obj.name();
        // obj1.name();
        phone obj = new smartphone();
        obj.on();
        obj.showtime();
        // obj.game(); this is an error we can't call smartphone function by refrence of
        // phone this is called dynamic method dispatch
    }

}
