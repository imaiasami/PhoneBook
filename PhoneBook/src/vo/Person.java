package vo;

import java.util.Scanner;

public class Person {
	/*
	 * 접근제어자(접근지정자)
	 *  - public : 외부에서 자유롭게 접근 가능
	 *  - protected : 같은 패키지 혹은 상속관계에서 접근가능
	 *  - default : 같은 패키지 내에서 접근가능
	 *  - private: 같은 클래스에서 접근 가능 
	 */ 
	private String name; // 이름 필드 default 접근제어자를 가지고 있다. default는 별도로 표기 하지 않는다
	private int age;  	 // 나이 필드는 꼭 private 으로 지정 
	private String phone;
	public Person() {}
	
	public Person(String name, int age, String phone) {
		this.name=name;
		this.age=age;
		this.phone=phone;
		
	}
	public void setPhone(String phone) {
		this.phone=phone;
	}
	public String getPhone(){
		return phone;
	}
	public void setAge(int age) {
		if(age < 0 || age >150) {
			System.out.println("나이가 잘못 됨");
			return;
		}
		this.age=age;
	}
	public int getAge() { // 불문법이 존재
		return age;
	}
	//setter
	public void setName(String name) {
		if(name.length()> 5) {
			return;
		}
		this.name=name;
	}
	//getter
	public String getName() {
		return name;
	}
	
	public void printInfo() {
		System.out.println("name: " + name + ", age: "+ age + ", phone: "+phone);
		
	}
	



}
