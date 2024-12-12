package com.example.springbootLogistic_api.controller;

import com.example.springbootLogistic_api.entity.DeliveryAgent;
import com.example.springbootLogistic_api.service.DeliveryAgentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/delivery_agents")
public class DeliveryAgentController {

    @Autowired
    private DeliveryAgentService deliveryAgentService;

    @PostMapping
    public ResponseEntity<DeliveryAgent> addAgent(@RequestBody DeliveryAgent agent) {
        DeliveryAgent newAgent = deliveryAgentService.addAgent(agent);
        return ResponseEntity.ok(newAgent);
    }

    @GetMapping
    public ResponseEntity<List<DeliveryAgent>> getAllAgents() {
        List<DeliveryAgent> agents = deliveryAgentService.getAllAgents();
        return ResponseEntity.ok(agents);
    }

    @GetMapping("/{id}")
    public ResponseEntity<DeliveryAgent> getAgentById(@PathVariable int id) {
        DeliveryAgent agent = deliveryAgentService.getAgentById(id);
        if (agent != null) {
            return ResponseEntity.ok(agent);
        }
        return ResponseEntity.notFound().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<DeliveryAgent> updateAgent(@PathVariable int id, @RequestBody DeliveryAgent agentDetails) {
        DeliveryAgent updatedAgent = deliveryAgentService.updateAgent(id, agentDetails);
        if (updatedAgent != null) {
            return ResponseEntity.ok(updatedAgent);
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAgent(@PathVariable int id) {
        deliveryAgentService.deleteAgent(id);
        return ResponseEntity.noContent().build();
    }
}
