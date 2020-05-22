package models;

import java.io.Serializable;

public class Villa extends Services  implements Serializable {
    public String standardOfRoom;
    public String convenient;
    public Double areaOfPool;
    public int numberOfFloor;

    public Villa(String standardOfRoom, String convenient, double areaOfPool, int numberOfFloor) {
        this.standardOfRoom = standardOfRoom;
        this.convenient = convenient;
        this.areaOfPool = areaOfPool;
        this.numberOfFloor = numberOfFloor;
    }

    public Villa() {
    }

    public String getStandardOfRoom() {
        return standardOfRoom;
    }

    public String getConvenient() {
        return convenient;
    }

    public double getAreaOfPool() {
        return areaOfPool;
    }

    public int getNumberOfFloor() {
        return numberOfFloor;
    }

    public void setStandardOfRoom(String standardOfRoom) {
        this.standardOfRoom = standardOfRoom;
    }

    public void setConvenient(String convenient) {
        this.convenient = convenient;
    }

    public void setAreaOfPool(double areaOfPool) {
        this.areaOfPool = areaOfPool;
    }

    public void setNumberOfFloor(int numberOfFloor) {
        this.numberOfFloor = numberOfFloor;
    }

    @Override
    public String ShowInfor() {

        return "Standard of Room:" + standardOfRoom + "\n" + "Convenient: " + convenient + "\n" + "Area of Pool " + areaOfPool + "\n" + "Number of floor " + numberOfFloor;
    }
}
