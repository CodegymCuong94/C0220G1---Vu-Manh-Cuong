import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.sql.SQLOutput;
import java.util.Scanner;

public class GiaiPhuongTrinhBacNhat {
    public static void main(String[] args) {
        float a;
        float b;
        float c;
        float x;
        System.out.println("Giải phương trình bậc nhất dạng: aX + b = c.");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập giá trị của a:");
        a = sc.nextFloat();
        System.out.println("Nhập giá trị của b:");
        b = sc.nextFloat();
        System.out.println("Nhập giá trị của c:");
        c = sc.nextFloat();
        if (a != 0) {
            x = (c - b) / a;
            System.out.println("Giá trị của x là:" + x);
        } else if (a == 0 && b == c) {
            System.out.println("Phương trình có vô số nghiệm.");
        } else {
            System.out.println("Phương trình bị sai.");
// a == 0
        }
    }
}
