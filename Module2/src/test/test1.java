package test;

import java.util.Random;

public class test1 {
    public static void main(String[] args) {
        Circle c1 = new Circle(10);
        Square s4 = new Square(20);
        Rectangle r5 = new Rectangle(5,20);
        Shape[] array = new Shape[]{c1,s4, r5};
        Random r = new Random();
        int randomInt = r.nextInt(100) + 1;
        c1.resize(randomInt);
        s4.resize(randomInt);
        s4.howtoColor();
        r5.resize(randomInt);
        System.out.println("Ban kinh hinh tron" + c1.getRadius() + "canh hinh vuong" + s4.getSide() + "Chieu rong" + r5.getWidth() + "chieu dai" + r5.getLength());
        System.out.println("color" ); s4.howtoColor();

    }
}
