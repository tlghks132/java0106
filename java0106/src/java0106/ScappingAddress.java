package java0106;

public class ScappingAddress {

	public static void main(String[] args) {
		// 첫 번째 페이지 URL
		// http://www.donga.com/news/search?p =1&query=자바

		// 각페이지 마다 기사가 15개씩 있어서 p의 값이 15씩 증가

		// 총 데이터 건수는 1164

		int total = 1164;
		// 페이지 개수 만들때는 나우어 떨어지지 않으면 몫 +1
		int pagesu = 1164 / 15;
		// 페이지 별 기사의 시작번호
		if (total % 15 != 0) {
			pagesu = pagesu + 1;
		}
		for (int i = 0; i < pagesu; i = i + 1) {
			int p = 15 * i + 1;
			// 기사의 URL 만들기
			System.out.println("http://www.donga.com/news/search?p" + p + "&query=자바");

		}

	}

}
