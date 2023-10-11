package com.mobilemodel.serviceimpl;



import com.mobilemodel.entity.Model;
import com.mobilemodel.repository.ModelRepository;
import com.mobilemodel.service.ModelService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ModelServiceImpl implements ModelService {
    private final ModelRepository modelRepository;

    @Autowired
    public ModelServiceImpl(ModelRepository modelRepository) {
        this.modelRepository = modelRepository;
    }

    @Override
    public List<Model> getAllModels() {
        return modelRepository.findAll();
    }

    @Override
    public Model getModelById(Long modelId) {
        Optional<Model> model = modelRepository.findById(modelId);
        return model.orElse(null);
    }

    @Override
    public Model createModel(Model model) {
        return modelRepository.save(model);
    }

    @Override
    public Model updateModel(Long modelId, Model model) {
        if (modelRepository.existsById(modelId)) {
            model.setModelId(modelId);
            return modelRepository.save(model);
        }
        return null; // Handle this as needed, e.g., return a meaningful error response.
    }

    @Override
    public void deleteModel(Long modelId) {
        modelRepository.deleteById(modelId);
    }
}
