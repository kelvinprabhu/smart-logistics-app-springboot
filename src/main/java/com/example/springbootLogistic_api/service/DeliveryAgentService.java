package com.example.springbootLogistic_api.service;

import com.example.springbootLogistic_api.entity.DeliveryAgent;
import com.example.springbootLogistic_api.repository.DeliveryAgentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeliveryAgentService {

    @Autowired
    private DeliveryAgentRepository deliveryAgentRepository;

    public DeliveryAgent addAgent(DeliveryAgent agent) {
        return deliveryAgentRepository.save(agent);
    }

    public List<DeliveryAgent> getAllAgents() {
        return deliveryAgentRepository.findAll();
    }

    public DeliveryAgent getAgentById(int id) {
        return deliveryAgentRepository.findById(id).orElse(null);
    }

    public DeliveryAgent updateAgent(int id, DeliveryAgent agentDetails) {
        DeliveryAgent agent = deliveryAgentRepository.findById(id).orElse(null);
        if (agent != null) {
            agent.setName(agentDetails.getName());
            agent.setPhone(agentDetails.getPhone());
            agent.setAssignedRoute(agentDetails.getAssignedRoute());
            return deliveryAgentRepository.save(agent);
        }
        return null;
    }

    public void deleteAgent(int id) {
        deliveryAgentRepository.deleteById(id);
    }
}
