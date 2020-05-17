import java.util.Scanner;

public class OOPLopHinhChuNhat {
    public class HinhChuNhat{
        double width;
        double hight;
        public HinhChuNhat(){
        }
        public HinhChuNhat(double width, double hight){
            this.hight = hight;
            this.width = width;
        }
        public Area(){
            return this.width * this.hight;
        }
        public Perimeter(){
            return (this.width + this.hight)*2;
        }
        public display(){
            return "Hinh Chu Nhat: width =" + width +" hight = "+ hight;
        }
    }
}
public class EX{
    public static void main(String[] args) {
        Scanner sc = Scanner(System.in);
        System.out.println("Enter width: ");
        double width = sc.nextDouble();
        System.out.println("Enter hight: ");
        double hight = sc.nextDouble();
    }
}
