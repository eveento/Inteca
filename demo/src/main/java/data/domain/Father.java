package data.domain;

import javax.persistence.*;

@Entity
@Table(name="Father")
public class Father extends Person{
	@Id
	private long id;
	@Column (name="family")
	private int family;
	@Column(name="name")
	private String name;
	@Column(name="surname")
	private String surname;
	@Column(name="pesel")
	private String pesel;
	@Column(name="data")
	private String data;
	
	public Father() {}
	
	public Father(long id, int family, String name, String surname, String pesel,String data) {
		this.id=id;
		this.family=family;
		this.name=name;
		this.surname=surname;
		this.pesel=pesel;
		this.data=data;
	}

	public synchronized long getId() {
		return id;
	}

	public synchronized void setId(long id) {
		this.id = id;
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

	public synchronized int getFamily() {
		return family;
	}

	public synchronized void setFamily(int family) {
		this.family = family;
	}
	
}
