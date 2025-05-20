package com.example.apigestiontournois.repository;

import com.example.apigestiontournois.model.DoubleTournois;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
interface DoubleRepository extends CrudRepository<DoubleTournois, Long> {
}
