package com.jieun.himart;

public class Electronics {
	private int point;
	private int price;
	//Electronics 안에서만 접근이가능 따라서 setter, getter만들어줌
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
