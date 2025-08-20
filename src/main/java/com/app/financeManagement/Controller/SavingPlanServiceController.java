package com.app.financeManagement.Controller;

import com.app.financeManagement.DTO.SavinPlanDTO;
import com.app.financeManagement.Service.SavingPlanService;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/savingplans")
public class SavingPlanServiceController {

    private final SavingPlanService savingPlanService;

    public SavingPlanServiceController(SavingPlanService savingPlanService) {
        this.savingPlanService = savingPlanService;
    }

    // Endpoint to get all saving plans / Punto final para obtener todos los planes de ahorro
    @GetMapping("/all")
    public ResponseEntity<List<SavinPlanDTO>> getAllSavingPlans() {
        List<SavinPlanDTO> plans = savingPlanService.getAllSavingPlans();
        return ResponseEntity.ok(plans);
    }

    // Endpoint to create a new saving plan / Punto final para crear un nuevo plan de ahorro
    @PostMapping("/create")
    public ResponseEntity<SavinPlanDTO> createSavingPlan(@Validated @RequestBody SavinPlanDTO planDTO) {
        SavinPlanDTO createdPlan = savingPlanService.createSavingPlan(planDTO);
        return ResponseEntity.ok(createdPlan);
    }

    // Endpoint to get a saving plan by ID / Punto final para obtener un plan de ahorro por ID
    @GetMapping("/{id}")
    public ResponseEntity<SavinPlanDTO> getSavingPlanById(@PathVariable long id) {
        SavinPlanDTO plan = savingPlanService.getSavingPlanById(id);
        return ResponseEntity.ok(plan);
    }

    // Endpoint to update a saving plan / Punto final para actualizar un plan de ahorro
    @PutMapping("/update/{id}")
    public ResponseEntity<SavinPlanDTO> updateSavingPlan(@PathVariable long id, @Validated @RequestBody SavinPlanDTO planDTO) {
        SavinPlanDTO updatedPlan = savingPlanService.updateSavingPlan(id, planDTO);
        return ResponseEntity.ok(updatedPlan);
    }

    // Endpoint to delete a saving plan / Punto final para eliminar un plan de ahorro
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteSavingPlan(@PathVariable long id) {
        savingPlanService.deleteSavingPlan(id);
        return ResponseEntity.noContent().build();
    }
}
