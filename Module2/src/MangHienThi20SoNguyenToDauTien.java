import java.util.Scanner;

public class MangHienThi20SoNguyenToDauTien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong so nguyen to can in ra");
        int numbers = sc.nextInt();//So luong so nguyen to
        int count = 0;//Dem xem so luong so Nguyen To da bang voi numbers chua
        int i = 2;//So dua di kiem tra
        while (count < numbers) {
            if (isPrimeNumbers(i)) {
                System.out.println(i + " ");
                count++;
            }
            i++;
        }
    }
// Tao Ham kiem tra so nguyen to isPrimeNumbers
    public static boolean isPrimeNumbers(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;

    }

}
