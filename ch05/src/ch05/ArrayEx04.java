package ch05;

public class ArrayEx04 {
	public static void main(String[] args) {
		char[] abc = {'A', 'B', 'C', 'D'};
		char[] num = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		System.out.println(abc);
		System.out.println(num);
		
		// 배열 abc와 num을 붙여서 하나의 배열(result)로 만든다.
		char[] result = new char[abc.length + num.length];
		System.arraycopy(abc, 0, result, 0, abc.length);
		System.arraycopy(num, 0, result, abc.length, num.length);
		//				  원본  인덱스  사본        인덱스 (4)    끝지점 길이 (9)
		System.out.println(result);
		
		// 배열 abc를 배열 num의 첫 번째 위치부터 배열 abc의 길이만큼 복사
		System.arraycopy(abc, 0, num, 0, abc.length);
		System.out.println(num);
		
		// number의 인덱스 6 위치에 3개를 복사
		System.arraycopy(abc, 0, num, 6, 3);
		System.out.println(num);
		
		// arraycopy(원본배열, 원본배열에서 복사 하고픈 시작저점 인덱스번호,
		//			  사본배열, 사본배열에서 붙여넣기 하고픈 시작지점 인덱스 번호,
		//			  원본배열의 시작지점에서 복사하고픈 끝지점까지의 길이(=복사할개수))
	}

}
