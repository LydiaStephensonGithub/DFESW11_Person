package com.lms;

import com.lms.lookup.Lookup;
import com.lms.person.Person;

public class Runner {
	public static void main(String[] args) {
		Lookup lookup = new Lookup();
		
		Person person1 = new Person("Adam", 28, "Baker");
		Person person2 = new Person("Beatrice", 23, "Engineer");
		Person person3 = new Person("Carl", 25, "Dancer");
		Person person4 = new Person("Edith", 38, "Teacher");
		Person person5 = new Person("Fred", 49, "Chef");
		Person person6 = new Person("Gemma", 29, "Mechanic");
		
		lookup.add(person1);
		lookup.add(person2);
		lookup.add(person3);
		lookup.add(person4);
		lookup.add(person5);
		lookup.add(person6);
		
		//lookup.printAll();
		lookup.filter("Sam");
	}	
}
