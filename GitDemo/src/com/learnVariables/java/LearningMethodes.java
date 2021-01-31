package com.learnVariables.java;

public class LearningMethodes {

	public static void main(String[] args) {
		printAddition(2, 4);
		printAddition(1, 4);
		printAddition(5, 4);
		printAddition(9, 4);
		LearningMethodes myMethode = new LearningMethodes();
		System.out.println("Result" + myMethode.getMultiplication(2, 6));
		
		System.out.println("Result" + myMethode.getMultiplication(3, 6));
		
		//int dataOutPut = myMethode.getMultiplication(2, 4);

		//System.out.println("Printing Addition for x: Printing Addition for Y:" + dataOutPut);

	}

	// don't return date
	public static void printAddition(int x, int y) {
		int result = x + y;

		System.out.println("Printing Addition for x: " + x + " Y: " + y + " =  " + result);
	}

	// return data
	public int getMultiplication(int x, int y) {

		int data = 0;
		data = x * y;
		//System.out.println(data);
		return data;
	}

}
