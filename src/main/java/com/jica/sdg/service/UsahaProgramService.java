package com.jica.sdg.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jica.sdg.model.UsahaProgram;
import com.jica.sdg.model.Pojkkategori;
import com.jica.sdg.model.Pojkkode;
import com.jica.sdg.repository.PojkKategoriRepository;
import com.jica.sdg.repository.PojkKodeRepository;
import com.jica.sdg.repository.UsahaProgramRepository;

@Service
public class UsahaProgramService implements IUsahaProgramService{
	
	@Autowired
	private UsahaProgramRepository nsaProgRepo;
	
	@Autowired
	private PojkKategoriRepository pojkKategoriRepo;
	
	@Autowired
	private PojkKodeRepository pojkKodeRepo;
	
	@Override
	public List<UsahaProgram> findAll() {
		return (List<UsahaProgram>) nsaProgRepo.findAll();
	}
	
	@Override
	public List<Pojkkategori> findAllPojkKategori() {
            return (List<Pojkkategori>) pojkKategoriRepo.findAllpojkkategori();
	}
	
	@Override
	public List<Pojkkode> findAllPojkKode(Integer idkategori) {
            return (List<Pojkkode>) pojkKodeRepo.findAllpojkkodebyIdkategori(idkategori);
	}
	
	@Override
	public Optional<Pojkkode> findAllPojkKodeById(Integer id) {
            return (Optional<Pojkkode>) pojkKodeRepo.findById(id);
	}
	
	@Override
	public void saveProgram(UsahaProgram gov) {
		nsaProgRepo.save(gov);
	}

	@Override
	public Optional<UsahaProgram> findOne(Integer id) {
		return (Optional<UsahaProgram>) nsaProgRepo.findById(id);
	}

	@Override
	public void deleteProgram(Integer id) {
		nsaProgRepo.deleteById(id);
	}

	@Override
	public List<UsahaProgram> findAllBy(String id_role, String id_monper) {
		return (List<UsahaProgram>) nsaProgRepo.findAll(id_role, id_monper);
	}

	@Override
	public List<UsahaProgram> findAllByMonperProv(Integer id_monper, String id_prov) {
		return (List<UsahaProgram>) nsaProgRepo.findAllByMonperProv(id_monper, id_prov);
	}

	@Override
	public void updateRole(Integer id_role, Integer id) {
		nsaProgRepo.UpdateRole(id_role, id);
	}
}
