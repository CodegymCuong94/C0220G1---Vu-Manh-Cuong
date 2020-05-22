public class KieuDuLieu {
    public static void main(String[] args) {
        int i = 10;
        float f = 20.5f;
        double d = 20.5;
        boolean b = true;
        char c = 'a';
        String s = "Hà Nội";
        System.out.println("i ="+ i);
        System.out.println("f ="+ f);
        System.out.println("d ="+ d);
        System.out.println("b ="+ b);
        System.out.println("c ="+ c);
        System.out.println("s ="+ s);
        System.out.printf("Integer : %d\n", 15);
        System.out.printf("Floating point number with 3 decimal digits: %.3f \n", 1.21312939123);
        System.out.printf("Floating point number with 8 decimal digits: %.8f \n", 1.21312939123);
        System.out.printf("String: %s, integer: %d, float: %.6f \n", "Hello World", 89, 9.231435);
        System.out.printf("Re-order output %4$2s %1$2s %3$2s %2$2s \n", "a", "b", "c", "d");

    }
}
