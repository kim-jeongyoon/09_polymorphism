package edu.kh.poly.model.vo;

public class Tesla extends Car { //Car을 상속 받을 수 있도록 
	
	private int batteryCapacity; // 배터리 용량
	
	//기본생성자 : ctrl + space + Enter
	public Tesla() { //기본생성자
		super(); // 부모생성자(Car)
	}
	// 매개변수 생성자: alt + shift + o + 드롭박스선택
	
	// getter / setter
	public Tesla(String engine, String fuel, int wheel, int batteryCapacity) {
		super(engine, fuel, wheel);
		this.batteryCapacity = batteryCapacity;
	}

	public int getBatterycapacity() {
		return batteryCapacity;
	}

	public void setBatterycapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}
	
	@Override 
	public String toString() {
		return super.toString() + " / " + batteryCapacity;
		// super. --> 슈퍼참조변수 
		
	}
		
}
