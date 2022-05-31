package com.jica.sdg.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jica.sdg.model.UsahaFunding;
import com.jica.sdg.repository.UsahaFundingRepository;

@Service
public class UsahaFundingService implements IUsahaFundingService{
	
	@Autowired
	private UsahaFundingRepository repo;

	@Override
	public List<UsahaFunding> findAll() {
		return (List<UsahaFunding>) repo.findAll();
	}

	@Override
	public void saveFunding(UsahaFunding sdg) {
		repo.save(sdg);
	}

	@Override
	public Optional<UsahaFunding> findOne(Integer id) {
		return (Optional<UsahaFunding>) repo.findById(id);
	}

	@Override
	public void deleteFunding(Integer id) {
		repo.deleteById(id);
	}

	@Override
	public void deleteByInd(Integer id_nsa_indicator, Integer id_monper) {
		repo.deleteByInd(id_nsa_indicator, id_monper);
	}

	@Override
	public List<UsahaFunding> findByMon(Integer id_nsa_indicator, Integer id_monper) {
		return (List<UsahaFunding>) repo.findByMon(id_nsa_indicator, id_monper);
	}
	
	
}
