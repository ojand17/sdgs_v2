package com.jica.sdg.service;

import com.jica.sdg.model.Usahadetail;

import java.util.List;

public interface IUsahaDetailService {

    List<Usahadetail> findAll();
    
    List<Usahadetail> findId(String id);
    List<Usahadetail> findIdNsa(String id);

    void saveNsaDetail(Usahadetail ins);

    void deleteIdNsa(Integer id);
    
    void deleteNsaDetail(Long id);
}
