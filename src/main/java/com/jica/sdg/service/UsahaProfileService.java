package com.jica.sdg.service;

import com.jica.sdg.model.Role;
import com.jica.sdg.model.Usahaprofile;
import com.jica.sdg.repository.RoleRepository;
import com.jica.sdg.repository.UsahaprofileRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsahaProfileService implements IUsahaProfileService{
	
	@Autowired
	private UsahaprofileRepository nsaProfileRepo;
	
	@Autowired
	private RoleRepository nsaRoleRepo;
	
	@Override
	public List<Usahaprofile> findAll() {
		return (List<Usahaprofile>) nsaProfileRepo.findAll();
	}
	
	@Override
	public List<Usahaprofile> findId(Integer id) {
		return (List<Usahaprofile>) nsaProfileRepo.findId(id);
	}
	
	@Override
	public void saveNsaProfil(Usahaprofile nsa) {
		nsaProfileRepo.save(nsa);
	}

	@Override
	public List<Role> findRoleNsa() {
            return (List<Role>) nsaRoleRepo.findRoleNsa();
	}
        
	@Override
	public List<Role> findRoleAll() {
            return (List<Role>) nsaRoleRepo.findRoleCor();
	}
	@Override
	public List<Role> findRoleGov() {
            return (List<Role>) nsaRoleRepo.findRoleGov();
	}
//        
        @Override
	public void deleteNsaProfil(Integer id_nsa) {
		nsaProfileRepo.deleteById(id_nsa);
	}

		@Override
		public List<Role> findIdProv(String id) {
			// TODO Auto-generated method stub
			return (List<Role>) nsaRoleRepo.findNsaByProvince(id);
		}

		@Override
		public List<Role> findNsaAllProvince() {
			return (List<Role>) nsaRoleRepo.findNsaAllProvince();
		}
        
}
