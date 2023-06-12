package ui;

import java.util.Scanner;

import vo.Person;

public class PhoneBookUI extends manager.PhoneBookManager{
	public PhoneBookUI(int max) {
		super(100);

	}

	public void start() {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("-------------");
			System.out.println("전화번호부");
			System.out.println("-------------");
			System.out.println("1. 전화번호부 등록");
			System.out.println("2. 이름으로 검색");
			System.out.println("3. 전화번호부 수정");
			System.out.println("4. 전화번호부 삭제");
			System.out.println("5. 전화번호부 전체출력");
			System.out.println("6. 프로그램 종료");
			System.out.print("선택> ");
			int input = scanner.nextInt();
			switch (input) {
				case 1: 
					System.out.print("이름 : ");
					String name = scanner.next();
					System.out.print("나이 : ");
					int age = scanner.nextInt();
					System.out.print("전화번호 : ");
					String phone = scanner.next();
					insertPerson(name,age,phone);
					break;
				case 2:
					System.out.print("이름 : ");
					name = scanner.next();
					Person person = searchPerson(name);
					if (person != null) {
						
					} else {
						System.out.println("검색결과가 없습니다.");
					}
					break;
				case 3:
					System.out.print("이름 : ");
					name = scanner.next();
					boolean updatePerson = updatePerson(name);
					if(updatePerson) {
						System.out.println("변경이 완료");
					}else {
						System.out.println("변경이 실패");
					}
					break;
				case 4:
					System.out.print("이름 : ");
					name = scanner.next();
					boolean deletePerson = deletePerson(name);
					if(deletePerson) {
						System.out.println("삭제 완료");
					}else {
						System.out.println("삭제 실패");
					}
					break;
				case 5:
					printAll();
					break;
				case 6: System.exit(0);
				default: System.out.println("잘못된 입력");

					
				
			}
			
		}

	}
}
