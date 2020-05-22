import java.util.Scanner;

public class KiemTraSoNguyenTo {
    public static void main(String[] args) {
        System.out.print("Enter a number:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number < 2)
            System.out.println(number + " is not a prime");
        else {
            int i = 2;
            boolean check = true;
            //CACH SU DUNG VONG LAP FOR
//            for(i = 2; i<= Math.sqrt(number); i++){
//                if(number % i ==0){
//                    check = false;
//                    break;
//                }
//            }
            while (i <= Math.sqrt(number)) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check)
                System.out.println(number + " is a prime");
            else
                System.out.println(number + " is not a prime");
        }

    }
}
