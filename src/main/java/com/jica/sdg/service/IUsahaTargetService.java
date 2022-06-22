package com.jica.sdg.service;

import com.jica.sdg.model.UsahaTarget;

import java.util.List;
import java.util.Optional;

public interface IUsahaTargetService {

    List<UsahaTarget> findAll();
    
    List<UsahaTarget> findByYear(Integer id_nsa_indicator, Integer year);

    void saveTarget(UsahaTarget gov);
    
    Optional<UsahaTarget> findOne(Integer id);
    
    void deleteTarget(Integer id);
    
    void deleteByInd(Integer id);
    
//    void deleteByNsaInd(Integer id);
}
