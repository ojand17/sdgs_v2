package com.jica.sdg.repository;

import com.jica.sdg.model.RefKodeUsaha;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.query.Param;
import java.util.List;


@Repository
public interface RefKodeUsahaRepository extends CrudRepository<RefKodeUsaha, Integer> {
    
    @Query(value = "select * from ref_kode_usaha where kode_usaha = :kode_usaha limit 1 ",nativeQuery = true)
    public List<RefKodeUsaha> findByKode(@Param("kode_usaha") String kode_usaha);
    
}
