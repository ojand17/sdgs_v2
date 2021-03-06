package com.jica.sdg.service;

import com.jica.sdg.model.Provinsi;

import java.util.List;
import java.util.Optional;

public interface IProvinsiService {

    List<Provinsi> findAllProvinsi();
    
    List<Provinsi> findAllProvinsiExcIndo();
    
    Optional<Provinsi> findOne(String id);

}
