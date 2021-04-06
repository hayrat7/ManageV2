package com.sid.dao;

import com.sid.entities.Frais;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface FraisRepository extends JpaRepository<Frais,Long> {
}
