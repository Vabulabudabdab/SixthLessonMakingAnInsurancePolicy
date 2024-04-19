package com.msaggik.sixthlessonmakinganinsurancepolicy;

import java.io.Serializable;

public class InsurancePolicy implements Serializable {
    // поля
    private int ID; // идентификатор
    private String DeparturePoint; // место отправки
    private String inputTimeArrive; //  время прибытия
    private String sentTime; // время отправки

    //  конструктор
    public InsurancePolicy(int ID, String DeparturePoint, String inputTimeArrive, String sentTime) {
        this.ID = ID;
        this.DeparturePoint = DeparturePoint;// место отправки
        this.inputTimeArrive = inputTimeArrive;//  время прибытия
        this.sentTime = sentTime;// время отправки
    }

    // геттеры и сеттеры
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getDeparturePoint() {
        return DeparturePoint;
    }

    public void setDeparturePoint(String DeparturePoint) {
        this.DeparturePoint = DeparturePoint;
    }

    public String getTimeArrive() {
        return inputTimeArrive;
    }

    public void setTimeArrive(String inputTimeArrive) {
        this.inputTimeArrive = inputTimeArrive;
    }

    public String getsentTime() {
        return sentTime;
    }

    public void setsentTime(String sentTime) {
        this.sentTime = sentTime;
    }
}
