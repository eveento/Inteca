package data.service;

import java.util.List;

import data.domain.Children;

public interface ChildrenService {

	public Children createChild(Children children);
	public List<Children> getChildByName(String name);
	public List<Children> getChildBySurname(String surname);
	public List<Children> getChildrenByFamily(int family);
	public Children getChildByPesel(String pesel);
	public List<Children> getChildByData(String data);
	public List<Children> getChildBySex(String sex);
	public List<Children> getAllChildren();
}
