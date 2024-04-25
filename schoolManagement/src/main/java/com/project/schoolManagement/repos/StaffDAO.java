package com.project.schoolManagement.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.schoolManagement.entity.StaffEntity;

public interface StaffDAO extends JpaRepository<StaffEntity, String> {

}
