package com.jica.sdg.repository;

import com.jica.sdg.model.RefBadanHukum;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RefBadanHukumRepository extends CrudRepository<RefBadanHukum, Integer> {
}
