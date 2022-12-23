package edu.kh.poly.model.vo;

public class Spark extends Car {
	
	private double discountOffer;//할인혜택
	
	public Spark() {}//기본생성자 super(); 생략 시 컴파일러가 자동추가

	public Spark(String engine, String fuel, int wheel, double discountOffer) {
		super(engine, fuel, wheel);
		this.discountOffer = discountOffer;
	}

	public double getDiscountOffer() {
		return discountOffer;
	}

	public void setDiscountOffer(double discountOffer) {
		this.discountOffer = discountOffer;
	}
	
	@Override
	public String toString() {
		return super.toString() + " / " + discountOffer;
	}
	
	
}
