import java.util.Scanner;


public class EX {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        System.out.println("Enter width: ");
//        double width = sc.nextDouble();
//        System.out.println("Enter hight: ");
//        double hight = sc.nextDouble();
        OOPLopHinhChuNhat hcn = new OOPLopHinhChuNhat(3,4);
        hcn.setHight(7);
        OOPLopHinhChuNhat hcn2 = new OOPLopHinhChuNhat(7,4);

        System.out.println(hcn.getHight());
    }
}
