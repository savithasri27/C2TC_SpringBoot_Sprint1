package com.tnisf.Placement_Sprint.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tnsif.placement.entity.Placement;
import com.tnsif.placement.repository.PlacementRepository;

@Service
public class PlacementService {
	@Autowired
    private PlacementRepository placementRepository;

    // Get all placement records
    public List<Placement>listAll() {
        return placementRepository.findAll();
    }

    // Save a new placement record
    public void save(Placement placement) {
        placementRepository.save(placement);
    }

    // Get a placement by ID
    public Placement get(Integer id) {
       return placementRepository.findById(id).get();
    }

    // Delete a placement by ID
    public void delete(Integer id) {
        placementRepository.deleteById(id);
    }

    // Update an existing placement
    public void update( Placement s) {
    	placementRepository.save(s);
    }


}