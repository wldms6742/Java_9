package com.jieun.b1;

public class InBody {

	public void check(Member m) {
		double point = (m.height-100)*0.95;
		if(point>m.weight) {
			System.out.println("비만입니다");
		}else if(point<m.weight) {
			System.out.println("저체중입니다");
			
		}else {
			System.out.println("정상입니다");
		}
	}
}
