package data.service;


import java.util.List;

import data.domain.Family;
import data.domain.Person;


public interface FamilyService {

	public Family createFamily(Family family);
	public List<Person> getAllFromOneFamily(int family);
	
}
