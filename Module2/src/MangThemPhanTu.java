import java.util.Scanner;

public class MangThemPhanTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        for(int i = 0; i < size; i ++){
            System.out.println("Enter element:"+ (i+1));
            array[i]=sc.nextInt();
        };
        System.out.println("Element list:");
        for(int j = 0; j<size; j++){
            System.out.print(array[j]+ ", ");
        };
        System.out.println("Nhập số cần chèn:");
        int numberX =sc.nextInt();
        System.out.println("Nhập vị trí cần chèn:");
        int indexX = sc.nextInt();
        if(indexX <1 || indexX >size ){
            System.out.println("Can not put any element.");
        }else {
            array[indexX - 1] = numberX;
            System.out.println("New Element list");
            for (int j = 0; j < size; j++) {
                System.out.print(array[j] + ", ");
            }
        }

    }
}
