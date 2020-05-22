import java.util.Scanner;

public class HienThi20SoNguyenToDauTien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bạn muốn in ra bao nhiêu số nguyên tố?");
        int number = sc.nextInt();
        int count = 0;
        int n = 2;
        int i = 0;
        while ( i <= Math.sqrt(n)){
            if(n % i != 0) {
                System.out.println("n ");
                ;
                n++;
                count++;
            }else{
                    n++;



            }
        }

    }
}
