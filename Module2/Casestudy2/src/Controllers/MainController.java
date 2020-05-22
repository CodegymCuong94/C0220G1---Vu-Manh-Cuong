package Controllers;

import models.House;
import models.Room;
import models.Services;
import models.Villa;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class MainController extends Customer {

    public static ArrayList<Villa> villaArrayList = new ArrayList<>();
    public static ArrayList<House> houseArrayList = new ArrayList<>();
    public static ArrayList<Room> roomaArrayList = new ArrayList<>();
    public static ArrayList<Customer> customerVillaArrayList = new ArrayList<>();

    public MainController() throws IOException {

        Scanner sc = new Scanner(System.in);

        String choose;
        while (true) {
            System.out.println("1. Add New Services\n" +
                    "2. Show Services\n" +
                    "3. Add New Customer\n" +
                    "4. Show Information of Customer\n" +
                    "5. Add New Booking\n" +
                    "6. Show Information of Employee\n" +
                    "7. Exit\n");
            choose = sc.nextLine();
            switch (choose) {
                case "1":
                    addNewServices();
                    break;
                case "2":
                    showServices();
                    break;
                case "3":
                    break;
                case "4":
                    break;
                case "5":
                    addNewBooking();
                    break;
                case "6":
                    break;
                case "7":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Fail.Choose again.Enter to Continue ");
                    sc.nextLine();
                    new MainController();

            }
        }
    }


    private void addNewBooking() throws IOException {
        showInformationCustomers();
        Scanner sc = new Scanner(System.in);
        int chooseCustomer = sc.nextInt();
        Customer customerSelected = customerArrayList.get(chooseCustomer - 1);
        System.out.println("1. Booking Villa\n" +
                "2. Booking House\n" +
                "3. Booking Room\n");
        int choose = sc.nextInt();
        switch (choose) {
            case 1:
                ShowAllVilla();
                Villa villaSelection = villaArrayList.get(choose - 1);
                System.out.println(customerSelected.getName() + " villa " + villaSelection.convenient);
                break;
            case 2:
                ShowAllHouse();
                House houseSelection = houseArrayList.get(choose - 1);
                System.out.println(customerSelected.getName() + " house " + houseSelection.convenient);
                break;
            case 3:
                ShowAllRoom();
                Room roomSelection = roomaArrayList.get(choose - 1);
                System.out.println(customerSelected.getName() + " Room " + roomSelection.getServicesForFree());
                break;
            default:
                System.out.println("Fail.Choose again.Enter to Continue ");
                sc.nextLine();
                addNewBooking();
                break;
        }

    }


    public void addNewServices() throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Add New Villa\n" +
                "2. Add New House\n" +
                "3. Add New Room\n" +
                "4. Back to menu\n" +
                "5. Exit\n");

        String choose = sc.nextLine();
        switch (choose) {
            case "1":
                System.out.println("Standard of Room:");
                String standardOfVilla = sc.next();
                System.out.println("Convenient");
                String convenientVilla = sc.next();
                System.out.println("Area of Pool");
                double areaOfPoolVilla = sc.nextDouble();
                System.out.println("Number of Floor");
                int numberOfFloorVilla = sc.nextInt();
                Villa villa = new Villa(standardOfVilla, convenientVilla, areaOfPoolVilla, numberOfFloorVilla);


                try {
                    //FileOutputStream : lay duong dan file
                    //DataOutputStream : nhan duong dan va ghi file
                    FileOutputStream fos = new FileOutputStream("E:\\CodeGym\\Module2\\Casestudy2\\src\\data\\villa.csv", true);
                    DataOutputStream dos = new DataOutputStream(fos);

                    dos.writeBytes(villa.getStandardOfRoom() + ",");
                    dos.writeBytes(villa.getConvenient() + ",");
                    dos.writeBytes(villa.getAreaOfPool() + ",");
                    dos.writeBytes(villa.getNumberOfFloor() + "\n");
                } catch (IOException ex) {
                    ex.printStackTrace();
                }

                addNewServices();
                break;
            case "2":
                System.out.println("Standard of Room:");
                String standardOfHouse = sc.next();
                System.out.println("Convenient");
                String convenientHouse = sc.next();
                System.out.println("Number of Floor");
                int numberOfFloorHouse = sc.nextInt();
                House house = new House(standardOfHouse, convenientHouse, numberOfFloorHouse);
                try {
                    FileOutputStream fos = new FileOutputStream("E:\\CodeGym\\Module2\\Casestudy2\\src\\data\\house.csv", true);
                    DataOutputStream dos = new DataOutputStream(fos);

                    dos.writeBytes(house.getStandardOfRoom() + ",");
                    dos.writeBytes(house.getConvenient() + ",");
                    dos.writeBytes(house.getNumberOfFloor() + ",");
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
                System.out.println("Enter to continue");
                sc.next();
                addNewServices();
                break;
            case "3":
                System.out.println("Serving for free");
                String servingForFreeRoom = sc.nextLine();
                Room room = new Room(servingForFreeRoom);
                try {
                    FileOutputStream fos = new FileOutputStream("E:\\CodeGym\\Module2\\Casestudy2\\src\\data\\room.csv", true);
                    DataOutputStream dos = new DataOutputStream(fos);

                    dos.writeBytes(room.getServicesForFree() + ",");

                } catch (IOException ex) {
                    ex.printStackTrace();
                }
                break;
            case "4":
                return;
            case "5":
                System.exit(0);
                break;
            default:
                System.out.println("Fail.Choose again.Enter to Continue ");
                sc.nextLine();
                addNewServices();

        }

    }

    public void showServices() {
        Scanner sc = new Scanner(System.in);
        while (true) {

            System.out.println("1. Show all Villa\n" +
                    "2. Show all House\n" +
                    "3. Show all Room\n" +
                    "4. Show All Name Villa Not Duplicate\n" +
                    "5. Show All Name House Not Duplicate\n" +
                    "6. Show All Name Name Not Duplicate\n" +
                    "7. Back to menu\n" +
                    "8. Exit\n");
            String choose = sc.nextLine();
            switch (choose) {
                case "1":
                    ShowAllVilla();
                    break;
                case "2":
                    ShowAllHouse();
                    break;
                case "3":
                    ShowAllRoom();
                    break;
                case "4":
                    break;
                case "5":
                    break;
                case "6":
                    break;
                case "7":
                    return;
                case "8":
                    System.exit(0);
                    break;

            }
        }
    }

    private void ShowAllRoom() {
        try {
            //FileInputStream fis: Lay duong dan in file

            FileInputStream fis = new FileInputStream("E:\\CodeGym\\Module2\\Casestudy2\\src\\data\\room.csv");
            DataInputStream dis = new DataInputStream(fis);

            String line = "";

            //doc tung dong trong file roi hien thi
            while ((line = dis.readLine()) != null) {
                System.out.println(line);
                String[] splitRoom = line.split(",");
                Room room = new Room(splitRoom[0]);
                roomaArrayList.add(room);
            }
            System.out.println(roomaArrayList.get(0).toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void ShowAllHouse() {
        try {
            //FileInputStream fis: Lay duong dan in file

            FileInputStream fis = new FileInputStream("E:\\CodeGym\\Module2\\Casestudy2\\src\\data\\house.csv");
            DataInputStream dis = new DataInputStream(fis);

            String line = "";

            //doc tung dong trong file roi hien thi
            while ((line = dis.readLine()) != null) {
                System.out.println(line);
                String[] splitHouse = line.split(",");
                House house = new House(splitHouse[0], splitHouse[1], Integer.parseInt(splitHouse[2]));
                houseArrayList.add(house);
            }
            System.out.println(houseArrayList.get(0).toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void ShowAllVilla() {
        try {
            //FileInputStream fis: Lay duong dan in file

            FileInputStream fis = new FileInputStream("E:\\CodeGym\\Module2\\Casestudy2\\src\\data\\villa.csv");
            BufferedReader bf = new BufferedReader(new InputStreamReader(fis));
            String line = "";

            //doc tung dong trong file roi hien thi
            while ((line = bf.readLine()) != null) {
                System.out.println(line);
                String[] splitVilla = line.split(",");
                Villa villa = new Villa(splitVilla[0], splitVilla[1], Double.parseDouble(splitVilla[2]), Integer.parseInt(splitVilla[3]));
                villaArrayList.add(villa);
            }
            System.out.println(villaArrayList.get(0).toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
    

    
