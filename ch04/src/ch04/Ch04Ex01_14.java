package ch04;

import java.util.Scanner;

public class Ch04Ex01_14 {
	public static void main(String[] args) {
		/*1.14. 1~12사이의 정수인 월을 입력받아 평년의 경우 해당 월의 날수를 출력하는 프로그램을
		작성하시오.*/
		int month, day = 0;
		Scanner scanner = new Scanner(System.in);
		month = scanner.nextInt();
		
		switch(month) {
		case 1: 
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12: day = 31;
		break;
		case 2: day = 28;
		break;
		case 4:
		case 6:
		case 9:
		case 11: day = 30;
		}
		System.out.println(day);
		
		

	}

}
