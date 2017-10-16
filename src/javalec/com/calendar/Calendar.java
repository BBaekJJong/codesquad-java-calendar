package javalec.com.calendar;

import java.util.Scanner;

public class Calendar {

	public void printSamplCalendar() {
		// TODO Auto-generated method stub
		System.out.println(" 월\t화\t수\t목\t금\t토\t일");
		System.out.println("----------------------------------");
		System.out.println("1\t2\t3\t4\t5\t6\t7");
		System.out.println("8\t9\t10\t11\t12\t13\t14");
		System.out.println("15\t16\t17\t18\t19\t20\t21");
		System.out.println("22\t23\t24\t25\t26\t27\t28");
	}
	
	private static final int[] MAX_DAYS = {31,28,31,30,31,30,31,31,30,31,30,31};
	
	public int getMaxDaysOfMonth(int month) {
		// TODO Auto-generated method stub
		return MAX_DAYS[month -1];
	}
		
	public static void main(String[] args) {
		// 숫자를 입력 받아 해당하는 달의 최대 일수를 출력하는 프로그램
	
		System.out.println("원하는 월을 입력하세요");
		
		Scanner scanner = new Scanner(System.in);
//		String s1 = scanner.next();
		int a = scanner.nextInt();
//		int a = Integer.parseInt(s1);

		Calendar cal = new Calendar();
		
		System.out.printf("입력하신 %d월은 %d일 입니다.\n",a,cal.getMaxDaysOfMonth(a));
		
		scanner.close();
		
		System.out.println("Home Start");
	}

}
