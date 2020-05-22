public class MangXoaMang {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6};
        int elementX = 5;
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != elementX) {
                index++;
            }
        }
//        System.out.println(index);
        if (index == arr.length) {
            System.out.println("Không có phần tử " + elementX + " trong mảng");
        } else {
            System.out.println("phần tử X ở vị trí thứ " + index);
        }
        for (int i = index - 1; i < arr.length-1; i++) {
            arr[i] = arr[i+1];
        }
        for (int i = 0; i < arr.length -1 ; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}
