package javalec.com.calendar;

import java.util.Scanner;

public class Calendar {

	public static void main(String[] args) {
		
		
		
		
		System.out.println(" 월\t화\t수\t목\t금\t토\t일");
		System.out.println("----------------------------------");
		System.out.println("1\t2\t3\t4\t5\t6\t7");
		System.out.println("8\t9\t10\t11\t12\t13\t14");
		System.out.println("15\t16\t17\t18\t19\t20\t21");
		System.out.println("22\t23\t24\t25\t26\t27\t28");
	
		// 숫자를 입력 받아 해당하는 달의 최대 일수를 출력하는 프로그램
	
		System.out.println("원하는 월을 입력하세요");
		
		Scanner scanner = new Scanner(System.in);
//		String s1 = scanner.next();
		int a = scanner.nextInt();
//		int a = Integer.parseInt(s1);
		
		int[] maxDays = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		System.out.printf("입력하신 %d월은 %d일 입니다.\n",a,maxDays[a-1]);
		
		
//		switch (a) {
		
//		case 1:
//			System.out.println("1월은 31일 입니다.");
//			break;
//		case 2:
//			System.out.println("2월은 28일 입니다.");
//			break;
//		case 3:
//			System.out.println("3월은 31일 입니다.");
//			break;
//		case 4:
//			System.out.println("4월은 31일 입니다.");
//			break;
//		case 5:
//			System.out.println("5월은 31일 입니다.");
//			break;
//		case 6:
//			System.out.println("6월은 31일 입니다.");
//			break;
//		case 7:
//			System.out.println("7월은 31일 입니다.");
//			break;
//		case 8:
//			System.out.println("8월은 31일 입니다.");
//			break;
//		case 9:
//			System.out.println("9월은 31일 입니다.");
//			break;
//		case 10:
//			System.out.println("10월은 31일 입니다.");
//			break;
//		case 11:
//			System.out.println("11월은 31일 입니다.");
//			break;
//		case 12:
//			System.out.println("12월은 31일 입니다.");
//			break;
//		default:
//			System.out.println("잘 못 입력 하셨습니다.");
//		}
	
		scanner.close();
	
	}

}
