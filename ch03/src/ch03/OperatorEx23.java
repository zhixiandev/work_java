package ch03;

public class OperatorEx23 {

	public static void main(String[] args) {
		String str1 = "abc";
		String str2 = new String("abc");
		
		System.out.printf("\"abc\" == \"abc\" ?  %b%n", "abc" == "abc");
		System.out.printf(" str1 == \"abc\" ?  %b%n", str1 == "abc");
		System.out.printf(" str2 == \"abc\" ?  %b%n", str2 == "abc"); // 주소 값 비교
		System.out.printf("str1.equals(\"abc\") ? %b%n", str1.equals("abc"));
		System.out.printf("str2.equals(\"abc\") ? %b%n", str2.equals("abc"));
		System.out.printf("str2.equals(\"ABC\") ? %b%n", str2.equals("ABC")); // 대소문자 구분
		System.out.printf("str2.equalsIsIgnoreCase(\"ABC\") ? %b%n", // 대소문자 
				str1.equalsIgnoreCase("ABC"));

	}

}
