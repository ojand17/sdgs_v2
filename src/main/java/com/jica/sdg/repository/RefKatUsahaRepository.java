package com.jica.sdg.repository;

import com.jica.sdg.model.RefKatUsaha;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RefKatUsahaRepository extends CrudRepository<RefKatUsaha, Integer> {
}
