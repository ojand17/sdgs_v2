package com.jica.sdg.service;

import com.jica.sdg.model.UsahaMap;

import java.util.List;
import java.util.Optional;

public interface IUsahaMapService {

    List<UsahaMap> findAll(String id);
    
    List<UsahaMap> findAllBySdgInd(String id);
    
    List<UsahaMap> findAllByInd(Integer id);

    void saveMap(UsahaMap sdg);
    
    Optional<UsahaMap> findOne(Integer id);
    
    void deleteMap(Integer id);
    
    void deleteMapBySdgInd(String id);
    
    void deleteMapByInd(Integer id);
}
