public class QuadraticEquation {
    private double a, b, c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }

    public double getC() {
        return this.c;
    }

    public double getDiscriminant() {
        double delta = b * b - a * c * 4;
        return delta;
    }

    public double getRoot1() {
        double r1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
        return r1;
    }

    public double getRoot2() {
        double r2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
        return r2;
    }

    public void solve() {
        if ((b * b - a * c * 4) < 0) {
            System.out.println("Phương trình vô nghiệm");
        } else if ((b * b - a * c * 4) == 0){
            System.out.println("phương trình có 1 nghiệm" + getRoot1());
        }else if((b * b - a * c * 4) > 0){
            System.out.println("phương trình có 2 nghiệm" + getRoot1() + " và" + getRoot2());
        }
    }


}
