package com.ap.com;

public class Gaurd extends Player {

	public Gaurd(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println(name+"发起进攻");
	}

	@Override
	public void defense() {
		// TODO Auto-generated method stub
		System.out.println(name+"加强防守");
	}

}
