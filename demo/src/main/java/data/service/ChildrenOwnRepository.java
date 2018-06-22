package data.service;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import data.domain.Children;

public interface ChildrenOwnRepository extends Repository<Children, Long>{

	@Query(value = "from Children c where c.name=:name")
    List<Children> getChildByName(@Param("name") String name);

	@Query(value = "from Children c where c.surname=:surname")
    List<Children> getChildBySurname(@Param("surname") String surname);
	
    @Query(value = "from Children c where c.family=:family")
    List<Children> getChildrenByFamily(@Param("family") int family);
    
    @Query(value="from Children c where c.pesel=:pesel")
    Children getChildByPesel(@Param("pesel") String pesel);
    
    @Query(value = "from Children c where c.sex=:sex")
    List<Children> getChildBySex(@Param("sex") String sex);
    
    @Query(value = "from Children c where c.data=:data")
    List<Children> getChildByData(@Param("data") String data);

    @Query(value = "from Children")
    List<Children> getAllChildren();
    
    @Modifying
    @Query(value="update Children x Set x.family=?2 where x.id=?1")
    void addChildToFamily(int id, int family);
    
	
}
