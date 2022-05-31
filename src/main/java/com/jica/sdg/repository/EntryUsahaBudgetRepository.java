package com.jica.sdg.repository;

import com.jica.sdg.model.EntryUsahaBudget;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.repository.query.Param;

public interface EntryUsahaBudgetRepository extends CrudRepository<EntryUsahaBudget, Integer> {

    
}
