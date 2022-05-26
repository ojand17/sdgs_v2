package com.jica.sdg.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jica.sdg.model.UsahaIndicator;
import com.jica.sdg.repository.UsahaIndicatorRepository;

@Service
public class UsahaIndicatorService implements IUsahaIndicatorService{
	
	@Autowired
	private UsahaIndicatorRepository nsaIndicatorRepo;

	@Override
	public List<UsahaIndicator> findAll(Integer id_program, Integer id_activity) {
		return (List<UsahaIndicator>) nsaIndicatorRepo.findAllIndicator(id_program, id_activity);
	}

	@Override
	public void saveIndicator(UsahaIndicator gov) {
		nsaIndicatorRepo.save(gov);
	}

	@Override
	public Optional<UsahaIndicator> findOne(Integer id) {
		return (Optional<UsahaIndicator>) nsaIndicatorRepo.findById(id);
	}

	@Override
	public void deleteIndicator(Integer id) {
		nsaIndicatorRepo.deleteById(id);
	}

	@Override
	public List findAllIndi(Integer id_program, Integer id_activity) {
		return nsaIndicatorRepo.findAllIndi(id_program, id_activity);
	}

	@Override
	public Integer countIndicator(Integer id_program, Integer id_activity) {
		return nsaIndicatorRepo.countIndicator(id_program, id_activity);
	}
}
