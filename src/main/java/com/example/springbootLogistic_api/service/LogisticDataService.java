package com.example.springbootLogistic_api.service;

import com.example.springbootLogistic_api.entity.LogisticData;
import com.example.springbootLogistic_api.repository.LogisticDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LogisticDataService {
    @Autowired
    private LogisticDataRepository repository;

    // Create or Update
    public LogisticData saveLogisticData(LogisticData logisticData) {
        return repository.save(logisticData);
    }

    // Read All
    public List<LogisticData> getAllLogisticData() {
        return repository.findAll();
    }

    // Read by ID
    public LogisticData getLogisticDataById(int id) {
        return repository.findById(id).orElse(null);
    }

    // Delete
    public void deleteLogisticData(int id) {
        repository.deleteById(id);
    }
}
