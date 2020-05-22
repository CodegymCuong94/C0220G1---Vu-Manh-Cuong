import java.util.Scanner;

public class MangChuyenDoiDoNhietDo {
    public static double DoCquaDoF (double DoC){
        double DoF = (9.0/5)* DoC + 32;
        return  DoF;
    }
    public static double DoFquaDoC (double DoF){
        double DoC = (5.0/9)* (DoF - 32);
        return DoC;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double DoC;
        double DoF;
        int choice;
        System.out.println("Menu");
        System.out.println("1.Chuyển Độ C qua Độ F");
        System.out.println("2.Chuyển Độ F qua Độ C");
        System.out.println("3.Exit");
        System.out.println("Hãy chọn một số:");
        choice = sc.nextInt();
        switch (choice){
            case 1:
                System.out.println("Nhập Độ C: ");
                DoC = sc.nextDouble();
                System.out.println("Độ C qua Độ F:"+ DoCquaDoF(DoC));
                break;

            case 2:
                System.out.println("Nhập Độ F: ");
                DoF = sc.nextDouble();
                System.out.println("Độ F qua Độ C:" + DoFquaDoC(DoF));
                break;

            case 3:
                System.exit(3);
                break;


        }
    }
}
