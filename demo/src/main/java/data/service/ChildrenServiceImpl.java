package data.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import data.domain.Children;

@Service
@Transactional
public class ChildrenServiceImpl implements ChildrenService{
	@Autowired
	 ChildrenRepository childrenRepository;
	@Autowired
	 ChildrenOwnRepository childrenOwnRepository;
	
	@Override
	public Children createChild(Children children) {
		return childrenRepository.save(children);
	}

	@Override
	public List<Children> getChildByName(String name) {
		
		return childrenOwnRepository.getChildByName(name);
	}

	@Override
	public List<Children> getChildBySurname(String surname) {
	
		return childrenOwnRepository.getChildBySurname(surname);
	}

	@Override
	public List<Children> getChildrenByFamily(int family) {
		return childrenOwnRepository.getChildrenByFamily(family);
	}

	@Override
	public Children getChildByPesel(String pesel) {
		return childrenOwnRepository.getChildByPesel(pesel);
	}

	@Override
	public List<Children> getChildByData(String data) {
		
		return childrenOwnRepository.getChildByData(data);
	}

	@Override
	public List<Children> getChildBySex(String sex) {
		
		return childrenOwnRepository.getChildBySex(sex);
	}

	@Override
	public List<Children> getAllChildren() {
		
		return childrenOwnRepository.getAllChildren();
	}

	@Override
	public void addChildToFamily(int id, int familyId) {
		childrenOwnRepository.addChildToFamily(id, familyId);
		
	}

}
