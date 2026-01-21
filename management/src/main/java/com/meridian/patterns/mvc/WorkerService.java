package com.meridian.patterns.mvc;

public class WorkerService {
    private WorkerMapper workerMapper;

    public Worker getWorkerById(Long id){
        return workerMapper.getWorker(id);
    }
}
