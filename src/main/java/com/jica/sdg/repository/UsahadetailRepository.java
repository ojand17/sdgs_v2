package com.jica.sdg.repository;

import com.jica.sdg.model.Usahadetail;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.repository.query.Param;

public interface UsahadetailRepository extends CrudRepository<Usahadetail, Long> {

    @Query(value = "select * from usaha_detail where id_role = :id ",nativeQuery = true)
    public List<Usahadetail> findId(@Param("id") String id);

    @Query(value = "select * from usaha_detail where id_usaha = :id ",nativeQuery = true)
    public List<Usahadetail> findIdNsa(@Param("id") String id);
    
    @Transactional
    @Modifying(clearAutomatically = true)
    @Query(value = "delete from usaha_detail where id_usaha = :id ",nativeQuery = true)
    void deleteIdNsa(@Param("id") Integer id);

}
