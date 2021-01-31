package com.learnVariables.java;

public class Health {
	public static void main(String[] args) {
		
		System.out.println("Human Age variable value is "+ Human.AGE);
		Human Human1 = new Human();
		Human1.setName("Ahmad");
		//Human1.setAge(18);
		Human1.setHeight(5.1);
		System.out.println("Human Age variable value is "+ Human.AGE);
		
		int num= 60;
		String valueofnum = String.valueOf(num);
		System.out.println(valueofnum);
		
	}
}

