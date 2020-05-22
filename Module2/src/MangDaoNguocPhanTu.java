import java.util.Scanner;

public class MangDaoNguocPhanTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size of Arr:");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i< size; i++){
            System.out.println("Nhập giá trị của phần tử "+ (i+1));
            arr[i] = sc.nextInt();
        }
        System.out.println("Thứ tự các phần tử ban đầu:");
        for (int i = 0; i<size; i++){
            System.out.println(arr[i] +" ");
        }
        for(int i = 0; i<size/2; i++){
            int X = arr[i];
            arr[i]= arr[size -1 -i];
            arr[size -1-i] = X;
        }
        System.out.println("Thứ tự các phần tử sau khi đảo ngược:");
        for (int i = 0; i < size; i ++){
            System.out.print(arr[i] +" ");
        }
    }
}
