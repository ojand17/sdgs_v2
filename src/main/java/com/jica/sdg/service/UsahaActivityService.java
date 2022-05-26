package com.jica.sdg.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jica.sdg.model.UsahaActivity;
import com.jica.sdg.repository.UsahaActivityRepository;

@Service
public class UsahaActivityService implements IUsahaActivityService{
	
	@Autowired
	private UsahaActivityRepository nsaActivityRepo;
	
	@Override
	public List<UsahaActivity> findAll(Integer id_program, Integer id_role) {
		return (List<UsahaActivity>) nsaActivityRepo.findAllGovActivity(id_program,id_role);
	}
	
	@Override
	public List<UsahaActivity> findAll(Integer id_program) {
		return (List<UsahaActivity>) nsaActivityRepo.findAllGovActivity(id_program);
	}
	
	public void saveActivity(UsahaActivity gov) {
		nsaActivityRepo.save(gov);
	}

	@Override
	public Optional<UsahaActivity> findOne(Integer id) {
		return (Optional<UsahaActivity>) nsaActivityRepo.findById(id);
	}

	@Override
	public void deleteActivity(Integer id) {
		nsaActivityRepo.deleteById(id);
	}

	@Override
	public void updateRole(Integer id_role, Integer id) {
		nsaActivityRepo.UpdateRole(id_role, id);
	}

	@Override
	public Integer countActivity(Integer id) {
		return nsaActivityRepo.countActivity(id);
	}
}
