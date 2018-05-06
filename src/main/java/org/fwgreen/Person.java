package org.fwgreen;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import io.ebean.Model;

@Entity
public class Person extends Model {
	
	public static final PersonRepository repo = new PersonRepository();
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Long id;
	private String firstname;
	private String lastname;
	private String telephone;
	private String email;
	
	public Person(String firstname, String lastname, String telephone, String email) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.telephone = telephone;
		this.email = email;
	}

	public String getFirstname() { return firstname; }

	public String getLastname() { return lastname; }

	public String getTelephone() { return telephone; }

	public String getEmail() { return email; }

	@Override
	public String toString() {
		return "Person [firstname=" + firstname + ", lastname=" + lastname + ", telephone=" + telephone + ", email="
				+ email + "]";
	}
}