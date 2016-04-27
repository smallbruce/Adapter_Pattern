package com.ap.com;

public class Center {
	protected String name;
	
	public Center(String name){
		this.name=name;
	}
	
	public void 进攻(){
		System.out.println(name+"开始进攻");
	}
	public void 防守(){
		System.out.println(name+"加强防守");
	}
}
