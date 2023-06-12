package manager;

import java.util.Scanner;

import vo.Person;


public class PhoneBookManager extends vo.Person {
	public PhoneBookManager(int max) {
		persons = new Person[max];
		scanner = new Scanner(System.in);
	}
	private Person[] persons;	// Person의 배열
	private Scanner scanner;
	private int count;	
	public Person insertPerson(String name, int age, String phone) {
		Person person = new Person();
		person.setName(name);
		person.setAge(age);
		person.setPhone(phone);
		persons[count]=person;
		count++;
		return person;
	}
	
	public Person searchPerson(String name) {
		
		for(int i=0; i<count; i++) {
			if(name.equals(persons[i].getName())) {
				persons[i].printInfo();
				return persons[i];
			} 
		}
		return null;
	}
	public boolean updatePerson(String name) {
		Person person = new Person();
		person =searchPerson(name);
		if(person != null) {
			System.out.print("변경할 나이 : ");
			person.setAge(scanner.nextInt());
			System.out.print("변경할 전화번호 : ");
			person.setPhone(scanner.next());
			return true;
		}
		return false;
	}
	public boolean deletePerson(String name) {
		Person person = new Person();
		person =searchPerson(name);
		if(person != null) {
			for(int i=0; i<count; i++) {
				if(name.equals(persons[i].getName())) {
					for(int j=i; j<count; j++) {
						persons[j]=persons[j+1];
						count--;
						return true;
					}
				}
			}
			
		}
		return false;
	}
	public void printAll() {
		for(int i=0; i<count; i++) {
			persons[i].printInfo();
		}
	}

}

