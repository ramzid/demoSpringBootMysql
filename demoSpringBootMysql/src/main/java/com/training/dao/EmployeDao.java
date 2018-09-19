package com.training.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.training.model.Employe;

import java.lang.String;
import java.util.List;

public interface EmployeDao extends JpaRepository<Employe, Integer>{
List<Employe> findByNom(String nom);
List<Employe> findByPrenom(String prenom);
}
