package java0106;

import java.util.Scanner;
public class Triangle {

	public static void main(String[] args) {
		int [] ar = {40, 37, 51, 65, 29};
		
		Scanner sc=new Scanner(System.in);
		System.out.print("추려할 라인의 수:");
		int line = sc.nextInt();
		
		sc.close();

		/*
		int cnt = 0;
		for(int data:ar) {
			if(data>50) {cnt = cnt + 1;}
		}
		System.out.print("50이 넘는 데이터 개수:" + cnt + "\n");
		*/
		
		
		int cnt = 0;
		int sum = 0;
		for(int data : ar) {
			if(data>30) {
				cnt = cnt + 1;
				sum = sum + data;
			}
		}
		
		

	}

}
