class circle {
    public int radius;

    circle(int r) {
        System.out.println("i am circle perameterized constructor");
        this.radius = r;
    }

    public double area() {
        return Math.PI * radius * radius;
    }
}

class cylinder extends circle {
    int heigth;

    cylinder(int r, int h) {
        super(r);
        heigth = h;
        System.out.println(" i am a cylinder of class cylinder");
    }

    public double volume() {
        return Math.PI * this.radius * this.radius * heigth;
    }
}

public class cwh_52_prectice_set {
    public static void main(String[] args) {
        // circle c = new circle(12);
        cylinder ch = new cylinder(12, 12);
    }

}
