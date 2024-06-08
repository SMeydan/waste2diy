package com.example.demo.service;

import com.example.demo.entity.Image;
import com.example.demo.repository.ImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImageService {
    @Autowired
    private ImageRepository imageRepository;

    public List<Image> getAllImages()
{
    return imageRepository.findAll();
}
    public Image getImageById(Long id){return  imageRepository.findById(id).orElse(null);}
    public Image saveImage(Image image){return imageRepository.save(image);}
    public void deleteImage(Image image){imageRepository.delete(image);}
    public void deleteImageById(Long id){imageRepository.deleteById(id);}
}
