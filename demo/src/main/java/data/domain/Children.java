package data.domain;


import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="Child")
public class Children{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Basic(optional = false)
	@Column(name = "id")
	@NotNull
	private long id;
	@Column(name="family")
	private int family;
	@Column(name="name")
	private String name;
	@Column(name="surname")
	private String surname;
	@Column(name="pesel")
	private String pesel;
	@Column(name="data")
	private String data;
	@Column (name="sex")
	private String sex;
	
	/*
	@ManyToOne(cascade=CascadeType.ALL)
	private Family _family;*/
	
	public Children() {}
	
	public Children(long id, int family, String name, String surname, String pesel,String data, String sex) {
		this.id=id;
		this.family=family;
		this.name=name;
		this.surname=surname;
		this.pesel=pesel;
		this.data=data;
		this.sex=sex;
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

	public synchronized String getSex() {
		return sex;
	}

	public synchronized void setSex(String sex) {
		this.sex = sex;
	}

	public synchronized int getFamily() {
		return family;
	}

	public synchronized void setFamily(int family) {
		this.family = family;
	}
	
	
}
