import java.util.Scanner;

public class StopWatch_Test {
    public static void main(String[] args) {
        StopWatch clock1 = new StopWatch();
        clock1.star();
        System.out.println(clock1.star());
        Scanner sc = new Scanner(System.in);
        sc.next();
        clock1.stop();
        System.out.println(clock1.stop());
        clock1.getElapsedTime();
        System.out.println(clock1.getElapsedTime());

    }
}
