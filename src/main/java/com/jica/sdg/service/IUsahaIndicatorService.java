package com.jica.sdg.service;

import com.jica.sdg.model.UsahaIndicator;

import java.util.List;
import java.util.Optional;

public interface IUsahaIndicatorService {

    List<UsahaIndicator> findAll(Integer id_program, Integer id_activity);
    
    List findAllIndi(Integer id_program, Integer id_activity);

    void saveIndicator(UsahaIndicator gov);
    
    Optional<UsahaIndicator> findOne(Integer id);
    
    void deleteIndicator(Integer id);
    
    Integer countIndicator(Integer id_program, Integer id_activity);
}
