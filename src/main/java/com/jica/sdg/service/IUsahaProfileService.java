package com.jica.sdg.service;

import com.jica.sdg.model.Role;
import com.jica.sdg.model.Usahaprofile;

import java.util.List;

public interface IUsahaProfileService {

    List<Usahaprofile> findAll();
    
    List<Usahaprofile> findId(Integer id);
    
    List<Role> findIdProv(String id);

    void saveNsaProfil(Usahaprofile ins);
    
    List<Role> findRoleNsa();
    List<Role> findRoleAll();
    List<Role> findRoleGov();
    List<Role> findNsaAllProvince();
//    
    void deleteNsaProfil(Integer id);
}
