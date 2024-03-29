package com.tavisca.OnlineTrainBookingSystem.train.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Train {
    @Id
    private int trainNo;

    private String trainName;
    private String source;
    private String destination;
    private int noOfStop;
    private int capacity;

    public Train() {
    }

    public int getTrainNo() {
        return trainNo;
    }

    public void setTrainNo(int trainNo) {
        this.trainNo = trainNo;
    }

    public String getTrainName() {
        return trainName;
    }

    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getNoOfStop() {
        return noOfStop;
    }

    public void setNoOfStop(int noOfStop) {
        this.noOfStop = noOfStop;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}