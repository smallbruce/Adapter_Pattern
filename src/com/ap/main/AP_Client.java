package com.ap.main;
import com.ap.com.*;

public class AP_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player pl1=new Gaurd("得分后卫科比");
		
		Player pl2=new Forward("小前锋詹姆斯");
		
		Player pl3=new Adapter("来自中国的中锋姚明");
		
		pl1.attack();
		pl2.defense();
		pl3.attack();
		pl3.defense();
	}

}
