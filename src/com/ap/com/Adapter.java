package com.ap.com;

public class Adapter extends Player{
	private Center center=new Center(name);
	public Adapter(String name) {
		super(name);
		center.name=name;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		center.进攻();
		System.out.println("其实我调用的是Center的进攻方法");
	}

	@Override
	public void defense() {
		// TODO Auto-generated method stub
		center.防守();
		System.out.println("其实我调用的是Center的防守方法");
	}

}
