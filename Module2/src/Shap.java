import java.util.Scanner;

public class Shap {
    public double side1 = 1;
    public double side2 = 1;
    public double side3 = 1;


    public Shap() {
    }

    public Shap(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }
    public double perimeter(){
        double p = this.side1+ this.side2 + this.side3;
        return p;
    }
    public double area(){
        double s=(this.side1+ this.side2 + this.side3)/2;
        double a= Math.sqrt(s*(s-this.side1)*(s-this.side2)*(s-this.side3));
        return a;
    }
    public String toString(){
        return "Side 1: "+getSide1()+" Side2: "+getSide2()+" Side3: "+getSide3()+" Perimeter "+perimeter()+" Area "+area();
    }

}
