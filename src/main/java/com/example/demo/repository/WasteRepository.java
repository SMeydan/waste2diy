package com.example.demo.repository;

import com.example.demo.entity.Waste;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WasteRepository extends JpaRepository<Waste,Long>
{

}
