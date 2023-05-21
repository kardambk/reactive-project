package com.kardam.testproject.dao;

import com.kardam.testproject.dto.ResourceDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResourceRepository extends JpaRepository<ResourceDTO, Integer> {

}