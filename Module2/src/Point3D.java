public class Point3D extends Point2D {
    public float z;

    public Point3D() {
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        System.out.println("ddd");
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float[] getXYZ() {
        float[] arr = {this.x, this.y, this.z};
        return arr;
    }

    @Override
    public void setXY(float x, float y) {
        super.setXY(x, y);
        System.out.println("fff");
    }

    public void setXY(float x, int y) {
    }

    public void setXYZ(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public String toString() {
        return "X : " + getX() + " Y :" + getY() + " Z :" + getZ();
    }

    public static void main(String[] args) {
        new Point3D(1, 2, 3);

    }
}
