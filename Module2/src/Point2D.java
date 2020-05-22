public class Point2D extends Object {
    public float x;
    public float y;


    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }



    public Point2D() {
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY() {
        float[] arr = {this.x, this.y};
        return arr;
    }

    public String toString() {
        String st = x == 3 ? "x bang 3" : "x khong bang 3";

        if (x == 3) {
            st = "x bang 3";
        } else {
            st = "x khong bang 3";
        }

        return "X : " + getX() + " Y :" + getY();
    }
}
