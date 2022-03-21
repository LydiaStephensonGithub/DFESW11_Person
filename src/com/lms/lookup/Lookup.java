package com.lms.lookup;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
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
	
	public void writeToFile() throws IOException {
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("src/resources/file.txt"))) {
			for (Person person : lookup) {
				bw.write(person.toString() + "\n");
			}
		} catch (IOException e) {
			System.out.println("Error");
		}
	}
	
	public void readFromFile() throws IOException {
		try (BufferedReader br = new BufferedReader(new FileReader("src/resources/file.txt"))) {
			List<String> read = new ArrayList<String>();
			String line;
			while ((line = br.readLine()) != null) {
				read.add(line);
			}
			for (String person : read) {
				System.out.println(person);
			}
		}
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
