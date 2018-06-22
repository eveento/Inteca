package data.service;

import java.util.List;

import data.domain.Father;

public interface FatherService {
	
	public Father createFather(Father father);
	public List<Father> getFatherByName(String name);
	public List<Father> getFatherBySurname(String surname);
	public List<Father> getFatherByFamily(int family);
	public Father getFatherByPesel(String pesel);
	public List<Father> getFatherByData(String data);
	public List<Father> getAllFathers();
	void addFatherToFamily(int id ,int familyId);
	
}
