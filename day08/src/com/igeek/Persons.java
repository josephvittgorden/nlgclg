package com.igeek;

public class Persons extends Animals {

	@Override
	public void eat() {
		System.out.println("Persons eat.....");
	}
	
	public void study() {
		System.out.println("Persons study.....");
	}
	
	public void work() {
		System.out.println("Persons work.....");
	}
	
	public static void main(String[] args) {
		//向上转型(默认)
		Animals animal = new Persons();
		//animal.study();
		animal.eat();
		//向下转型
		Persons persons = (Persons)animal;
		persons.work();
		persons.study();
		//Exception in thread "main" java.lang.ClassCastException: 
		//com.igeek.Persons cannot be cast to com.igeek.Dog
		if(animal instanceof Dog ) {
			Dog dog = (Dog)animal;
			dog.watchDoor();
		}else if(animal instanceof Persons) {
			Persons person = (Persons)animal;
			person.work();
			person.study();
		}
		
		System.out.println(animal instanceof Object);
		
		
		
		
		
		
		
	}
	

}
