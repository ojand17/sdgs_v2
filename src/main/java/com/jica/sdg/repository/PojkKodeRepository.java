package com.jica.sdg.repository;

import com.jica.sdg.model.Pojkkode;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface PojkKodeRepository extends CrudRepository<Pojkkode, Integer> {

    @Query(value = "select * from pojk_kode where idkategori = :idkategori order by id ",nativeQuery = true)
    public List<Pojkkode> findAllpojkkodebyIdkategori(@Param("idkategori") Integer idkategori);

    @Query(value = "select * from pojk_kode where id = :id limit 1 ",nativeQuery = true)
    public List<Pojkkode> findAllpojkkodebyId(@Param("id") Integer id);
    
}
