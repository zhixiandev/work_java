package ch03;

import java.util.Scanner;

public class Ch03Ex01_03 {
	public static void main(String[] args) {
		/*
		 * 두 개의 정수를 입력받아 각각 후치 증가 연산자와 
		 * 전치 감소 연산자를 사용하여 두 수의 곱을 구한 후 
		 * 각각의 값을 출력하는 프로그램을 작성하시오.
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("두개의 정수를 입력해주세요 >");
		// 1. 두 개의 정수 입력
		int num1 = Integer.parseInt(scanner.nextLine());
		int num2 = Integer.parseInt(scanner.nextLine());
		
		// 2. 각각 후치 증가 연산자와 전치 감소 연산자 사용
		
		int a = num1++; // a에는 num1이 1증가하기 전 값이 저장됨
		int b = --num2; // b에는 num2가 1감소 후 값이 저장됨
		int mul = a * b; // 증가 전 값과 감소 후 값을 곱한 값 저장
		
		// 3. 결과를 출력하기
		System.out.printf("%d %d %d%n", num1, num2, mul);
		
		
		/*
		String strNum1 = scanner.nextLine();
		String strNum2 = scanner.nextLine();
		
		int i1 = Integer.parseInt(strNum1);
		int i2 = Integer.parseInt(strNum2);
		
		int bpls = i1++;
		int fmin = --i2;
		
		int result = bpls * fmin;
		
		System.out.printf("%d %d %d", i1, fmin, result);
		*/
	}

}
