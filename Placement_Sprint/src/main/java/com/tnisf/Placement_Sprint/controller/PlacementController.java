package com.tnisf.Placement_Sprint.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tnsif.placement.entity.Placement;
import com.tnsif.placement.service.PlacementService;

import jakarta.persistence.NoResultException;

@RestController
public class PlacementController {
    @Autowired
    private PlacementService s;
    @GetMapping("/PlacementService")
    public List<Placement> listAll() {
        return s.listAll();
    }

    @PostMapping("//PlacementService")
	public void add(@RequestBody Placement s1) {
		s.save(s1);
	}

    @GetMapping("/PlacementService/{id}")
    public ResponseEntity<Placement> get(@PathVariable Integer id) {
        try {
            Placement placement = s.get(id);
            return new ResponseEntity<>(placement, HttpStatus.OK);
        } catch (NoResultException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/PlacementService/{id}")
    public ResponseEntity<Placement> update(@PathVariable Integer id, @RequestBody Placement updatedPlacement) {
        try {
            Placement existingPlacement = s.get(id);

            existingPlacement.setStudentName(updatedPlacement.getStudentName());
            existingPlacement.setStudentDepartment(updatedPlacement.getStudentDepartment());
            existingPlacement.setCompanyName(updatedPlacement.getCompanyName());
            existingPlacement.setJobRole(updatedPlacement.getJobRole());
            existingPlacement.setPlacementStatus(updatedPlacement.getPlacementStatus());

            s.update(existingPlacement);
            return new ResponseEntity<>(existingPlacement, HttpStatus.OK);
        } catch (NoResultException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        s.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
