package com.agri.farmers.farmer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FarmersRepository extends JpaRepository<Farmers, Integer> { 

}
