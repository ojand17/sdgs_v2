package com.jica.sdg.repository;

import com.jica.sdg.model.UsahaTarget;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface UsahaTargetRepository extends CrudRepository<UsahaTarget, Integer> { 
	
	@Transactional
    @Modifying(clearAutomatically = true)
    @Query(value = "delete from usaha_target WHERE id_usaha_indicator = :id_indicator",nativeQuery = true)
    void deleteByInd(@Param("id_indicator") Integer id_indicator);
	
	@Query(value = "select * from usaha_target where id_usaha_indicator = :id_nsa_indicator and year = :year",nativeQuery = true)
	public List<UsahaTarget> findByYear(@Param("id_nsa_indicator") Integer id_nsa_indicator, @Param("year") Integer year); 
}
