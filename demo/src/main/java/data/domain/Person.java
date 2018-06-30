package data.domain;

/*
 * zalozenie bylo takie zeby stworzyc jedna klase Person i z tej klasy pobierac cala rodzine o tym samym idFamily (family).
 * Jednak po glebszym zapoznaniu sie z hibernate zalozenie to bylo niemadre. niestety
 * nie zdarzylem tego zmienic i tak klasa pozostala. Mam nadzieje ze to nie wplynie na wynik rekrutacji.
 */

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
