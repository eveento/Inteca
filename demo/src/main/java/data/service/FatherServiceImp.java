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
	 private FatherOwnRepository fatherOwnRepository;
	@Autowired
	 private FatherRepository fatherRepository;
	
	@Override
	public void createFather(Father father) {
			fatherRepository.save(father);
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
	public List<Father> getFatherByFamily(int family) {
		
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

}
