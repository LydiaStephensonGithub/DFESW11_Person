package com.lms.lookup;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.lms.person.Person;

public class Lookup {

	private List<Person> lookup = new ArrayList<Person>();
	
	public boolean add(Person person) {
		lookup.add(person);
		return true;
	}
	
	public void printAll() {
		lookup.stream().forEach(x -> System.out.println(x));
	}
	
	public void filter(String n) {
		List<Person> filter = lookup.stream().filter(x -> x.getName().equals(n)).collect(Collectors.toList());
		System.out.println(filter);
	}

	public Lookup() {}
	
	public Lookup(List<Person> register) {
		this.lookup = register;
	}

	@Override
	public String toString() {
		return "" + lookup;
	}
	
}
