package com.example.demo.controller;

import com.example.demo.entity.Prediction;
import com.example.demo.service.PredictionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="api/v1/prediction")
public class PredictionController {
    @Autowired
    private PredictionService predictionService;

    @GetMapping
    public List<Prediction> getAllPrediction(){
        return predictionService.getAllPrediction();
    }

    @PostMapping
    public Prediction createPrediction(@RequestBody Prediction prediction){
        return predictionService.savePrediction(prediction);
    }

    @GetMapping(path= "/id")
    public Prediction getPredictionById(Long id){
        return predictionService.getPredictionById(id);
    }

    @DeleteMapping
    public String deleteImage(Long id){
        predictionService.deletePredictionById(id);
        return "Success";
    }

}
