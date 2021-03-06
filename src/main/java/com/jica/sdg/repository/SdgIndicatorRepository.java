package com.jica.sdg.repository;

import com.jica.sdg.model.SdgIndicator;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SdgIndicatorRepository extends CrudRepository<SdgIndicator, Integer> {
	@Query(value = "select * from sdg_indicator where id_goals = :id_goals and id_target = :id_target order by CAST(id_indicator AS UNSIGNED)",nativeQuery = true)
	public List<SdgIndicator> findAllIndicator(@Param("id_goals") Integer id_goals, @Param("id_target") Integer id_target); 
	
	@Query(value = "select a.id, a.id_indicator, a.id_goals, a.id_target, a.nm_indicator, b.nm_unit, a.nm_indicator_eng from sdg_indicator a Left Join ref_unit b on a.unit = b.id_unit where a.id_goals = :id_goals and a.id_target = :id_target order by CAST(a.id_indicator AS UNSIGNED)",nativeQuery = true)
	public List findAllGrid(@Param("id_goals") Integer id_goals, @Param("id_target") Integer id_target);
	
	@Query(value = "select count(*) from sdg_indicator where id_goals = :id_goals and id_target = :id_target",nativeQuery = true)
	public Integer countIndicator(@Param("id_goals") Integer id_goals, @Param("id_target") Integer id_target);
	
	@Query(value = "select a.id, concat(b.id_goals,'.',c.id_target,'.',a.id_indicator) as id_indicator, a.id_goals, a.id_target, a.nm_indicator, a.nm_indicator_eng, a.unit, a.increment_decrement "
			+ "from sdg_indicator a "
			+ "left join sdg_goals b on a.id_goals = b.id "
			+ "left join sdg_target c on a.id_target = c.id "
			+ "where a.id_goals = :id_goals order by CAST(id_indicator AS UNSIGNED)",nativeQuery = true)
	public List<SdgIndicator> findByGoals(@Param("id_goals") Integer id_goals); 
	
	@Query(value = "select a.id, concat(b.id_goals,'.',c.id_target,'.',a.id_indicator) as id_indicator, a.id_goals, a.id_target, a.nm_indicator, a.nm_indicator_eng, a.unit, a.increment_decrement "
			+ "from sdg_indicator a "
			+ "left join sdg_goals b on a.id_goals = b.id "
			+ "left join sdg_target c on a.id_target = c.id ",nativeQuery = true)
	public List<SdgIndicator> findAllKodeLengkap(); 
	
}
