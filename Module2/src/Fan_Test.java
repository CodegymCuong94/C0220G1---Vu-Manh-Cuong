import javax.print.attribute.standard.PresentationDirection;

public class Fan_Test {
    public static void main(String[] args) {
        Fan Fan1 = new Fan(3,true,4, "yellow");
        System.out.println(Fan1.toString());
        Fan Fan2 = new Fan(3,false,5, "blue");
        System.out.println(Fan2.toString());
    }
}
