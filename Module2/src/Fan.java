public class Fan {
    public static final int SLOW = 1;
    public static final int MEDIUM =2;
    public static final int FAST =3;
    private int speed= SLOW;
    private boolean on=false ;
    private double radius =5;
    private String color = "blue";
//Phương thức khởi tạo ko tham số
    public Fan() {
    }
//Phương thức khởi tạo có tham số
    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String toString(){
        if(this.on ){
           return "Fan is on " + getSpeed()+ " " + getColor()+ " " + getRadius() ;
        }else{
           return "Fan is of"+ getColor()+ " " + getRadius();
        }

    }
}
