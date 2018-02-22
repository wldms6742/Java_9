package com.jieun.b2;

public class Point {//class Point 이면 다른 패키지에서 접근x
	int num;//접근지정자를 안쓰면 default, 같은 패키지내만에서 접근가능
	private int num1;//오직 클래스 내에서만 접근이가능
	public String name;//어디서든지 접근이 가능하다
	private String name1;
	public Point() {
		 num1=1;//같은클래스이기 때문에 접근이 가능하다
	}
	//4.메서드를 이용한 초기화
	public void setNum(int num) {
		if(num>0 && num<100) {
		this.num1 = num;
		}else {
			num=0;
		}
		
	}
	public int getNum() {
		return this.num1;
	}//setNum에서 받은 num1을 getNum메서드로 호출
	//private한 변수에 넣을 때 메서드의 매개변수로 값을 넣어주고 getNum으로 가져온다.
	public void setName(String name) {
		
		this.name1 = name;
	}
	public String getName() {
		if(this.name1==null) {
			return "sugji";
		}
		else {
			return this.name1;
					}
	}
	public void info() {
		System.out.println(num1);
		System.out.println(name1);
	}
	
	
}
/*
멤버변수
1. 객체 생성후 접근
2.선언시에 초기화
3. 생성자를 초기화
4. 메서드를 이용한 초기화
*/