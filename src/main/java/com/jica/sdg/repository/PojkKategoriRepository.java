package com.jica.sdg.repository;

import com.jica.sdg.model.Pojkkategori;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface PojkKategoriRepository extends CrudRepository<Pojkkategori, Integer> {

    @Query(value = "select * from pojk_kategori order by id ",nativeQuery = true)
    public List<Pojkkategori> findAllpojkkategori();
    
}
