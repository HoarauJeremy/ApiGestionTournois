package com.example.apigestiontournois.repository;

import com.example.apigestiontournois.model.Tournois;
import org.springframework.data.repository.CrudRepository;

interface TournoisRepository extends CrudRepository<Tournois, Long> {
}
