package com.jica.sdg.repository;

import com.jica.sdg.model.UsahaFunding;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface UsahaFundingRepository extends CrudRepository<UsahaFunding, Integer> { 
	
	@Transactional
    @Modifying(clearAutomatically = true)
    @Query(value = "delete from usaha_funding WHERE id_usaha_indicator = :id_indicator and id_monper = :id_monper",nativeQuery = true)
    void deleteByInd(@Param("id_indicator") Integer id_indicator, @Param("id_monper") Integer id_monper);
	
	@Query(value = "select * from usaha_funding where id_usaha_indicator = :id_nsa_indicator and id_monper = :id_monper",nativeQuery = true)
	public List<UsahaFunding> findByMon(@Param("id_nsa_indicator") Integer id_nsa_indicator, @Param("id_monper") Integer id_monper); 
}
