package com.jica.sdg.repository;

import com.jica.sdg.model.RefPemda;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RefPemdaRepository extends CrudRepository<RefPemda, Integer> {
}
