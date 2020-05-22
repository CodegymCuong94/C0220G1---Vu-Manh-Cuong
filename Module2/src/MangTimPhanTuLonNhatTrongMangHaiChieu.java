public class MangTimPhanTuLonNhatTrongMangHaiChieu {


    public static int mangMotChieu(int[]arr){
        int max = arr[0];
        int index = 0;
        for(int i=0; i < arr.length; i++){
            if(arr[i]> max){
                max = arr[i];
                index = i;
            }
        }
        return arr[index];

    }

    public static void main(String[] args) {
        int[][] array ={{2,3,4}, {12,14,16},{0,1,90}};
        int[] mang = new int[array.length];

        for(int i = 0; i< array.length; i++){
//            int max = mangMotChieu(array[i]);
//            System.out.println(max + " ");
            mang[i] = mangMotChieu(array[i]);
        }
        System.out.println("Giá trị lớn nhất của mảng hai chiều là: "+ mangMotChieu(mang));


    }
}
