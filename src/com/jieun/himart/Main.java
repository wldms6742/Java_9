package com.jieun.himart;

public class Main {

	public static void main(String[] args) {
		Tv t  = new Tv();
		t.setBrand("LG");
		t.setSize(100);
		t.setPrice(1000);
		t.setPoint(100);
		
		Computer computer = new Computer();
		computer.setCpu("i7");
		computer.setMuge(0.99);
		computer.setPrice(120);
		computer.setPoint(80);
		
		Phone phone = new Phone();
		phone.setBrand("Apple");
		phone.setColor("GoldPink");
		phone.setPrice(150);
		phone.setPoint(50);
		
		Customer iu = new Customer();
		iu.setDon(2000);
		iu.setPoint(0);
		iu.buy(phone);
		
	}

}
