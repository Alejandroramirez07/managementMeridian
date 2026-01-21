package com.meridian.patterns.mvc2;

public class WarehouseController {
    private Warehouse model;
    private WarehouseView view;

    public WarehouseController(Warehouse model, WarehouseView view){
        this.model=model;
        this.view=view;
    }

    public void setWarehouseAddress(String address){
        model.setAddress(address);
    }

    public void warehouseUpdated(){
        view.showWarehouseDetails(model.getAddress(), model.getEmployees());
    }
}
