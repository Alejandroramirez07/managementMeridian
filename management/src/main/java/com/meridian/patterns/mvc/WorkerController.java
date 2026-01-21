package com.meridian.patterns.mvc;

public class WorkerController {
    private Worker model;
    private WorkerView view;


    public WorkerController(Worker model, WorkerView view){
        this.model=model;
        this.view=view;
    }

    // to change worker´s name
    public void setWorkerName(String name){
        model.setName(name);
    }

    public void updateView() {
        view.showWorkerDetails(model.getJobId(), model.getName(), model.getExperience());
    }
}
