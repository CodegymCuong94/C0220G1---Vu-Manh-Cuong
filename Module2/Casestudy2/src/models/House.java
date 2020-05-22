package models;

public class House extends Services {
    public String standardOfRoom;
    public String convenient;
    public int numberOfFloor;

    public House(String standardOfRoom, String convenient, int numberOfFloor) {
        this.standardOfRoom = standardOfRoom;
        this.convenient = convenient;
        this.numberOfFloor = numberOfFloor;
    }

    public House() {
    }

    public String getStandardOfRoom() {
        return standardOfRoom;
    }

    public String getConvenient() {
        return convenient;
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

    public void setNumberOfFloor(int numberOfFloor) {
        this.numberOfFloor = numberOfFloor;
    }

    @Override
    public String ShowInfor() {
        return "Standard of Room:" + standardOfRoom + "\n" + "Convenient: " + convenient + "\n" + "Number of floor " + numberOfFloor;
    }
}
