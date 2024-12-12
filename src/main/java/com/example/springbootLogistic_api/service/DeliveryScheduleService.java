package com.example.springbootLogistic_api.service;

import com.example.springbootLogistic_api.entity.DeliverySchedule;
import com.example.springbootLogistic_api.repository.DeliveryScheduleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeliveryScheduleService {

    @Autowired
    private DeliveryScheduleRepository deliveryScheduleRepository;

    public DeliverySchedule addSchedule(DeliverySchedule schedule) {
        return deliveryScheduleRepository.save(schedule);
    }

    public List<DeliverySchedule> getAllSchedules() {
        return deliveryScheduleRepository.findAll();
    }

    public DeliverySchedule getScheduleById(int id) {
        return deliveryScheduleRepository.findById(id).orElse(null);
    }

    public DeliverySchedule updateSchedule(int id, DeliverySchedule scheduleDetails) {
        DeliverySchedule schedule = deliveryScheduleRepository.findById(id).orElse(null);
        if (schedule != null) {
            schedule.setOrder(scheduleDetails.getOrder());
            schedule.setAgent(scheduleDetails.getAgent());
            schedule.setExpectedDeliveryDate(scheduleDetails.getExpectedDeliveryDate());
            schedule.setStatus(scheduleDetails.getStatus());
            return deliveryScheduleRepository.save(schedule);
        }
        return null;
    }

    public void deleteSchedule(int id) {
        deliveryScheduleRepository.deleteById(id);
    }
}
