package com.project.schoolManagement.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.project.schoolManagement.entity.PayRollEntity;


public interface PayRollDAO extends JpaRepository<PayRollEntity,Integer>{
	
	@Query(value="Select * from Staff where Class=:Class and Section=:Section and Year=:Year" ,nativeQuery = true)
	List<PayRollEntity> findAllByPayRoll(@Param("Class") String Class,@Param("Section") String Section,@Param("Year") int Year);

}
