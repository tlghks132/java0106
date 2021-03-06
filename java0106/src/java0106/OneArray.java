package java0106;

public class OneArray {

	public static void main(String[] args) {
		
		// 초값을 가지고 문자열 배열을 생성
		String[] StrAr = {"발렌타이","클레라","루레릭"};
		
		//데이터 1개 출력 - 0번째 데이터 출력
		System.out.println(StrAr[0]);
		
		//데이터 전체 출력
		//배열이름.length 는 배열의 데이터 개수를 정수로 리턴
		for(int i=0; i<StrAr.length; i=i+1) {
			System.out.println(StrAr[i]);
		}
		
		System.out.println("=======================================");
		//배열을 기본값으로 만들고 나중에 데이터 채우기.
		
		//참조형 변수가 생성된 것이지 데이터가 생성된 것은 아니어서 NullPointerException
		
		/*
		String [] homerHitters = null;
		System.out.println(homerHitters[0]);
		*/
		
		String [] homerunHitters = new String[3];
		//공간만 할당받은 배열에 데이터 채우기
		homerunHitters[0] = "김봉연";
		homerunHitters[1] = "홍길동";
		homerunHitters[2] = "심수명";
		//ArrayIndexOutOfBoundsException 발생
		//homerunHitters[0] = "김성래";
			
		//반복문안ㅇ네서 동일한 참조형 내부 데이터를 접근하는 것은 비효율적
		int len =homerunHitters.length;
		for(int i=0; i<len; i=i+1) {
			System.out.println(homerunHitters[i]);
		}
		System.out.println("===========================================");
		
		//빠른 열기를 이용한 접근
		//데이터의 시작과 끝을 직접 장성하지 않기 때문에 Index 오류를 일으키지 않게 된다.
		for(String temp : homerunHitters) {
			System.out.println(temp);
		}
		
		
	}

}
