package org.fwgreen;

import io.ebean.Finder;

public class PersonRepository extends Finder<Long, Person> {
	
	public PersonRepository() {
		super(Person.class);
	}
}