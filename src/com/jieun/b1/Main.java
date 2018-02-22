package com.jieun.b1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Member m = new Member();
		InBody i = new InBody();
		Scanner sc  = new Scanner(System.in);
		System.out.println("이름을 입력하세요");
		m.name = sc.next();
		System.out.println("나이를 입력하세요");
		m.age = sc.nextInt();
		System.out.println("성별을 입력하세요");
		m.sex=sc.next();
		System.out.println("번호를 입력하세요");
		m.phone=sc.next();
		System.out.println("몸무게입력하세요");
		m.weight=sc.nextInt();
		System.out.println("키를 입력하세요");
		m.height=sc.nextInt();
		
		m.info();
		i.check(m);
		
		
		
				

	}

}
