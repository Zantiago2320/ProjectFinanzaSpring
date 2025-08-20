package com.app.financeManagement.Controller;

import com.app.financeManagement.DTO.SavingPlanDTO;
import com.app.financeManagement.Service.SavingPlanService;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/savingplans")
public class SavingPlanServiceController {

    //private final SavingPlanService savingPlanService;

    @Autowired
    SavingPlanService savingPlanService;

    /*public SavingPlanServiceController(SavingPlanService savingPlanService) {
        this.savingPlanService = savingPlanService;
    }*/

    // Endpoint to get all saving plans / Punto final para obtener todos los planes de ahorro
    @GetMapping("/all")
    public ResponseEntity<List<SavingPlanDTO>> getAllSavingPlans() {
        List<SavingPlanDTO> plans = savingPlanService.getAllSavingPlans();
        return ResponseEntity.ok(plans);
    }

    // Endpoint to create a new saving plan / Punto final para crear un nuevo plan de ahorro
    @PostMapping("/create")
    public ResponseEntity<SavingPlanDTO> createSavingPlan(@Validated @RequestBody SavingPlanDTO planDTO) {
        SavingPlanDTO createdPlan = savingPlanService.createSavingPlan(planDTO);
        return ResponseEntity.ok(createdPlan);
    }

    // Endpoint to get a saving plan by ID / Punto final para obtener un plan de ahorro por ID
    @GetMapping("/{id}")
    public ResponseEntity<SavingPlanDTO> getSavingPlanById(@PathVariable long id) {
        SavingPlanDTO plan = savingPlanService.getSavingPlanById(id);
        return ResponseEntity.ok(plan);
    }

    // Endpoint to update a saving plan / Punto final para actualizar un plan de ahorro
    @PutMapping("/update/{id}")
    public ResponseEntity<SavingPlanDTO> updateSavingPlan(@PathVariable long id, @Validated @RequestBody SavingPlanDTO planDTO) {
        SavingPlanDTO updatedPlan = savingPlanService.updateSavingPlan(id, planDTO);
        return ResponseEntity.ok(updatedPlan);
    }

    // Endpoint to delete a saving plan / Punto final para eliminar un plan de ahorro
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteSavingPlan(@PathVariable long id) {
        savingPlanService.deleteSavingPlan(id);
        return ResponseEntity.noContent().build();
    }
}
