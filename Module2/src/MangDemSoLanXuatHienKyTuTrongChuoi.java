import java.util.Scanner;

public class MangDemSoLanXuatHienKyTuTrongChuoi {
    public static void main(String[] args) {
        System.out.println("Nhap mot chuoi:");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("Nhap mot ky tu can kiem tra:");
        char ch = sc.nextLine().charAt(0);
        int count = 0;
        int i = 0;
        while (str.indexOf(ch, i+1) >= 0) {
            count++;
            i = str.indexOf(ch,i+1);
        }

//        for( int i = 0; i< str.length(); i++){
//            if(str.indexOf(ch,i) !=0){
//                count++;
//            }
//        }

        System.out.println("Ky tu can tim kiem dc hien thi " + count + " lan trong chuoi");


    }
}
