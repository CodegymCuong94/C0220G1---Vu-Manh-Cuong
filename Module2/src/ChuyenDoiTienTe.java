import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How much USD do you want to change?");
        int moneyUSD = sc.nextInt();
        int moneyVND = moneyUSD * 23000;
        System.out.println(moneyUSD +" USD " + " = "+ moneyVND + " VND");

    }
}
