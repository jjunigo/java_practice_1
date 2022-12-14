package ch16;

import java.util.Scanner;

public class SwitchCaseTest {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in); //컨트롤 + 쉬프트 + O 하면 import 됨.
		int month = scanner.nextInt();
		
		int day = switch(month){
			
			case 1,3,5,7,8,10,12->{
				System.out.println("이번달은 31일까지 입니다.");
				31;
			}
			case 2->
				28;	
			case 4,6,9,11->
				30;
			default-> {
				System.out.println("존재하지 않는 월입니다.");
				yield -1;
			}
			
		};
		
		System.out.println(month + "월은 " + day + "일 입니다.");
		
	}

}
