package com.training.service;

import java.util.List;

import com.training.model.Employe;

public interface IEmployeService {

	void add(Employe emp);
	void delete(Employe emp);
	void update(Employe emp);
	List<Employe> findAll();
	Employe findOne(int id);
}
