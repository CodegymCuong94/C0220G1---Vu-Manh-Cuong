import java.util.Scanner;

public class TimGiaTriLonNhatTrongMang {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a size:");
        size = scanner.nextInt();

        if (size > 20)
            System.out.println("Size should not exceed 20");
        array = new int[size];
        int i = 0;
        for(i =0; i <=size -1; i++){
            System.out.println("Enter element:"+ (i+1));
            array[i] = scanner.nextInt();
        };
        System.out.println("Element list:" +"\n");
        for(int j = 0; j <= size -1; j ++) {
            System.out.print(array[j] + "\t");
        };
            int max = array[0];
            int index = 1;
            for (int x = 0; x < array.length; x++) {
                if (array[x] > max) {
                    max = array[x];
                    index = x + 1;
                }
            }
            System.out.println("The largest property value in the list is " + max + " ,at position " + index + "\n");
        }
    }


