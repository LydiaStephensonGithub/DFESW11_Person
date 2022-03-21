package com.lms.menu;

import java.util.Scanner;

import com.lms.lookup.Lookup;
import com.lms.person.Person;

public class Menu {
	
	Lookup lookup = new Lookup();
	Scanner scan = new Scanner(System.in);
	private boolean run = true;
	
	public void start() {
		
		System.out.println("Please select an option");
		System.out.println("1. Create a person");
		System.out.println("2. See list of all people");
		System.out.println("3. Search for person");
		System.out.println("0. EXIT");
		
		while (run == true) {
			int option = scan.nextInt();
			
			if (option >= 0 && option <= 3) {
				switch(option) {
				case 1:
					scan.nextLine();
					System.out.println("Please enter name:");
					String name = scan.nextLine();
					System.out.println("Please enter age:");
					int age = scan.nextInt();
					scan.nextLine();
					System.out.println("Please enter job title:");
					String job = scan.nextLine();		
					lookup.add(new Person(name, age, job));
					break;
				case 2:
					lookup.printAll();
					break;
				case 3:
					System.out.println("Please enter name: ");
					scan.nextLine();
					String search = scan.nextLine();
					if (search != null) {
						lookup.filter(search);
					}
					break;
				case 0:
					run = false;
					System.out.println("EXIT");
					break;
				}
			} else {
				System.out.println("Please check input");
			}
		}
		scan.close();
		
	}
	
}
