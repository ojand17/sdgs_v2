package com.jica.sdg.service;

import com.jica.sdg.model.UsahaProgram;

import java.util.List;
import java.util.Optional;

public interface IUsahaProgramService {

    List<UsahaProgram> findAll();
    
    List<UsahaProgram> findAllBy(String id_role, String id_monper);
    
    List<UsahaProgram> findAllByMonperProv(Integer id_monper, String id_prov);

    void saveProgram(UsahaProgram gov);
    
    Optional<UsahaProgram> findOne(Integer id);
    
    void deleteProgram(Integer id);
    
    void updateRole(Integer id_role, Integer id);
}
