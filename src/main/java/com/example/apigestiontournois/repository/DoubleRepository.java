package com.example.apigestiontournois.repository;

import com.example.apigestiontournois.model.DoubleTournois;
import org.springframework.data.repository.CrudRepository;

interface DoubleRepository extends CrudRepository<DoubleTournois, Long> {
}
