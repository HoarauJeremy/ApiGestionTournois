package com.example.apigestiontournois.repository;

import com.example.apigestiontournois.model.DoubleTournois;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(path = "doubleTournois")
interface DoubleTournoisRepository extends CrudRepository<DoubleTournois, Long> {

}
