package data.service;

import org.springframework.data.jpa.repository.JpaRepository;


import data.domain.Family;

public interface FamilyRepository extends JpaRepository<Family,Long>{

}
