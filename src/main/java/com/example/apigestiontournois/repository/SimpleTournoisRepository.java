package com.example.apigestiontournois.repository;

import com.example.apigestiontournois.model.SimpleTournois;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "simpleTournois")
public interface SimpleTournoisRepository extends CrudRepository<SimpleTournois, Long> {
}