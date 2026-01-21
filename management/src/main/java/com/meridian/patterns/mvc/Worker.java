package com.meridian.patterns.mvc;

public class Worker {
    private String jobId;
    private String name;
    private int experience;

    public Worker(){}

    public Worker(String jobId, String name, int experience){
        this.jobId=jobId;
        this.name=name;
        this.experience=experience;
    }

    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience){
        this.experience=experience;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "jobId='" + jobId + '\'' +
                ", name='" + name + '\'' +
                ", experience=" + experience +
                '}';
    }
}
