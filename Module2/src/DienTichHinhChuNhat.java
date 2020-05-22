import java.sql.SQLOutput;
import java.util.Scanner;

public class DienTichHinhChuNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Chieu Dai: ");
        float chieuDai1 = sc.nextFloat();
        System.out.println("Chieu Rong");
        float chieuRong1 = sc.nextFloat();
        float DienTich = chieuDai1 * chieuRong1;
        System.out.println("DienTich: " + DienTich);
    }
}