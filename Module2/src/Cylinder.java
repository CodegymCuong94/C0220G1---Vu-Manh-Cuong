import test.Circle;

public class Cylinder extends Circle {
    public double hight;


    public Cylinder(double radius, String color, double hight) {
//        super(radius, color);
        this.hight = hight;
    }

    public double getHight() {
        return hight;
    }

    public void setHight(double hight) {
        this.hight = hight;
    }
    public double volume(){
        return Math.PI*getRadius()*getRadius()*getHight();
    }
    public String toString(){
        return "Radius "+getRadius()+" Hight "+ getHight()+ " Color "+getColor()+" Volume "+volume();
    }
    public static void main(String[] args) {
        Cylinder ex1 = new Cylinder(10,"red",20);
        System.out.println(ex1.toString());
    }

}
