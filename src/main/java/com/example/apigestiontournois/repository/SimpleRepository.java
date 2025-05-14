package com.example.apigestiontournois.repository;

import com.example.apigestiontournois.model.SimpleTournois;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SimpleRepository extends CrudRepository<SimpleTournois, Long> {
}
