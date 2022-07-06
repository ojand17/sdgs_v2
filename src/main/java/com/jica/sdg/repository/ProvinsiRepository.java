package com.jica.sdg.repository;

import com.jica.sdg.model.Provinsi;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProvinsiRepository extends CrudRepository<Provinsi, String> {

    @Query(value = "select * from ref_province ORDER BY FIELD(nm_prov,'Indonesia') desc, nm_prov", nativeQuery = true)
    List<Provinsi> findAllProvinsi();
    
    @Query(value = "select * from ref_province where id_prov != '000' ORDER BY FIELD(nm_prov,'Indonesia') desc, nm_prov", nativeQuery = true)
    List<Provinsi> findAllProvinsiExcIndo();

}
