package com.jica.sdg.service;

import com.jica.sdg.model.UsahaFunding;

import java.util.List;
import java.util.Optional;

public interface IUsahaFundingService {

    List<UsahaFunding> findAll();
    
    List<UsahaFunding> findByMon(Integer id_nsa_indicator, Integer id_monper);

    void saveFunding(UsahaFunding gov);
    
    Optional<UsahaFunding> findOne(Integer id);
    
    void deleteFunding(Integer id);
    
    void deleteByInd(Integer id_nsa_indicator, Integer id_monper);
}
