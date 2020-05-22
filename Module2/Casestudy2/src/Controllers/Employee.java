package Controllers;

import models.House;
import models.Room;

import javax.swing.plaf.synth.SynthEditorPaneUI;
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static Controllers.MainController.houseArrayList;

public class Employee {
    public String name;
    public int age;
    public String address;
    public static ArrayList<Employee> employeeArrayList = new ArrayList<>();

    public Employee(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void addNewEmployee() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Name:");
        String name = sc.next();
        System.out.println("Age:");
        int age = sc.nextInt();
        System.out.println("Address:");
        String address = sc.next();
        Employee employee = new Employee(name, age, address);

        try {
            //FileOutputStream : lay duong dan file
            //DataOutputStream : nhan duong dan va ghi file
            FileOutputStream fos = new FileOutputStream("E:\\CodeGym\\Module2\\Casestudy2\\src\\data\\employee.csv", true);
            DataOutputStream dos = new DataOutputStream(fos);

            dos.writeBytes(employee.getName() + ",");
            dos.writeBytes(employee.getAge() + ",");
            dos.writeBytes(employee.getAddress());
            dos.writeBytes("\n");

        } catch (IOException ex) {
            ex.printStackTrace();
        }
        try {
            //FileInputStream fis: Lay duong dan in file

            FileInputStream fis = new FileInputStream("E:\\CodeGym\\Module2\\Casestudy2\\src\\data\\employee.csv");
            DataInputStream dis = new DataInputStream(fis);
            String line = "";

            //doc tung dong trong file roi hien thi + ghi vào arraylist
            while ((line = dis.readLine()) != null) {
                System.out.println(line);
                String[] splitEmployee = line.split(",");
                Employee employee1 = new Employee(splitEmployee[0], Integer.parseInt(splitEmployee[1]), splitEmployee[2]);
//                Ghi vào Arraylist
                employeeArrayList.add(employee1);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

//Tạo và ghi dữ liệu vào map
        Map<Integer, String> map = new HashMap<>();
        for (int i = 0; i <= 8; i++) {
            map.put(i, employeeArrayList.get(i).getName());
        }
//        Vòng lặp để in thông tin của map
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }


    }

    public static void main(String[] args) {
        Employee t1 = new Employee();
        t1.addNewEmployee();

    }
}
