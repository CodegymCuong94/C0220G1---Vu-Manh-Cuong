package collections;

import test.Circle;
import test.Rectangle;
import test.Shape;
import test.Square;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListTesting {
    public static void main(String[] args) {
        Circle c1 = new Circle(10);
        Square s4 = new Square(20);
        Rectangle r5 = new Rectangle(5, 20);
        Shape[] array = new Shape[]{c1, s4, r5};

        ArrayList<Shape> list = new ArrayList<Shape>();
        list.add(c1);
        list.add(s4);
        list.add(r5);
        list.add(r5);

        list.remove(1);
//        list.remove(r5);
//        list.remove(s4);

//        array.length;
        list.size();

        for (int i = 0; i <= list.size(); i++) {

        }

        for (Shape shape : list
        ) {
//...
        }

        //////
        MyLinkedList<String> listr = new MyLinkedList<String>();
        // thêm các phần tử vào list
        listr.addFirst("Java");
        listr.addFirst("C++");
        listr.addFirst("PHP");
        listr.addLast("Java");
        // sử dụng vòng lặp for cải tiến - hiển thị các phần tử của list
        System.out.println("Các phần tử có trong list là: ");


        LinkedList<Shape> linkedList = new LinkedList<>();
        linkedList.addFirst(c1);
        linkedList.addFirst(s4);
        linkedList.addFirst(r5);
        linkedList.addLast(r5);
//        linkedList.remove(1);
//        linkedList.remove(r5);
//        linkedList.remove(s4);

//        array.length;
        linkedList.size();

        for (int i = 0; i <= linkedList.size(); i++) {

        }

        for (Shape shape : linkedList
        ) {
//...
        }

    }
}
