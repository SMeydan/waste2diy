package com.example.demo.service;


import com.example.demo.entity.Waste;
import com.example.demo.repository.WasteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WasteService {
    @Autowired
    private com.example.demo.repository.WasteRepository WasteRepository;

    public List<Waste> getAllWaste()
    {
        return WasteRepository.findAll();
    }
    public Waste getWasteById(Long id){return  WasteRepository.findById(id).orElse(null);}
    public Waste saveWaste(Waste waste){return WasteRepository.save(waste);}
    public void deleteWaste(Waste waste){WasteRepository.delete(waste);}
    public void deleteWasteById(Long id){WasteRepository.deleteById(id);}
}