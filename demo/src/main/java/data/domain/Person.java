package data.domain;

public class Person {
	
	private long id;
	private int family;
	private String name;
	private String surname;
	private String pesel;
	private String data;
	private String sex;
	
	public synchronized long getId() {
		return id;
	}
	public synchronized void setId(long id) {
		this.id = id;
	}
	public synchronized int getFamily() {
		return family;
	}
	public synchronized void setFamily(int family) {
		this.family = family;
	}
	public synchronized String getName() {
		return name;
	}
	public synchronized void setName(String name) {
		this.name = name;
	}
	public synchronized String getSurname() {
		return surname;
	}
	public synchronized void setSurname(String surname) {
		this.surname = surname;
	}
	public synchronized String getPesel() {
		return pesel;
	}
	public synchronized void setPesel(String pesel) {
		this.pesel = pesel;
	}
	public synchronized String getData() {
		return data;
	}
	public synchronized void setData(String data) {
		this.data = data;
	}
	public synchronized String getSex() {
		return sex;
	}
	public synchronized void setSex(String sex) {
		this.sex = sex;
	}
}
