package com.jieun.b2;

public class MainTest_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p = new Point();
		p.num = 12;
		//name1, num1은 ㅈ호출X
		p.info();//메서드내에서 멤버변수 호출 따라서 private이어도 호출이 된다
		//나이를 25
		//이름을 iu
		p.setNum(2);
		System.out.println(p.getNum());
		
		
	}

}
