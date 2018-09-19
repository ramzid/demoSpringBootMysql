package com.training.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.training.dao.EmployeDao;
import com.training.model.Employe;

@Service
@Transactional
public class EmployeService implements IEmployeService{

	@Autowired
	EmployeDao  employedao;
	
	@Override
	public void add(Employe emp) {
		// TODO Auto-generated method stub
		employedao.save(emp);
	}

	@Override
	public void delete(Employe emp) {
		// TODO Auto-generated method stub
		employedao.delete(emp);
	}

	@Override
	public List<Employe> findAll() {
		// TODO Auto-generated method stub
		return employedao.findAll();
	}

	@Override
	public void update(Employe emp) {
		// TODO Auto-generated method stub
		if(findOne(emp.getId())!=null)
			employedao.save(emp);
	}

	@Override
	public Employe findOne(int id) {
		// TODO Auto-generated method stub
		return employedao.getOne(id);
	}

}
