package com.jica.sdg.service;

import com.jica.sdg.model.RefBadanHukum;
import com.jica.sdg.model.RefBidangUsaha;
import com.jica.sdg.model.RefKatUsaha;
import com.jica.sdg.model.RefKodeUsaha;
import com.jica.sdg.model.RefSkalaUsaha;
import com.jica.sdg.model.Role;
import com.jica.sdg.model.Usahaprofile;

import java.util.List;

public interface IUsahaProfileService {

    List<Usahaprofile> findAll();

    List<RefSkalaUsaha> findAllSkalaUsaha();
    List<RefBidangUsaha> findAllBidangUsaha();
    List<RefKatUsaha> findAllKatUsaha();
    List<RefBadanHukum> findAllBadanHukum();
    List<RefKodeUsaha> findAllKodeUsaha();
    
    List<RefKodeUsaha> findNamaKodeUsahaByKode(String kode_usaha);
    
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
