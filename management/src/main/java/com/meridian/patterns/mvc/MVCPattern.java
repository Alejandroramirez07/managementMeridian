package com.meridian.patterns.mvc;

public class MVCPattern {
    public static void main(String[] args){
        Worker model =new Worker();
        model.setJobId("2");
        model.setName("John");
        model.setExperience(5);

        WorkerView view = new WorkerView();

        WorkerController controller = new WorkerController(model, view);

        controller.setWorkerName("Shaquille");

        controller.updateView();
    }
}
