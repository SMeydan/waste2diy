package com.example.demo.controller;

import com.example.demo.entity.Image;
import com.example.demo.entity.Waste;
import com.example.demo.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.io.File;

@RestController
@RequestMapping(path="api/v1/images")
public class ImageController {

    @Autowired
    private ImageService imageService;

    @GetMapping
    public List<Image> getAllImages(){
        return imageService.getAllImages();
    }

    @PostMapping
    public Image createImage(@RequestBody Image image){
        return imageService.saveImage(image);
    }

    @GetMapping(path= "/id")
    public Image getImageById(Long id){
        return imageService.getImageById(id);
    }

    @DeleteMapping
    public String deleteImage(Long id){
        imageService.deleteImageById(id);
        return "Success";
    }

    @Value("${upload.path}")
    private String uploadPath;

    @PostMapping(path="/upload")
    public String uploadImage(@RequestParam("file")MultipartFile file)
    {
        if (file.isEmpty()){
            return "Needed to upload a file";
        }
        try{
            String fileName = file.getOriginalFilename();
            File destination = new File(uploadPath+fileName);
            file.transferTo(destination);
            
            Image image = new Image(
                    1,
                    String.valueOf(destination)
            );
            imageService.saveImage(image);
            return "Success";


        }catch(Exception e){
            return String.valueOf(e);
    }
    }
}
