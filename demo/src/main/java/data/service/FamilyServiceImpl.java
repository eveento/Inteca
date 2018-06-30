package data.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import data.domain.Family;
import data.domain.Person;

@Service
@Transactional
public class FamilyServiceImpl implements FamilyService{

	@Autowired
	FamilyRepository familyRepository;
	@Autowired
	FamilyOwnRepository familyOwnRepository;

	
	@Override
	public Family createFamily(Family family) {
		
		return familyRepository.save(family);
	}
/*
	@Override
	public List<Person> getAllFromOneFamily(int id) {
		List<Person> list= new ArrayList<Person>();
		Person father= (Person) fatherOwnRepository.getFatherByFamily(id);
		list.add(father);
		List<Children> childrenList = childrenOwnRepository.getChildrenByFamily(id);
		for(int i=0; i<childrenList.size();i++) {
			list.add(childrenList.get(i));
		}
		return list;
		from Children c, Father f where c.family = f.family
	}
*/

	@Override
	public List<Person> getAllFromOneFamily(int family) {
		return familyOwnRepository.getAllFromOneFamily(family);
	}

}
