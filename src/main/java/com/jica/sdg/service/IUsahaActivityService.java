package com.jica.sdg.service;

import com.jica.sdg.model.UsahaActivity;

import java.util.List;
import java.util.Optional;

public interface IUsahaActivityService {

    List<UsahaActivity> findAll(Integer id, Integer id_role);
    
    List<UsahaActivity> findAll(Integer id);

    void saveActivity(UsahaActivity gov);
    
    Optional<UsahaActivity> findOne(Integer id);
    
    void deleteActivity(Integer id);
    
    void updateRole(Integer id_role, Integer id);
    
    Integer countActivity(Integer id);
}
