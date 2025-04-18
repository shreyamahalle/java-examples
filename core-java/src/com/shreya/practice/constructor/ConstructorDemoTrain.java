package com.shreya.practice.constructor;

public class ConstructorDemoTrain {
    private int trainId;
    private String trainName;

    public ConstructorDemoTrain() {

    }

    public ConstructorDemoTrain(int id, String trainName) {
        this.trainId = id;
        this.trainName = trainName;

    }

    public int getTrainId() {
        return trainId;
    }

    public void setTrainId(int trainId) {
        this.trainId = trainId;
    }

    public String getTrainName() {
        return trainName;
    }

    public void setTrainName(String trainName) {
        this.trainName = trainName;


    }

    @Override
    public String toString() {
        return "ConstructorDemoTrain{" +
                "trainId=" + trainId +
                ", trainName='" + trainName + '\'' +
                '}';
    }
}
