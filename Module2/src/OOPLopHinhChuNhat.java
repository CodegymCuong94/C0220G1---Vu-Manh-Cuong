public class OOPLopHinhChuNhat {
    double width;
    double hight;

    public OOPLopHinhChuNhat() {
    }

    public OOPLopHinhChuNhat(double width, double hight) {
        this.width = width;
        this.hight = hight;
    }

    public OOPLopHinhChuNhat(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea(double hight, double width) {
        return 0;
    }

    public double getArea(double hight, int width) {

        this.width = width;
        this.hight = hight;
        return 0;
    }

    public double getHight() {
        return hight;
    }

    public void setHight(double hight) {
        this.hight = hight;
    }

}
