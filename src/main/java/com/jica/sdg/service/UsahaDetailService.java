package com.jica.sdg.service;

import com.jica.sdg.model.Usahadetail;
import com.jica.sdg.repository.UsahadetailRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsahaDetailService implements IUsahaDetailService{
	
	@Autowired
	private UsahadetailRepository nsaDetailRepo;
	
	@Override
	public List<Usahadetail> findAll() {
		return (List<Usahadetail>) nsaDetailRepo.findAll();
	}
	
	@Override
	public List<Usahadetail> findId(String id) {
		return (List<Usahadetail>) nsaDetailRepo.findId(id);
	}
	
	@Override
	public List<Usahadetail> findIdNsa(String id) {
		return (List<Usahadetail>) nsaDetailRepo.findIdNsa(id);
	}
	
	@Override
	public void saveNsaDetail(Usahadetail nsa) {
		nsaDetailRepo.save(nsa);
	}
        
	@Override
	public void deleteIdNsa(Integer id) {
		nsaDetailRepo.deleteIdNsa(id);
	}
       
	@Override
	public void deleteNsaDetail(Long id) {
		nsaDetailRepo.deleteById(id);
	}
        
}
