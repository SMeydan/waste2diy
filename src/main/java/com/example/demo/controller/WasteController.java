package com.example.demo.controller;

import com.example.demo.entity.Waste;
import com.example.demo.service.WasteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="api/v1/waste")
public class WasteController {
    @Autowired
    private WasteService wasteService;

    @GetMapping
    public List<Waste> getAllWaste(){
        return wasteService.getAllWaste();
    }

    @PostMapping
    public Waste createWaste(@RequestBody Waste waste){
        return wasteService.saveWaste(waste);
    }

    @GetMapping(path= "/id")
    public Waste getWasteById(Long id){
        return wasteService.getWasteById(id);
    }

    @DeleteMapping
    public String deleteImage(Long id){
        wasteService.deleteWasteById(id);
        return "Success";
    }

}
