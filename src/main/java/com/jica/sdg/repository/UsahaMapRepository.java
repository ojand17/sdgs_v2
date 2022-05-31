package com.jica.sdg.repository;

import com.jica.sdg.model.SdgDisaggreDetail;
import com.jica.sdg.model.UsahaMap;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface UsahaMapRepository extends CrudRepository<UsahaMap, Integer> {
	@Query(value = "select * from sdg_ranrad_disaggre_detail where id_disaggre = :id_disaggre",nativeQuery = true)
	public List<SdgDisaggreDetail> findAllDisaggreDetail(@Param("id_disaggre") String id_disaggre); 
	
	@Transactional
    @Modifying(clearAutomatically = true)
    @Query(value = "delete from usaha_map WHERE id_indicator = :id_indicator",nativeQuery = true)
    void deleteBySdgInd(@Param("id_indicator") String id_indicator);
	
	@Query(value = "select * from usaha_map where id_indicator = :id_indicator",nativeQuery = true)
	public List<UsahaMap> getIdBySdgInd(@Param("id_indicator") String id_indicator); 
	
	@Transactional
    @Modifying(clearAutomatically = true)
    @Query(value = "delete from usaha_map WHERE id_usaha_indicator = :id_nsa_indicator",nativeQuery = true)
    void deleteByInd(@Param("id_nsa_indicator") Integer id_nsa_indicator);
	
	@Query(value = "select * from usaha_map where id_usaha_indicator = :id_nsa_indicator",nativeQuery = true)
	public List<UsahaMap> getIdByInd(@Param("id_nsa_indicator") Integer id_nsa_indicator);
}
