package com.jica.sdg.repository;

import com.jica.sdg.model.UsahaActivity;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface UsahaActivityRepository extends CrudRepository<UsahaActivity, Integer> {
	@Query(value = "select * from usaha_activity where id_program = :id_program and id_role = :id_role order by CAST(internal_code AS UNSIGNED)",nativeQuery = true)
	public List<UsahaActivity> findAllGovActivity(@Param("id_program") Integer id_program,@Param("id_role") Integer id_role); 
	
	@Query(value = "select * from usaha_activity where id_program = :id_program order by CAST(internal_code AS UNSIGNED)",nativeQuery = true)
	public List<UsahaActivity> findAllGovActivity(@Param("id_program") Integer id_program); 
	
	@Transactional
    @Modifying(clearAutomatically = true)
    @Query(value = "update usaha_activity set id_role = :id_role where id = :id",nativeQuery = true)
    void UpdateRole(@Param("id_role") Integer id_role, @Param("id") Integer id);
	
	@Query(value = "select count(*) from usaha_activity where id_program = :id_program",nativeQuery = true)
	public Integer countActivity(@Param("id_program") Integer id_program); 
}
