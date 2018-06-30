package data.service;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import data.domain.Family;
import data.domain.Person;

public interface FamilyOwnRepository extends Repository<Family, Long>{

	@Query(value = "from Children c, Father f where c.family = f.family")
	List<Person> getAllFromOneFamily(@Param("family")int family);
}
