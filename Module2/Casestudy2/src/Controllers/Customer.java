package Controllers;

import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Customer {
    public String name;

    public Customer() {
    }

    public String sex;
    public long idCard;
    public long phoneNumber;
    public String email;
    public String typeOfCustomer;
    public String address;

    public static ArrayList<Customer> customerArrayList = new ArrayList<>();


//    public static void ShowInfor() {
//
//    }


    public Customer(String s) {

    }

    public Customer(String name, String sex, long idCard, long phoneNumber, String email, String typeOfCustomer, String address) {
        this.name = name;
        this.sex = sex;
        this.idCard = idCard;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.typeOfCustomer = typeOfCustomer;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public long getIdCard() {
        return idCard;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getTypeOfCustomer() {
        return typeOfCustomer;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setIdCard(long idCard) {
        this.idCard = idCard;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTypeOfCustomer(String typeOfCustomer) {
        this.typeOfCustomer = typeOfCustomer;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void addNewCustomer() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Name of Customer");
        name = sc.nextLine();
        System.out.println("Sex");
        sex = sc.nextLine();
        System.out.println("ID card");
        idCard = sc.nextLong();
        System.out.println("Phone number");
        phoneNumber = sc.nextLong();
        System.out.println("Email");
        email = sc.next();
        System.out.println("Type of Customer");
        typeOfCustomer = sc.next();
        System.out.println("Address");
        address = sc.next();

        Customer customer = new Customer(name, sex, idCard, phoneNumber, email, typeOfCustomer, address);

        try {
            FileOutputStream fos = new FileOutputStream("E:\\CodeGym\\Module2\\Casestudy2\\src\\data\\customer.csv", true);
            DataOutputStream dos = new DataOutputStream(fos);

            dos.writeBytes(customer.name + ",");
            dos.writeBytes(customer.sex + ",");
            dos.writeBytes(customer.idCard + ",");
            dos.writeBytes(customer.phoneNumber + ",");
            dos.writeBytes(customer.email + ",");
            dos.writeBytes(customer.typeOfCustomer + ",");
            dos.writeBytes(customer.address + ",");
            dos.writeBytes("\n");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void showInformationCustomers() throws IOException {
        try {
//            //FileInputStream fis: Lay duong dan in file
//
            FileInputStream fis = new FileInputStream("E:\\CodeGym\\Module2\\Casestudy2\\src\\data\\customer.csv");
            DataInputStream dis = new DataInputStream(fis);
//
            String line = "";
//
//            //doc tung dong trong file roi hien thi
            while ((line = dis.readLine()) != null) {
//                System.out.println(line);
                String[] splitCustomer = line.split(",");
                Customer customer = new Customer(splitCustomer[0], splitCustomer[1], Long.parseLong(splitCustomer[2]), Long.parseLong(splitCustomer[3]), splitCustomer[4], splitCustomer[5], splitCustomer[6]);
                customerArrayList.add(customer);
            }


            Collections.sort(customerArrayList, new Comparator<Customer>() {
                @Override
                public int compare(Customer o1, Customer o2) {
                    if (o1.getName().compareToIgnoreCase(o2.getName()) > 0) return 1;
                    return -1;
                }
            });
            int index = 0;
            for (Customer customer : customerArrayList) {
                index++;
                System.out.println(index + customer.getName() + customer.getSex() + customer.getIdCard() + customer.getPhoneNumber() + customer.getEmail() + customer.getTypeOfCustomer() + customer.getAddress());
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


