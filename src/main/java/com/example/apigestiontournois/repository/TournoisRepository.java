package com.example.apigestiontournois.repository;

import com.example.apigestiontournois.model.Tournois;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TournoisRepository extends CrudRepository<Tournois, Long> {
}
