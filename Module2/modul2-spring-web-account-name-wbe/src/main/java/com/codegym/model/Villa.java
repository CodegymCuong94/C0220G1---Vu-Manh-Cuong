package com.codegym.model;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Villa {
    @Id
    private Integer id;
    private String name;
    private Float userArea;
    private Float coast;
    private Integer numberOfPeople;
    private String typeOfRent;
    private String standardOfRoom;
    private String anotherConvenient;
    private Float areaOfPool;
    private Integer numberOfFloor;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getUserArea() {
        return userArea;
    }

    public void setUserArea(Float userArea) {
        this.userArea = userArea;
    }

    public Float getCoast() {
        return coast;
    }

    public void setCoast(Float coast) {
        this.coast = coast;
    }

    public Integer getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(Integer numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    public String getTypeOfRent() {
        return typeOfRent;
    }

    public void setTypeOfRent(String typeOfRent) {
        this.typeOfRent = typeOfRent;
    }

    public String getStandardOfRoom() {
        return standardOfRoom;
    }

    public void setStandardOfRoom(String standardOfRoom) {
        this.standardOfRoom = standardOfRoom;
    }

    public String getAnotherConvenient() {
        return anotherConvenient;
    }

    public void setAnotherConvenient(String anotherConvenient) {
        this.anotherConvenient = anotherConvenient;
    }

    public Float getAreaOfPool() {
        return areaOfPool;
    }

    public void setAreaOfPool(Float areaOfPool) {
        this.areaOfPool = areaOfPool;
    }

    public Integer getNumberOfFloor() {
        return numberOfFloor;
    }

    public void setNumberOfFloor(Integer numberOfFloor) {
        this.numberOfFloor = numberOfFloor;
    }

    public Villa() {
    }
}
