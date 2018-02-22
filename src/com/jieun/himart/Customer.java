package com.jieun.himart;

public class Customer {
	private int don;
	private int point;
	public void buy(Electronics e) {
		//물건값계산
		//포인트계산
		
		this.don = don - e.getPrice() ;
		this.point = point + e.getPoint();
		
		System.out.println("현재남은돈:"+don);
		System.out.println("현재누적포인트:"+point);
		
	}
	public int getDon() {
		return don;
	}
	public void setDon(int don) {
		this.don = don;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	
}
