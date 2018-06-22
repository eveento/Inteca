package data.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import data.domain.Father;
@Service
@Transactional
public class FatherServiceImp implements FatherService{

	@Autowired
	 FatherOwnRepository fatherOwnRepository;
	@Autowired
	 FatherRepository fatherRepository;
	
	@Override
	public Father createFather(Father father) {
		return fatherRepository.save(father);
	}

	@Override
	public List<Father> getFatherByName(String name) {
		return fatherOwnRepository.getFatherByName(name);
	}

	@Override
	public List<Father> getFatherBySurname(String surname) {
		return fatherOwnRepository.getFatherBySurname(surname);
	}

	@Override
	public Father getFatherByFamily(int family) {
		
		return fatherOwnRepository.getFatherByFamily(family);
	}

	@Override
	public Father getFatherByPesel(String pesel) {
		return fatherOwnRepository.getFatherByPesel(pesel);
	}

	@Override
	public List<Father> getFatherByData(String data) {
		return fatherOwnRepository.getFatherByData(data);
	}

	@Override
	public List<Father> getAllFathers() {
		return fatherOwnRepository.getAllFathers();	
	}

	@Override
	public void addFatherToFamily(int id, int family) {
		 fatherOwnRepository.addFatherToFamily(id, family);
	}

}
