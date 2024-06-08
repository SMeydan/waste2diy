package com.example.demo.service;

import com.example.demo.entity.Prediction;
import com.example.demo.repository.PredictionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PredictionService {
    @Autowired
    private PredictionRepository predictionRepository;

    public List<Prediction> getAllPrediction()
    {
        return predictionRepository.findAll();
    }
    public Prediction getPredictionById(Long id){return  predictionRepository.findById(id).orElse(null);}
    public Prediction savePrediction(Prediction prediction){return predictionRepository.save(prediction);}
    public void deletePrediction(Prediction prediction){predictionRepository.delete(prediction);}
    public void deletePredictionById(Long id){predictionRepository.deleteById(id);}
}
