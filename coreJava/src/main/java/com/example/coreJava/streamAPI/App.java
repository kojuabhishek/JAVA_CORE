package com.example.coreJava.streamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.List;



public class App {
	public static void main(String[] args) {
		List<Person> people = Arrays.asList(new Person[] {
				new Person(12,"Sanjay Panjiyar",Gender.MALE),
				new Person(23,"Sulav Chaudhary",Gender.MALE),
				new Person(12,"Jyoti Adhikari",Gender.FEMALE),
				new Person(36,"Rahul Shrestha",Gender.MALE),
				new Person(7,"Sabin Tamrakar",Gender.MALE),
				new Person(54,"Anita Karki",Gender.FEMALE),
				new Person(39,"Anuj Khatri",Gender.MALE),
				new Person(67,"Roji KC",Gender.FEMALE),
				new Person(16,"Alisha Baniya",Gender.FEMALE),
				
				
				
		});
		 
		
		System.out.println("Elders: ");
		people.stream()
		.filter(p->p.getAge()>=18)
		.collect(Collectors.toList()).forEach(System.out::println);
		
		System.out.println("Children: ");
		people.stream()
		.filter(p->p.getAge()<18)
		.collect(Collectors.toList()).forEach(System.out::println);
		
		System.out.println("Eldest: ");
		System.out.println(people.stream()
				.max(Comparator.comparing(Person::getAge)).get());
		
		System.out.println("Youngest: ");
		System.out.println(people.stream()
				.min(Comparator.comparing(Person::getAge)).get());
		
		System.out.println("Sorted by age: ");
		people.stream().sorted(Comparator.comparing(Person::getAge))
		.collect(Collectors.toList())
		.forEach(System.out::println);
		
		System.out.println("Reverse Sorted by age: ");
		people.stream().sorted(Comparator.comparing(Person::getAge).reversed())
		.collect(Collectors.toList())
		.forEach(System.out::println);
		
		System.out.println("Any Match above 60: ");
		if(people.stream()
				.anyMatch(p->p.getAge()>60)) {
			System.out.println("There are senior citizen in the list!");
		}
		else {
			System.out.println("There are no senior citizen in the list!");
		}
		
		System.out.println("All MAtch above 18: ");
		if(people.stream()
				.allMatch(p->p.getAge()>18)) {
			System.out.println("Everyone is adult in the list");
		}
		else {
			System.out.println("There are some minors  in the list!");
		}
		
		System.out.println("None MAtch above 18: ");
		if(people.stream()
				.noneMatch(p->p.getAge()>18)) {
			System.out.println("Everyone is adult in the list");
		}
		else {
			System.out.println("There are some minors  in the list!");
		}
		
		
		people.stream().collect(Collectors.groupingBy(Person::getGender))
		.forEach((gender, groupByGender)->
		{
			System.out.println(gender+": ");
			groupByGender.forEach(System.out::println);
		}
		);
		
		
			
		
	}

}
