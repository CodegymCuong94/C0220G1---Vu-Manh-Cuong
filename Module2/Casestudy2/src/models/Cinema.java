package models;

import Controllers.Customer;

import java.util.LinkedList;
import java.util.Queue;

public class Cinema {
    public static void main(String[] args) {
        //tạo Queue
        Queue<Customer> ticket = new LinkedList<>();
        //tạo phần tử
        Customer c1 = new Customer("Hung", "man", 12345, 912312, "adf@gmail.com", "vip", "hue");
        Customer c2 = new Customer("an", "man", 12312, 234234, "sf@gmail.com", "business", "hue");
        Customer c3 = new Customer("binh", "man", 1231255, 211, "sf@gmail.com", "business", "hue");
        //ghi phần tử vào queue
        ticket.offer(c1);
        ticket.offer(c2);
        ticket.offer(c3);
        Customer cus = ticket.poll();
        System.out.println(cus.getName());
        cus = ticket.poll();
        System.out.println(cus.getName());
        cus = ticket.poll();
        System.out.println(cus.getName());

    }


}
