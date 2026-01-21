package com.meridian.patterns.mvc2;

public class Warehouse {
    private String address;
    private int employees;

    public Warehouse(){}

    public Warehouse(String address, int employees){
        this.address=address;
        this.employees=employees;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getEmployees() {
        return employees;
    }

    public void setEmployees(int employees) {
        this.employees = employees;
    }
}
