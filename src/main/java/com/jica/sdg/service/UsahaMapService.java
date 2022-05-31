package com.jica.sdg.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jica.sdg.model.NsaMap;
import com.jica.sdg.model.UsahaMap;
import com.jica.sdg.repository.UsahaMapRepository;

@Service
public class UsahaMapService implements IUsahaMapService{
	
	@Autowired
	private UsahaMapRepository repo;

	@Override
	public List<UsahaMap> findAll(String id) {
		return (List<UsahaMap>) repo.findAll();
	}

	@Override
	public void saveMap(UsahaMap sdg) {
		repo.save(sdg);
	}

	@Override
	public Optional<UsahaMap> findOne(Integer id) {
		return (Optional<UsahaMap>) repo.findById(id);
	}

	@Override
	public void deleteMap(Integer id) {
		repo.deleteById(id);
	}

	@Override
	public void deleteMapBySdgInd(String id) {
		repo.deleteBySdgInd(id);
	}

	@Override
	public List<UsahaMap> findAllBySdgInd(String id) {
		return (List<UsahaMap>) repo.findAll();
	}

	@Override
	public List<UsahaMap> findAllByInd(Integer id) {
		return (List<UsahaMap>) repo.getIdByInd(id);
	}

	@Override
	public void deleteMapByInd(Integer id) {
		repo.deleteByInd(id);
	}	
}
