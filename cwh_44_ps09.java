
class cylinder {
    private int radius;
    private int heigth;

    public cylinder(int radius, int heigth) {
        this.radius = radius;
        this.heigth = heigth;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int r) {
        radius = r;
    }

    public int getHeigth() {
        return heigth;
    }

    public void setHeigth(int h) {
        heigth = h;
    }

    public double surface() {
        return 2 * Math.PI * radius * radius + 2 * Math.PI * radius * heigth;
    }

    public double volume() {
        return Math.PI * radius * radius * heigth;
    }
}

class ractangle {
    int length;
    int breadth;

    public ractangle() {
        this.breadth = 5;
        this.length = 4;
    }

    public ractangle(int breadth, int length) {
        this.breadth = breadth;
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }
}

public class cwh_44_ps09 {
    public static void main(String[] args) {

        // problem 01
        cylinder mCylinder = new cylinder(9, 12);
        mCylinder.setRadius(9);
        mCylinder.setHeigth(12);
        System.out.println(mCylinder.getRadius());
        System.out.println(mCylinder.getHeigth());

        // problem 02
        System.out.println(mCylinder.surface());

        // problem 03
        System.out.println(mCylinder.volume());

        // problem 04 (1 repeat by using constructor)
        // problem 05 make a class ractangle and use constructor overloading
        ractangle r = new ractangle(5, 6);
        System.out.println(r.getBreadth());
        System.out.println(r.getLength());

    }
}
