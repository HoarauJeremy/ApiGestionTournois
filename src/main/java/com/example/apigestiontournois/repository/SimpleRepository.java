package com.example.apigestiontournois.repository;

import com.example.apigestiontournois.model.SimpleTournois;
import org.springframework.data.repository.CrudRepository;

interface SimpleRepository extends CrudRepository<SimpleTournois, Long> {
}
