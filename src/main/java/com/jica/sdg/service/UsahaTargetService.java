package com.jica.sdg.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jica.sdg.model.UsahaTarget;
import com.jica.sdg.repository.UsahaTargetRepository;

@Service
public class UsahaTargetService implements IUsahaTargetService{
	
	@Autowired
	private UsahaTargetRepository repo;

	@Override
	public List<UsahaTarget> findAll() {
		return (List<UsahaTarget>) repo.findAll();
	}

	@Override
	public void saveTarget(UsahaTarget sdg) {
		repo.save(sdg);
	}

	@Override
	public Optional<UsahaTarget> findOne(Integer id) {
		return (Optional<UsahaTarget>) repo.findById(id);
	}

	@Override
	public void deleteTarget(Integer id) {
		repo.deleteById(id);
	}

	@Override
	public void deleteByInd(Integer id) {
		repo.deleteByInd(id);
	}

	@Override
	public List<UsahaTarget> findByYear(Integer id_nsa_indicator, Integer year) {
		return (List<UsahaTarget>) repo.findByYear(id_nsa_indicator, year);
	}
	
	
}
