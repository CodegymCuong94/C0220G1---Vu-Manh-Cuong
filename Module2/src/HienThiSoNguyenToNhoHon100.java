public class HienThi100SoNguyenToDauTien {
    public static void main(String[] args) {


            for (int i = 2; i <= 100; i++) {
                int n = 0;
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        n = 1;
                        break;
                    }
                }
                if (n == 0) {
                    System.out.println(i);
                }

            }
        }


    }


