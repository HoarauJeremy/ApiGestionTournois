package com.example.apigestiontournois.repository;

import com.example.apigestiontournois.model.ChampionnatTournois;
import org.springframework.data.repository.CrudRepository;

interface ChampionnatRepository extends CrudRepository<ChampionnatTournois, Long> {
}
