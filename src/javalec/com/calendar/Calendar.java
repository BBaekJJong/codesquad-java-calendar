package javalec.com.calendar;

import java.util.Scanner;

public class Calendar {

	public void printSamplCalendar() {
		// TODO Auto-generated method stub
		System.out.println(" 일\t월\t화\t수\t목\t금\t토");
		System.out.println("--------------------------------------------------");
		System.out.println("1\t2\t3\t4\t5\t6\t7");
		System.out.println("8\t9\t10\t11\t12\t13\t14");
		System.out.println("15\t16\t17\t18\t19\t20\t21");
		System.out.println("22\t23\t24\t25\t26\t27\t28");
	}
	
	private static final int[] MAX_DAYS = {31,28,31,30,31,30,31,31,30,31,30,31};
	private static final int[] LEAP_MAX_DAYS = {31,29,31,30,31,30,31,31,30,31,30,31};
	
	public int getMaxDaysOfMonth(int year,int month) {
		if (isLeapYear(year)) return LEAP_MAX_DAYS[month - 1];
		else	return MAX_DAYS[month - 1];
	}
	
	public boolean isLeapYear(int year) {
		// 윤년을 계산하는 메소드
		if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
			return true;
		}	
		else {
			return false;
		}
	}
		
	public int parseDay(String week) {
		// TODO Auto-generated method stub
		if (week.equals("일")) return 0;
		else if(week.equals("월")) return 1;
		else if(week.equals("화")) return 2;
		else if(week.equals("수")) return 3;
		else if(week.equals("목")) return 4;
		else if(week.equals("금")) return 5;
		else if(week.equals("토")) return 6;
		return 0;
		
	}
	
	
	public void printCalendar(int month, int week) {
		// TODO Auto-generated method stub
		
		int a = 0;
				
		System.out.println(" 일\t월\t화\t수\t목\t금\t토");
		System.out.println("----------------------------------");
		
		for (int i = 1 - week; i < month + 1; i++) {
			if (i <= 0 ) System.out.print("\t");
			else System.out.print(i + "\t");
			a++;
			if (a%7 == 0) System.out.println("");
		}
		
	}
	
	public static void main(String[] args) {
		// 숫자를 입력 받아 해당하는 달의 최대 일수를 출력하는 프로그램
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("원하는 년도를 입력하세요");
		System.out.print("YEAR >> ");
		int a = scanner.nextInt();
		
		System.out.println("원하는 월을 입력하세요");
		System.out.print("MONTH >> ");
		int b = scanner.nextInt();
		
		System.out.println("원하는 요일을 입력하세요");
		System.out.print("DAY >> ");
		String week = scanner.next();
		
		Calendar cal = new Calendar();
		
		System.out.printf("입력하신 %d년 %d월은 %d일 입니다.\n",a,b,cal.getMaxDaysOfMonth(a,b));
		cal.printCalendar(cal.getMaxDaysOfMonth(a, b),cal.parseDay(week));
		scanner.close();
		
		
		
		
	}

}
