import java.util.Scanner;

public class MangGopMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng 1:");
        int size1 = sc.nextInt();
        int[] arr1 = new int[size1];
        for(int i = 0; i<size1; i++){
            System.out.println("Nhập phần tử thứ "+ (i+1));
            arr1[i]= sc.nextInt();
        };
        System.out.println("Nhập số phần tử của mảng 2:");
        int size2 = sc.nextInt();
        int[] arr2 = new int[size2];
        for(int i = 0; i<size1; i++){
            System.out.println("Nhập phần tử thứ "+ (i+1));
            arr2[i]= sc.nextInt();
        };

        int[]arr3 = new int[arr1.length + arr2.length];
        for(int i =0; i<arr1.length; i++){
            arr3[i]= arr1[i];
        }
        for(int i = (arr3.length - arr1.length); i<arr3.length; i++){
            arr3[i] = arr2[i-arr2.length];
        }
        System.out.println("Các phần tử của mảng 3 là:");
        for (int i =0; i<arr3.length; i++){
            System.out.println(arr3[i]+" ");
        }
    }
}
