package com.example.springbootLogistic_api.controller;

import com.example.springbootLogistic_api.entity.DeliverySchedule;
import com.example.springbootLogistic_api.service.DeliveryScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/delivery_schedule")
public class DeliveryScheduleController {

    @Autowired
    private DeliveryScheduleService deliveryScheduleService;

    @PostMapping
    public ResponseEntity<DeliverySchedule> addSchedule(@RequestBody DeliverySchedule schedule) {
        DeliverySchedule newSchedule = deliveryScheduleService.addSchedule(schedule);
        return ResponseEntity.ok(newSchedule);
    }

    @GetMapping
    public ResponseEntity<List<DeliverySchedule>> getAllSchedules() {
        List<DeliverySchedule> schedules = deliveryScheduleService.getAllSchedules();
        return ResponseEntity.ok(schedules);
    }

    @GetMapping("/{id}")
    public ResponseEntity<DeliverySchedule> getScheduleById(@PathVariable int id) {
        DeliverySchedule schedule = deliveryScheduleService.getScheduleById(id);
        if (schedule != null) {
            return ResponseEntity.ok(schedule);
        }
        return ResponseEntity.notFound().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<DeliverySchedule> updateSchedule(@PathVariable int id,
            @RequestBody DeliverySchedule scheduleDetails) {
        DeliverySchedule updatedSchedule = deliveryScheduleService.updateSchedule(id, scheduleDetails);
        if (updatedSchedule != null) {
            return ResponseEntity.ok(updatedSchedule);
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSchedule(@PathVariable int id) {
        deliveryScheduleService.deleteSchedule(id);
        return ResponseEntity.noContent().build();
    }
}
