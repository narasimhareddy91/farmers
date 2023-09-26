package com.agri.farmers.pestandfertilizer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PestandFertilizerRepository extends JpaRepository<PestandFertilizer, Integer> { 

}
