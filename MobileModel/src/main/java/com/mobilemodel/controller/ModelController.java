package com.mobilemodel.controller;

import com.mobilemodel.entity.Model;
import com.mobilemodel.service.ModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/models")
public class ModelController {
    private final ModelService modelService;

    @Autowired
    public ModelController(ModelService modelService) {
        this.modelService = modelService;
    }

    @GetMapping
    public List<Model> getAllModels() {
        return modelService.getAllModels();
    }

    @GetMapping("/{modelId}")
    public Model getModelById(@PathVariable Long modelId) {
        return modelService.getModelById(modelId);
    }

    @PostMapping
    public Model createModel(@Valid @RequestBody Model model) {
        return modelService.createModel(model);
    }

    @PutMapping("/{modelId}")
    public Model updateModel(@Valid @PathVariable Long modelId, @RequestBody Model model) {
        return modelService.updateModel(modelId, model);
    }

    @DeleteMapping("/{modelId}")
    public void deleteModel(@PathVariable Long modelId) {
        modelService.deleteModel(modelId);
    }
}
