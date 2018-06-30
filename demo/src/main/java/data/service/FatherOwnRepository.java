package data.service;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import data.domain.Father;


public interface FatherOwnRepository extends Repository<Father, Long> {
	@Query(value = "from Father c where c.name=:name")
    List<Father> getFatherByName(@Param("name") String name);

	@Query(value = "from Father c where c.surname=:surname")
    List<Father> getFatherBySurname(@Param("surname") String surname);
	
    @Query(value = "from Father c where c.family=:family")
    List<Father> getFatherByFamily(@Param("family") int family);
    
    @Query(value="from Father c where c.pesel=:pesel")
    Father getFatherByPesel(@Param("pesel") String pesel);
    
    @Query(value = "from Father c where c.data=:data")
    List<Father> getFatherByData(@Param("data") String data);
    
    @Query(value = "from Father")
    List<Father> getAllFathers();
    
    @Modifying
    @Query(value="update Father x Set x.family=?2 where x.id=?1")
    void addFatherToFamily(int id, int family);
    
    
}
