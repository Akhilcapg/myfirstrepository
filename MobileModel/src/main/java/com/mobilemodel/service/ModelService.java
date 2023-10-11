package com.mobilemodel.service;

import com.mobilemodel.entity.Model;

import java.util.List;

public interface ModelService {
    List<Model> getAllModels();

    Model getModelById(Long modelId);

    Model createModel(Model model);

    Model updateModel(Long modelId, Model model);

    void deleteModel(Long modelId);
}
