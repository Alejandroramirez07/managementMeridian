package com.meridian.patterns.mvc2;

public class MVCPatternWarehouse {
    public static void main (String[] args){
        Warehouse model = new Warehouse("Mn St 45-34", 5);

        WarehouseView view = new WarehouseView();

        WarehouseController controller = new WarehouseController(model, view);

        controller.warehouseUpdated();

        controller.setWarehouseAddress("Bvd 23, 6-5");

        controller.warehouseUpdated();
    }
}
